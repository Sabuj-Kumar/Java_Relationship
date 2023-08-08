package com.pringmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pringmapping.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
