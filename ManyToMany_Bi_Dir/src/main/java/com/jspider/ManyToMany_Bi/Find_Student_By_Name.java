package com.jspider.ManyToMany_Bi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Student_By_Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student name");
	String nme = sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("Select s from Student s where s.name=?1");
	q.setParameter(1, nme);
	
	List<Student> std = q.getResultList();
	if(std.size()>0) {
		for(Student st:std) {
			System.out.println(st);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
