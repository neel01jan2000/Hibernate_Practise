package com.jspider.ManyToOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Find_Question_By_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Question ID");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	QuestionData qd = man.find(QuestionData.class, id);
	if(qd!=null) {
		System.out.println(qd);
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
