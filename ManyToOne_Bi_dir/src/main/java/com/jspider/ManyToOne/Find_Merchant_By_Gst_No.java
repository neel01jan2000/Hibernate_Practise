package com.jspider.ManyToOne;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Merchant_By_Gst_No {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Merchant GST no");
		String gst = sc.nextLine();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q = man.createQuery("Select m from Merchant m where m.gst_number=?1");
		q.setParameter(1, gst);
		
		try {
			Merchant mer = (Merchant)q.getSingleResult();
			System.out.println(mer);
		}
		catch(NoResultException e) {
			System.out.println("No Result found");
		}
		sc.close();

	}
}
