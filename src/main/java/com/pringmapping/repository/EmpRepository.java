package com.pringmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pringmapping.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp,Integer> {

}
