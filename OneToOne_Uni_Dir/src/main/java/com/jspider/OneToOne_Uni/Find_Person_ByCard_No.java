package com.jspider.OneToOne_Uni;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Person_ByCard_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PanCard number");
		String cno=sc.nextLine();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q=man.createNamedQuery("findPersonByCardNo");
		q.setParameter(1,cno);
		
		try {
			Person per =(Person)q.getSingleResult();
			System.out.println(per);
		}
		catch(NoResultException e) {
			System.out.println("Invalid Credentials");
		}
		sc.close();
	}
}
