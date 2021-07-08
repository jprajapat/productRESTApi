package com.springboot.application;

//import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.springboot.bean.Product;

@SpringBootApplication
public class ProductRESTApiApplication {

	// private static Scanner sc;

	public static void main(String[] args) {
		// Product product = new Product();
		// sc = new Scanner(System.in);

		SpringApplication.run(ProductRESTApiApplication.class, args);
		System.out.println("Successful Run ");

		/*
		 * System.out.println("Enter Name"); product.setName(sc.next());
		 * System.out.println("Enter Price"); product.setPrice(sc.nextFloat());
		 * System.out.println("Name " + product.getName()); System.out.println("Price "+
		 * product.getPrice());
		 */
	}

}
