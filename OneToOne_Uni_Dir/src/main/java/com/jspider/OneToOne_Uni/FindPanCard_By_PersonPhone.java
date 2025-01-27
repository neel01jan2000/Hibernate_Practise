package com.jspider.OneToOne_Uni;

import java.util.Scanner;

import javax.persistence.*;

public class FindPanCard_By_PersonPhone {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Phone no");
	long phno = sc.nextLong();
	
	EntityManagerFactory fac =Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q=man.createNamedQuery("findCardByPersonPhone");
	q.setParameter(1,phno);
	
	try {
		PanCard pc=(PanCard)q.getSingleResult();
		System.out.println(pc);
	}
	catch(NoResultException e) {
		System.out.println("Invalid Crediential");
	}
	sc.close();
} 
}
