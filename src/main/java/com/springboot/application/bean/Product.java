package com.springboot.application.bean;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String name;
	private float price;
    
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(Integer id, String name, float price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
    
}
