package com.jspider.OneToOne_Uni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindPerson_ByPhoneNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Phone no");
	long phno=sc.nextLong();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man =fac.createEntityManager();
	
	Query q = man.createNamedQuery("findByPhone");
	q.setParameter(1, phno);
	
	List<Person> p = q.getResultList();
	if(p.size()>0) {
		for(Person per:p) {
			System.out.println(per);
		}
	}
	else {
		System.err.println("No Such Record Exist");
	}
	sc.close();
}
}
