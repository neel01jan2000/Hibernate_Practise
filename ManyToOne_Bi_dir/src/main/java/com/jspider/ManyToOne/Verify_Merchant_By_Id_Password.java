package com.jspider.ManyToOne;

import java.util.Scanner;

import javax.persistence.*;

public class Verify_Merchant_By_Id_Password {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Merchant id");
	int id = sc.nextInt();
	System.out.println("Enter Merchant password");
	String pass =sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("select m from Merchant m where m.id=?1 and m.password=?2");
	q.setParameter(1, id);
	q.setParameter(2, pass);
	
	try {
		Merchant mer = (Merchant)q.getSingleResult();
		System.out.println(mer);
	}
	catch(NoResultException e) {
		System.out.println("No result found");
	}
	sc.close();
}
}
