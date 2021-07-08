package com.springboot.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.application.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
