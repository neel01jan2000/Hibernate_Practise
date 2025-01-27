package com.jspider.OneToOne;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Aadhar_By_User_PhoneNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter User phone");
	long phno = sc.nextLong();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("select a from AadharCard a where a.user.phone=?1");
	q.setParameter(1,phno);
	
	try {
		AadharCard adr = (AadharCard)q.getSingleResult();
		System.out.println(adr);
	}
	catch(NoResultException e) {
		System.out.println("No Result Found");
	}
	
	
	
	
	
	
	sc.close();
}
}
