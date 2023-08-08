package com.pringmapping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pringmapping.entity.Category;
import com.pringmapping.entity.Product;
import com.pringmapping.repository.AddressRepository;
import com.pringmapping.repository.CategoryRepository;
import com.pringmapping.repository.EmpRepository;
import com.pringmapping.repository.MobileRepository;
import com.pringmapping.repository.ProductRepository;

@SpringBootApplication
public class SpringJpaMappingApplication implements CommandLineRunner {

	@Autowired
	EmpRepository empRepo;

	@Autowired
	MobileRepository mobileRepo;

	@Autowired
	AddressRepository addressRepo;
	
	@Autowired
	CategoryRepository categoryRepo;
	
	@Autowired
	ProductRepository productRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
//		 Emp emp = new Emp();
//		 emp.setEmpName("Sabuj"); 
//		 Mobile mobile = new Mobile();
//		 mobile.setMobileName("Shawmi note 4"); 
//		 //emp.setMobile(mobile);
//		 mobile.setEmp(emp);
//		 empRepo.save(emp);
//		 mobileRepo.save(mobile);
		
		 
//		Emp emp = empRepo.findById(1).get();
//		
//		System.out.println(emp.getEmpName());
//		System.out.println(emp.getMobile().getMobileName());
//		
//		Mobile mobile = mobileRepo.findById(3).get();
//		
//		System.out.println(mobile.getMobileName());
//		System.out.println(mobile.getEmp().getEmpName());
	// many to many and one to many
//	Emp emp = new Emp();
//	emp.setEmpName("Nice person");
//	
//	Address add1 = new Address();
//	add1.setAddress("Bangladesh");
//	add1.setType("permanent address");
//	add1.setEmp(emp);
//	
//	Address add2 = new Address();
//	add2.setAddress("Pakistan");
//	add2.setType("Temporary address");
//	add2.setEmp(emp);
//	
//	List<Address> addressList = Arrays.asList(add1,add2);
//	
//	emp.setAddress(addressList);
//	
//	empRepo.save(emp);
//	Emp emp = empRepo.findById(16).get();
//	
//	System.out.println(emp.getEmpName());
//	emp.getAddress().forEach(e ->System.out.println(e.getAddress()+e.getType()));
	
//	Address address = addressRepo.findById(21).get();
//	
//	System.out.println(address.getAddress()+" "+address.getType());
//	System.out.println(address.getEmp().getEmpName());
//		Category ct1 = new Category();
//		Category ct2 = new Category();
//		
//		Product pt1 = new Product();
//		Product pt2 = new Product();
//		Product pt3 = new Product();
//		
//		ct1.setCategoryName("Electronics");
//		ct2.setCategoryName("Mobile");
//		
//		pt1.setProductName("Tv");
//		pt2.setProductName("One Plus");
//		pt3.setProductName("Samsung");
//		
//		ct1.getProductList().add(pt1);
//		ct1.getProductList().add(pt2);
//		ct1.getProductList().add(pt3);
//		
//		ct2.getProductList().add(pt2);
//		ct2.getProductList().add(pt3);
//		
//		pt1.getCategoryList().add(ct1);
//		pt2.getCategoryList().add(ct1);
//		pt3.getCategoryList().add(ct1);
//		
//		pt2.getCategoryList().add(ct2);
//		pt3.getCategoryList().add(ct2);
//		
//		categoryRepo.save(ct1);
//		categoryRepo.save(ct2);
		
		Category ct = categoryRepo.findById(2).get();
		System.out.println(ct.getCategoryName());
		ct.getProductList().forEach(e ->System.out.println(e.getProductName()));
		
		Product pt = productRepo.findById(1).get();
		System.out.println(pt.getProductName());
		pt.getCategoryList().forEach(e ->System.out.println(e.getCategoryName()));
		
	}
}
