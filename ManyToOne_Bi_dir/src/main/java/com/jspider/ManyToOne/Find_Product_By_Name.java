package com.jspider.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Product_By_Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Product Name ");
	String pname = sc.nextLine();
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("Select p from Product p where p.name=?1");
	q.setParameter(1, pname);
	List<Product> pr = q.getResultList();
	if(pr.size()>0) {
		for(Product p:pr) {
			System.out.println(p);
		}
	}
	else {
		System.out.println("No Result Found");
	}
	sc.close();
}
}
