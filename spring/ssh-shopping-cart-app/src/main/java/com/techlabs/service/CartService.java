package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Cart;
import com.techlabs.entity.Customers;
import com.techlabs.repository.CartRepository;

@Service("cartservice")
public class CartService {

	@Autowired
	private CartRepository cart_repo;
	private List<Cart> listOfLineItemsincart = new ArrayList<Cart>();

	public CartRepository getCart_repo() {
		return cart_repo;
	}

	@Autowired
	public void setCart_repo(CartRepository cart_repo) {
		this.cart_repo = cart_repo;
	}

	public boolean checklineitemexist(List<Cart> listofproductsincart, int id) {
		if (listofproductsincart == null) {
			return false;
		}
		for (Cart cartitem : listofproductsincart) {
			if (cartitem.getProduct_id() == id) {
				// listOfLineItems.remove(lineitem);
				return true;
			}
		}
		return false;

	}

	public List<Cart> addLineItemInCart(Cart newitemincart,
			List<Cart> listfromsession) {
		List<Cart> updatedlistofLineItems = new ArrayList<Cart>();
		if (listfromsession != null) {
			for (Cart item : listfromsession) {
				updatedlistofLineItems.add(item);
			}
		}
		updatedlistofLineItems.add(newitemincart);
		return updatedlistofLineItems;
	}
	public List<Cart> getListOfCartFromDB(String cust_id){
		return this.cart_repo.getListOfCartFromDB(cust_id);
	}
	public void insertlineitemincarttable(Cart cart,Set<Cart> setofcart,String username,String cust_id){
		cart_repo.insertlineitemincarttable(cart,setofcart, username,cust_id);
		
	}
	public long generateCartId() {
		return Math.abs(UUID.randomUUID().getMostSignificantBits());
	}
	public Customers getCartOfCustomerFromDB(String username){
		return this.cart_repo.getCartOfCustomerFromDB( username);
	}
	public List<Cart> getListOfLineItemsincart() {
		return listOfLineItemsincart;
	}

	public void setListOfLineItemsincart(List<Cart> listOfLineItemsincart) {
		this.listOfLineItemsincart = listOfLineItemsincart;
	}

}
