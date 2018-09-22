package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Product;
import com.techlabs.repository.ProductRepository;

@Service("productservice")
public class ProductService {
	@Autowired
	private ProductRepository product_repo;
	//private List<Product> listofproducts = new ArrayList<Product>();

	public ProductService() {

	}

//	public void init() {
//		listofproducts.add(new Product("P101", "laptop", 50000, 5000));
//		listofproducts.add(new Product("P102", "iphone6s", 50000, 100));
//		listofproducts.add(new Product("P103", "iphone7", 2666, 26));
//		listofproducts.add(new Product("P104", "iphone7s", 61616, 151));
//		listofproducts.add(new Product("P105", "iphone8", 48455, 4555));
//		listofproducts.add(new Product("P106", "iphone9", 6262, 655));
//		listofproducts.add(new Product("P107", "DELL Laptop", 51584, 515));
//		listofproducts.add(new Product("P108", "ipad", 84851, 254));
//		listofproducts.add(new Product("P109", "Hp laptop", 611655, 4554));
//		listofproducts.add(new Product("P110", "lenovo laptop", 5484, 14815));
//
//	}

	public List<Product> getAllProducts() {
		return this.product_repo.getAllProducts();
	}

	public Product getProductById(int id) {
		return this.product_repo.getProductById(id);
		
	}

		public ProductRepository getProduct_repo() {
		return product_repo;
	}

	@Autowired
	public void setProduct_repo(ProductRepository product_repo) {
		this.product_repo = product_repo;
	}

	
	
}
