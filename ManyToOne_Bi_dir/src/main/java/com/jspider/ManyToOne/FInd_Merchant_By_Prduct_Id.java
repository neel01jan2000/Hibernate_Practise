package com.jspider.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FInd_Merchant_By_Prduct_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Product id");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	Query q = man.createQuery("select p.merchant from Product p where p.id=?1");
	q.setParameter(1, id);
	
	List<Merchant> mer = q.getResultList();
	if(mer.size()>0) {
		for(Merchant m :mer) {
			System.out.println(m);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
