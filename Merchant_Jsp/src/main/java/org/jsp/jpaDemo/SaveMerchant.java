package org.jsp.jpaDemo;

import java.util.Scanner;

import javax.persistence.*;

public class SaveMerchant {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Merchant name");
	String nam = sc.nextLine();
	
	System.out.println("Enter GST no");
	String gst = sc.nextLine();
	
	System.out.println("Enter email id");
	String email = sc.nextLine();
	
	System.out.println("Enter password");
	String pass = sc.nextLine();
	
	System.out.println("Enter Phone no.");
	long no = sc.nextLong();
	
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man=fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	tran.begin();
	Merchant m=new Merchant();
	m.setName(nam);
	m.setPhoneNo(no);
	m.setGstNo(gst);
	m.setEmail(email);
	m.setPassword(pass);
	
	man.persist(m);
	tran.commit();
	
	sc.close();
}
}
