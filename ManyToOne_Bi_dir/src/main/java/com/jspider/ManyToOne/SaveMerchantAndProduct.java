package com.jspider.ManyToOne;

import java.util.Arrays;

import javax.persistence.*;

public class SaveMerchantAndProduct {
public static void main(String[] args) {
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	
	tran.begin();
	Merchant m = new Merchant();
	m.setName("Guru");
	m.setGst_number("ABCD1234");
	m.setPhone(983039303);
	m.setPassword("Gure1234");
	
	Product p1 = new Product();
	p1.setName("Mobile");
	p1.setBrand("Electronic");
	p1.setCategory("Electronic");
	p1.setMerchant(m);
	
	Product p2 = new Product();
	p2.setName("TV");
	p2.setBrand("Samsung");
	p2.setCategory("Electronic");
	p2.setMerchant(m);
	
	Product p3 = new Product();
	p3.setName("Fan");
	p3.setBrand("Usha");
	p3.setCategory("Electronic");
	p3.setMerchant(m);
	
	m.setProducts(Arrays.asList(p1,p2,p3));
	man.persist(m);
	tran.commit();
}
}
