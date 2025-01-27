package com.jspider.OneToMany;

import java.util.Scanner;

import javax.persistence.*;


public class Find_Employee_By_Id {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in );
	System.out.println("Enter Employee Id");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Employee e = man.find(Employee.class,id);
	if(e!=null) {
		System.out.println(e);
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
