package com.jspider.ManyToMany;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Batch_By_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Batch Id");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Batch b = man.find(Batch.class,id);
	if(b!=null) {
		System.out.println(b);
	}
	else {
		System.out.println("No result found");
	}
	sc.close();
}
}
