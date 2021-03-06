package com.techlabs.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.LineItem;
import com.techlabs.model.Product;
import com.techlabs.service.LineItemService;
import com.techlabs.service.ProductService;
import com.techlabs.viewmodel.AddProductVM;

public class AddProductAction extends ActionSupport implements
		ModelDriven<AddProductVM>, SessionAware {
	private AddProductVM productbeam = new AddProductVM();
	private ProductService productservice = ProductService.getInstanceOf();
	private LineItemService lineitemservice = new LineItemService();
	private List<LineItem> listoflineitem = new ArrayList<LineItem>();

	private SessionMap<String, Object> sessionmap;

	@Override
	public String execute() throws Exception {
		System.out.println("inside get");
		List<Product> listofallproducts = productservice.getAllProducts();
		productbeam.setoptions(listofallproducts);
		HashMap<LineItem, Product> hashproductsincart = new HashMap<LineItem, Product>();
		listoflineitem = (List<LineItem>) sessionmap.get("listoflineitem");
		if (listoflineitem==null) {
			return "success";
		}else{
			lineitemservice.setListOfLineItems(listoflineitem);
			productbeam
					.setListofproductsincart(getlistofproductisncart(hashproductsincart));
		}
		return "success";
	}

	private List<Map<LineItem, Product>> getlistofproductisncart(
			HashMap<LineItem, Product> hashproductsincart) {
		for (LineItem lineitem : listoflineitem) {
			hashproductsincart.put(lineitem,
					productservice.getProductById(lineitem.getProduct_id()));

		}
		List<Map<LineItem, Product>> listofproductsincart = new ArrayList<Map<LineItem, Product>>();

		for (Map.Entry<LineItem, Product> entry : hashproductsincart.entrySet()) {
			HashMap<LineItem, Product> map = new HashMap<LineItem, Product>();
			map.put(entry.getKey(), entry.getValue());
			listofproductsincart.add(map);
		}
		return listofproductsincart;
	}

	@SuppressWarnings("unchecked")
	public String executePost() {
		System.out.println("post");

		HashMap<LineItem, Product> hashproductsincart = new HashMap<LineItem, Product>();
		List<LineItem> listoflineitemfromsession = (List<LineItem>) sessionmap.get("listoflineitem");

		System.out.println(listoflineitemfromsession);
		if(listoflineitemfromsession==null){
			System.out.println("inside if");
			addtolineitem();
		}
		else if (!lineitemservice.checklineitemexist(listoflineitemfromsession, productbeam.getId())) {
			System.out.println("inside else if");
			for(LineItem lineitem:listoflineitemfromsession){
				lineitemservice.addLineItem(lineitem);
				
			}
			addtolineitem();
		}
		return "showcart";
	}

	private void addtolineitem() {
		
		lineitemservice.generateLineItemId();

		Product product = productservice
				.getProductById(productbeam.getId());
		productbeam.setCost(product.getCost());
		lineitemservice.addLineItem(new LineItem(lineitemservice
				.generateLineItemId(), productbeam.getQuantity(),
				productbeam.getQuantity() * productbeam.getCost(),
				productbeam.getId()));
		
		
		

		sessionmap.put("listoflineitem", lineitemservice.getAllLineItem());
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

	public List<LineItem> getListoflineitem() {
		return listoflineitem;
	}

	public void setListoflineitem(List<LineItem> listoflineitem) {
		this.listoflineitem = listoflineitem;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionmap = (SessionMap<String, Object>) session;

	}

}
