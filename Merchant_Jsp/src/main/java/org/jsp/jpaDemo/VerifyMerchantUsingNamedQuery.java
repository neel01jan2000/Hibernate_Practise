package org.jsp.jpaDemo;

import java.util.Scanner;

import javax.persistence.*;
import javax.persistence.Persistence;

public class VerifyMerchantUsingNamedQuery {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phone no");
		long ph = sc.nextLong();
		
		System.out.println("Enter password");
		String pw=sc.next();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q=man.createNamedQuery("verifyMerchant");
		q.setParameter(1, ph);
		q.setParameter(2,pw);
		
		try {
			Merchant m=(Merchant)q.getSingleResult();
			System.out.println(m);
		}
		catch(NoResultException e) {
			System.out.println("Invalid Credentials");
		}
		sc.close();
	}
}
