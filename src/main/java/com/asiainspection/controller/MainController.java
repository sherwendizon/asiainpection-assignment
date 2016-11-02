package com.asiainspection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.asiainspection.dao.ProductsDao;
import com.asiainspection.dao.UserDao;
import com.asiainspection.model.Product;
import com.asiainspection.model.User;

@Controller
public class MainController {
	
	@Autowired
	private ProductsDao productsDao;
	
	@Autowired
	private UserDao userDao;	

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView initLogin() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submitLogin(@ModelAttribute("user") User user) {
		ModelAndView modelAndView = new ModelAndView();
		if (user != null) {
			if ((user.getUsername() != null && !user.getUsername().isEmpty())
					&& (user.getPassword() != null && !user.getPassword().isEmpty())) {

			    if(userDao.getUserIdByUsernameAndPassword(user.getUsername(), user.getPassword()) != 0) {
			    	modelAndView.setViewName("home");
			    	modelAndView.addObject("username", user.getUsername());
			    } else {
			    	modelAndView.setViewName("login");
			    	modelAndView.addObject("errormessage", "Invalid Credentials. Please try again.");
			    }
			
			}
		}

		return modelAndView;
	}
	
	@RequestMapping(value = "/addproduct")
	public ModelAndView addProductForm() {
		ModelAndView modelAndView = new ModelAndView("addproduct", "command", new Product());
		return modelAndView;
	}
	
	@RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
	public ModelAndView saveproduct(@ModelAttribute("product")Product product) {
		ModelAndView modelAndView = new ModelAndView("redirect:/productlist");
		productsDao.addProduct(product);
		return modelAndView;
	}	

	@RequestMapping(value = "/editproduct/{product_id}")
	public ModelAndView editProduct(@PathVariable int product_id) {
		Product product = productsDao.getProductById(product_id);
		return new ModelAndView("editproduct", "command", product);
	}
	
	@RequestMapping(value = "/editedproduct", method = RequestMethod.POST)
	public ModelAndView saveEditedProduct(@ModelAttribute("product")Product product) {
		ModelAndView modelAndView = new ModelAndView("redirect:/productlist");
		productsDao.editProduct(product);
		return modelAndView;
	}
	
	@RequestMapping(value = "/deleteproduct/{product_id}", method = RequestMethod.GET)
	public ModelAndView saveEditedProduct(@PathVariable int product_id) {
		ModelAndView modelAndView = new ModelAndView("redirect:/productlist");
		productsDao.deleteProduct(product_id);
		return modelAndView;
	}
	
	@RequestMapping(value = "/productlist")
	public ModelAndView productList() {
		ModelAndView modelAndView = new ModelAndView("productlist");
		List<Product> list = productsDao.getAllProducts();
		modelAndView.addObject("list", list);
		return modelAndView;
	}
}
