package com.asiainspection.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.asiainspection.dao.ProductsDao;
import com.asiainspection.mapper.Mapper;
import com.asiainspection.model.Product;

public class ProductsDaoImpl implements ProductsDao {

	@Autowired
	private Mapper mapper;

	public void addProduct(Product product) {
		mapper.addProduct(product.getName(), product.getDescription(), product.getPrice(), product.getCategory(),
				product.getCategoryPath(), product.getSupplier());
	}

	public void editProduct(Product product) {
		mapper.editProduct(product.getProduct_id(), product.getName(), product.getDescription(), product.getPrice(),
				product.getCategory(), product.getCategoryPath(), product.getSupplier());
	}

	public void deleteProduct(int productId) {
		mapper.deleteProduct(productId);
	}

	public Product getProductById(int productId) {
		return mapper.getProductById(productId);
	}

	public List<Product> getAllProducts() {
		return mapper.getAllProducts();
	}

	public List<Product> getAllProductByUserId(int userId) {
		return mapper.getAllProductByUserId(userId);
	}

}
