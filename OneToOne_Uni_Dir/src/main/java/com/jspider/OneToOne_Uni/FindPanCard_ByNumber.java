package com.jspider.OneToOne_Uni;

import java.util.Scanner;

import javax.persistence.*;

public class FindPanCard_ByNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PanCard No.");
		String  pno = sc.nextLine();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q=man.createNamedQuery("findPanCardBByNo");
		q.setParameter(1,pno);
		
		try {
			PanCard pc = (PanCard)q.getSingleResult();
			System.out.println(pc);
		}
		catch(NoResultException e) {
			System.out.println("Invalid Crendentials");
		}
	}
}
