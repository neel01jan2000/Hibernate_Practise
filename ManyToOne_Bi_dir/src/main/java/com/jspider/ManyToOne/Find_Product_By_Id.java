package com.jspider.ManyToOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Find_Product_By_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Product id ");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	Product p = man.find(Product.class, id);
	
	if(p!=null) {
		System.out.println(p);
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
