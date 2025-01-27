package com.jspider.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FInd_Product_By_Merchant_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Merchant id");
	int id=sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("select m.products from Merchant m where m.id=?1");
	q.setParameter(1, id);
	
	List<Product> pd = q.getResultList();
	if(pd.size()>0) {
		for(Product pds : pd) {
			System.out.println(pds);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
