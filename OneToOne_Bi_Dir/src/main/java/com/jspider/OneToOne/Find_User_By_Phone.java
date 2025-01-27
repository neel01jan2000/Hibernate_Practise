package com.jspider.OneToOne;

import java.util.Scanner;

import javax.persistence.*;


public class Find_User_By_Phone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user Phone no");
		long number = sc.nextLong();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q = man.createQuery("select u from User u where u.phone=?1");
		q.setParameter(1,number);
		
		try {
			User usr = (User)q.getSingleResult();
			System.out.println(usr);
		}
		catch(NoResultException e) {
			System.out.println("No result found");
		}
		
		sc.close();
	}
}
