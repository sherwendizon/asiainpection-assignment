package com.asiainspection.dao;

import java.util.List;

import com.asiainspection.model.Product;

public interface ProductsDao {
	
	public void addProduct(Product product);
	
	public void editProduct(Product product);
	
	public void deleteProduct(int productId);
	
	public Product getProductById(int productId);
	
	public List<Product> getAllProducts();
	
	public List<Product> getAllProductByUserId(int userId);

}
