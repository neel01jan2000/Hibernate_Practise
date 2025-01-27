package com.jspider.ManyToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Student_By_Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter student name");
	String name = sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("Select s from Student s where s.name=?1");
	q.setParameter(1, name);
	
	List<Student> st = q.getResultList();
	if(st.size()>0) {
		for(Student sts : st) {
			System.out.println(sts);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
