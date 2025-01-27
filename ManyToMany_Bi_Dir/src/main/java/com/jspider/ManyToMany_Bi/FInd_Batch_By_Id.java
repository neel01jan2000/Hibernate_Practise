package com.jspider.ManyToMany_Bi;

import java.util.Scanner;

import javax.persistence.*;

public class FInd_Batch_By_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Batch id");
	int id = sc.nextInt();
	
	EntityManagerFactory fac =Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Batch bt = man.find(Batch.class, id);
	if(bt!=null) {
		System.out.println(bt);
	}
	else {
		System.out.println("No Result found");
		
	}
	sc.close();

}
}
