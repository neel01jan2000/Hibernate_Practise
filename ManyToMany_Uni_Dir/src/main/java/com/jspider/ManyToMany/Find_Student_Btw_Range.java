package com.jspider.ManyToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Student_Btw_Range {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Percentage range1");
	double p1 = sc.nextDouble();
	System.out.println("Enter Percentage range2");
	double p2 = sc.nextDouble();
	
	EntityManagerFactory fac =Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query  q = man.createQuery("select s from Student s where s.perc between ?1 and ?2");
	q.setParameter(1, p1);
	q.setParameter(2, p2);
	
	List<Student> st = q.getResultList();
	if(st.size()>0) {
		for(Student std : st) {
			System.out.println(std);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
