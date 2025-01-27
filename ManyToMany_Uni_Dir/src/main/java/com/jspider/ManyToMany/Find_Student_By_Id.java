package com.jspider.ManyToMany;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Student_By_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student id");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Student st = man.find(Student.class, id);
	if(st!=null) {
		System.out.println(st);
	}
	else {
		System.out.println("No Result Found");
	}
	sc.close();
}
}
