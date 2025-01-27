package com.jspider.OneToOne;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Aadhar_By_User_Name_and_PhoneNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter User Name");
		String name = sc.nextLine();
		
		System.out.println("Enter User phone No");
		long phno = sc.nextLong();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q = man.createQuery("select a from AadharCard a where a.user.name=?1 and a.user.phone=?2");
		q.setParameter(1, name);
		q.setParameter(2,phno);
		
		try {
			AadharCard ad = (AadharCard)q.getSingleResult();
			System.out.println(ad);
		}
		catch(NoResultException e) {
			System.err.println("No Result Matching");
		}
			
		sc.close();
	}
}
