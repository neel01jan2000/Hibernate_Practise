package com.jspider.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Product_By_Merchant_Phone_Password {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Merchant Phone");
	long phone = sc.nextLong();
	sc.nextLine();
	System.out.println("Enter Merchant Password");
	String pass  =sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("select m.products from Merchant m where m.phone=?1 and m.password=?2");
	q.setParameter(1, phone);
	q.setParameter(2, pass);
	
	
	List<Product> pd = q.getResultList();
	if(pd.size()>0) {
		for(Product pds : pd) {
			System.out.println(pds);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
