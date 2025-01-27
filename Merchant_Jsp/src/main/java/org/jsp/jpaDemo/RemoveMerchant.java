package org.jsp.jpaDemo;

import java.util.Scanner;

import javax.persistence.*;

public class RemoveMerchant {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Merchant id to remove merchant");
		int id=sc.nextInt();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		
		tran.begin();
		Merchant m1 = man.find(Merchant.class, id);
		Merchant m = man.find(Merchant.class,id);
		if(m!=null) {
			System.out.println(m1 +"is removed");
			man.remove(m);
			tran.commit();
		}
		else {
			System.err.println("Merchant is not removed as id is invalid");
			
		}
		sc.close();
	}
}
