package com.pringmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pringmapping.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
