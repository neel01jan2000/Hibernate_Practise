package com.jspider.ManyToOne;

import java.util.Scanner;

import javax.persistence.*;


public class Find_AnswerData_By_Id {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter answer id");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man=fac.createEntityManager();
	
	AnswerData as = man.find(AnswerData.class, id);
	if(as!=null) {
		System.out.println(as);
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
