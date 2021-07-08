package com.springboot.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.application.bean.Product;
import com.springboot.application.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	
	public List<Product> listAll() {
		return repo.findAll();
	}

	public void save(Product product) {
		repo.save(product);
	}

	public Product get(Integer id) {
		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public void saveProduct(Product product) {
		repo.save(product);
		
	}
	
}
