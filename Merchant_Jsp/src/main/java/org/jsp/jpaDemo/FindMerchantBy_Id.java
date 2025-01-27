package org.jsp.jpaDemo;

import java.util.Scanner;

import javax.persistence.*;

public class FindMerchantBy_Id {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Merchant id to Find Merchant Info");
		int id=sc.nextInt();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		Merchant m = man.find(Merchant.class, id);
		if(m!=null) {
			System.out.println(m);
		}
		else {
			System.err.println("Merchant not found since id is invalid");
		}
		sc.close();
	}
}
