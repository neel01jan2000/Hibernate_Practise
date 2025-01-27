package com.jspider.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Product_By_Merchant_GstNO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Merchant GST No");
		String gst = sc.nextLine();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q =man.createQuery("Select m.products from Merchant m where m.gst_number=?1");
		q.setParameter(1, gst);
		
		List<Product> pr = q.getResultList();
		if(pr.size()>0) {
			for(Product p:pr) {
				System.out.println(p);
			}
		}
		else {
			System.out.println("No Result found");
		}
		sc.close();
	}
}
