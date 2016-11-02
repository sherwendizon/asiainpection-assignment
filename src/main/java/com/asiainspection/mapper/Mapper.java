package com.asiainspection.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainspection.model.Product;

public interface Mapper {

	public void addProduct(@Param("name") String name, @Param("description") String description,
			@Param("price") String price, @Param("category") String category,
			@Param("category_path") String categoryPath, @Param("supplier") String supplier);

	public void editProduct(@Param("product_id") int productId,@Param("name") String name, @Param("description") String description,
			@Param("price") String price, @Param("category") String category,
			@Param("category_path") String categoryPath, @Param("supplier") String supplier);

	public void deleteProduct(@Param("product_id") int productId);

	public Product getProductById(@Param("product_id") int productId);

	public List<Product> getAllProducts();

	public List<Product> getAllProductByUserId(@Param("user_id") int userId);
	
	public int getUserIdByUsernameAndPassword(@Param("username")String username, @Param("password")String password);
	
	public String getUserAuthorityByUsernameAndPassword(@Param("username")String username, @Param("password")String password);	

}
