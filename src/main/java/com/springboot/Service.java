package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class Service {

	@Autowired
	private UserRepository repository;

	public Electronics addProduct(@RequestBody Electronics product) {
		return repository.save(product);
	}

	public List<Electronics> getProducts() {
		return repository.findAll();
	}

}
