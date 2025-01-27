package com.jspider.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Merchant_By_Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Merchant name");
	String name = sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("select m from Merchant m where m.name=?1");
	q.setParameter(1, name);
	
	List<Merchant> mer = q.getResultList();
	if(mer.size()>0) {
		for(Merchant m : mer) {
			System.out.println(m);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
