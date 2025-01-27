package com.jspider.OneToOne_Uni;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Person_ByPanCard_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Pancard Id");
	int id =sc.nextInt();
	
	EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q=man.createNamedQuery("findPersonByCardId");
	q.setParameter(1,id);
	
	try {
		Person per=(Person)q.getSingleResult();
		System.out.println(per);
	}
	catch(NoResultException e) {
		System.out.println("Invalid Credential");
	}
	sc.close();
}
}
