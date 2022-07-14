package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private Service service;

	@RequestMapping(method = RequestMethod.POST, value = "/product")
	public Electronics addEProduct(@RequestBody Electronics product) {
		return service.addProduct(product);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public List<Electronics> getEProducts() {
		return service.getProducts();
	}

}
