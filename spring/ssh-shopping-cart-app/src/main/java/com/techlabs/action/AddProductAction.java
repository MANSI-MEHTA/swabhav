package com.techlabs.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Cart;
import com.techlabs.entity.Customers;
import com.techlabs.entity.Product;
import com.techlabs.service.CartService;
import com.techlabs.service.CustomerService;
import com.techlabs.service.LineItemService;
import com.techlabs.service.ProductService;
import com.techlabs.viewmodel.AddProductVM;

@SuppressWarnings("serial")
public class AddProductAction extends ActionSupport implements
		ModelDriven<AddProductVM> {
	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());
	private AddProductVM productbeam = new AddProductVM();
	private ProductService productservice = (ProductService) context
			.getBean("productservice");
	private LineItemService lineitemservice = (LineItemService) context
			.getBean("lineitemservice");
	private CustomerService customerservice = (CustomerService) context
			.getBean("customerservice");
	private CartService cartservice = (CartService) context
			.getBean("cartservice");
	private HttpSession session;

	private List<Product> listofallproducts = null;;

	@SuppressWarnings("unchecked")
	@Override
	public String execute() {
		System.out.println("inside get");
		listofallproducts = productservice.getAllProducts();
		productbeam.setoptions(listofallproducts);

		session = ServletActionContext.getRequest().getSession();
		String username = (String) session.getAttribute("username");
		System.out.println(username);
		String cust_id = (String) session.getAttribute("cust_id");

		cust_id = customerservice.getCustomerId(username);
		session.setAttribute("cust_id", cust_id);
		System.out.println(cust_id);

		System.out.println("after if ");

		List<Cart> listoflineitemincart = (List<Cart>) session
				.getAttribute("listoflineitemincart");
		System.out.println(listoflineitemincart);
		if (listoflineitemincart == null) {
			List<Cart> listofcartfromdb = (List<Cart>) cartservice
					.getListOfCartFromDB((String) session
							.getAttribute("cust_id"));
			System.out.println(listofcartfromdb);
			session.setAttribute("listoflineitemincart", listofcartfromdb);
			listoflineitemincart = (List<Cart>) session
					.getAttribute("listoflineitemincart");
			System.out.println(listoflineitemincart);
			if (listoflineitemincart != null) {
				productbeam
						.setListofproductsincart(getlistofproductsincart(listoflineitemincart));
			}
			System.out
					.println("inside if of checking listoflineitemincart is null");
			return "success";
		} else {
			cartservice.setListOfLineItemsincart(listoflineitemincart);
			System.out
					.println("inside else of checking listoflineitemincart is null");
			productbeam
					.setListofproductsincart(getlistofproductsincart(listoflineitemincart));
		}
		System.out.println("return success");
		return "success";
	}

	private List<Map<Cart, Product>> getlistofproductsincart(
			List<Cart> listoflineitemincart) {
		HashMap<Cart, Product> hashproductsincart = new HashMap<Cart, Product>();
		for (Cart cartitem : listoflineitemincart) {
			hashproductsincart.put(cartitem,
					productservice.getProductById(cartitem.getProduct_id()));

		}
		List<Map<Cart, Product>> listofproductsincart = new ArrayList<Map<Cart, Product>>();
		System.out.println("in get method");
		for (Map.Entry<Cart, Product> entry : hashproductsincart.entrySet()) {
			HashMap<Cart, Product> map = new HashMap<Cart, Product>();
			map.put(entry.getKey(), entry.getValue());
			listofproductsincart.add(map);
		}
		return listofproductsincart;
	}

	@SuppressWarnings("unchecked")
	public String executePost() {
		System.out.println("inside post");
		session = ServletActionContext.getRequest().getSession();
		List<Cart> listoflineitemincartfromsession = (List<Cart>) session
				.getAttribute("listoflineitemincart");

		System.out.println(listoflineitemincartfromsession);
		if (listoflineitemincartfromsession == null) {
			System.out.println("inside if");
			addtolineitem();
		} else if (!cartservice.checklineitemexist(
				listoflineitemincartfromsession, productbeam.getId())) {
			System.out.println("inside else if");
			addtolineitem();
		}
		return "showcart";
	}

	@SuppressWarnings("unchecked")
	private void addtolineitem() {

		Product product = productservice.getProductById(productbeam.getId());
		Customers customer = cartservice
				.getCartOfCustomerFromDB((String) session
						.getAttribute("username"));
		Cart cart = new Cart(cartservice.generateCartId(),
				productbeam.getQuantity(), productbeam.getId(), customer);

		List<Cart> updatedlistofLineItemsincart = cartservice
				.addLineItemInCart(cart, (List<Cart>) session
						.getAttribute("listoflineitemincart"));
		Set<Cart> setofcart = new HashSet<Cart>(updatedlistofLineItemsincart);
		customer.setCart(setofcart);
		System.out.println("displaying set " + setofcart);

		System.out.println("\ncustomer id is "
				+ (String) session.getAttribute("cust_id"));
		cartservice.insertlineitemincarttable(cart, setofcart,
				(String) session.getAttribute("username"),
				(String) session.getAttribute("cust_id"));
		// cartservice.getListOfCartFromDB(customer.getCust_id());

		session.setAttribute("listoflineitemincart",
				updatedlistofLineItemsincart);
	}

	public void validate() {

	}

	@Override
	public AddProductVM getModel() {
		return productbeam;
	}

	public AddProductVM getProductbeam() {
		return productbeam;
	}

	public void setProductbeam(AddProductVM productbeam) {
		this.productbeam = productbeam;
	}

	public ProductService getProductservice() {
		return productservice;
	}

	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}

	public LineItemService getLineitemsevice() {
		return lineitemservice;
	}

	public void setLineitemsevice(LineItemService lineitemsevice) {
		this.lineitemservice = lineitemsevice;
	}

	public LineItemService getLineitemservice() {
		return lineitemservice;
	}

	public void setLineitemservice(LineItemService lineitemservice) {
		this.lineitemservice = lineitemservice;
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

}
