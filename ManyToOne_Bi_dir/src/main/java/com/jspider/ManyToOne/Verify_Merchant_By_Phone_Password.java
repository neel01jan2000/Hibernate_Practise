package com.jspider.ManyToOne;

import java.util.Scanner;

import javax.persistence.*;

public class Verify_Merchant_By_Phone_Password {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Phone No.");
	long phn = sc.nextLong();
	sc.nextLine();
	System.out.println("Enter Password");
	String paswd = sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("select m from Merchant m where m.phone=?1 and m.password=?2");
	q.setParameter(1, phn);
	q.setParameter(2, paswd);
	
	try {
		Merchant mer =(Merchant)q.getSingleResult();
		System.out.println(mer);
	}
	catch(NoResultException e) {
		System.out.println("No Result Found");
	}
	sc.close();
}
}
