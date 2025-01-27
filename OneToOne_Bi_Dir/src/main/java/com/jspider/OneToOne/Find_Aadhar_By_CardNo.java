package com.jspider.OneToOne;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Aadhar_By_CardNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Aadhar card Number");
	long adrno = sc.nextLong();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man =fac.createEntityManager();
	
	Query q = man.createQuery("Select a from AadharCard a where a.number=?1");
	q.setParameter(1, adrno);
	
	try {
		AadharCard ad = (AadharCard)q.getSingleResult();
		System.out.println(ad);
	}
	catch(NoResultException e) {
		System.out.println("No Result found");
	}
	sc.close();
}
}
