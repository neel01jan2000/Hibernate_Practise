package com.jspider.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Product_By_Merchant_Id_Password {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Merchant id");
	int id = sc.nextInt();
	System.out.println("Enter Merchant Password");
	String pass = sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q =man.createQuery("Select m.products from Merchant where m.id=?1 and m.password=?2");
	q.setParameter(1, id);
	q.setParameter(2, pass);
	
	List<Product> pr = q.getResultList();
	if(pr.size()>0) {
		for(Product p:pr) {
			System.out.println(p);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
