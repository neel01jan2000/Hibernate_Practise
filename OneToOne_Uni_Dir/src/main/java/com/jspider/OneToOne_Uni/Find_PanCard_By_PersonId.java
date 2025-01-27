package com.jspider.OneToOne_Uni;

import java.util.Scanner;

import javax.persistence.*;

public class Find_PanCard_By_PersonId {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Person id");
	int id=sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man =fac.createEntityManager();
	
	Query q=man.createNamedQuery("findCardByPersonID");
	q.setParameter(1,id);
	
	try {
		PanCard pc=(PanCard)q.getSingleResult();
		System.out.println(pc);
	}
	catch(NoResultException e) {
		System.out.println("Invlid Crendentials");
	}
	sc.close(); 
}

}
