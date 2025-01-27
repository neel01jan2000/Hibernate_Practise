package com.jspider.OneToMany;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Department_By_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the department id to know about Department");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Department dt = man.find(Department.class, id);
	if(dt!=null) {
		System.out.println(dt);
	}
	else {
		System.out.println("NO Information found");
	}
	sc.close();
	
	
}
}
