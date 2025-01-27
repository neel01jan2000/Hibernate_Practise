package org.jsp.jpaDemo;

import java.util.Scanner;
import javax.persistence.*;

public class UpdateMerchantBy_FetchAndUpdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Merchant id to Update");
		int id = sc.nextInt();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		Merchant m = man.find(Merchant.class,id);
		if(m!=null) {
			m.setName("Aditya");
			m.setEmail("aditya@gmail.com");
			m.setGstNo("DKDN837DK");
			tran.commit();
		}
		else {
			System.err.println("Merchant is not updated since id is invalid");
		}
		sc.close();
	}
}

