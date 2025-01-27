package com.jspider.OneToOne;

import java.util.Scanner;

import javax.persistence.*;

public class Find_User_By_Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter user name");
	String name=sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("select u from User u where u.name=?1");
	q.setParameter(1,name);
	
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
