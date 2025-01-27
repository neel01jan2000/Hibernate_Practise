package com.jspider.OneToOne_Uni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;


public class FindPersonBy_Name {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Person Name");
	String name = sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createNamedQuery("findByName");
	q.setParameter(1,name);

	List<Person> p =q.getResultList();
	if(p.size()>0) {
		for(Person per : p) {
			System.out.println(per);
		}
	}
	else {
		System.out.println("No Such Record Exist");
	}

	sc.close();
}
}
