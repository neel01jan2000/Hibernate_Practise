package com.jspider.OneToOne;

import java.util.Scanner;

import javax.persistence.*;

public class SaveUserAndAadharCard {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter User name");
	String name=sc.nextLine();
	
	System.out.println("Enter User Phone no");
	long phone = sc.nextLong();
	
	System.out.println("Enter Aadhar card no.");
	long aadharno = sc.nextLong();
	sc.nextLine();
	System.out.println("Enter address");
	String addres=sc.nextLine();
	
	
	
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	
	tran.begin();
	User u = new User();
	u.setName(name);
	u.setPhone(phone);
	
	AadharCard card = new AadharCard();
	card.setNumber(aadharno);
	card.setAddress(addres);
	card.setUser(u);
	u.setCard(card);
	
	man.persist(u);
	tran.commit();
	sc.close();
}
}
