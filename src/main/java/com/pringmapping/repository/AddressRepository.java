package com.pringmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pringmapping.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
