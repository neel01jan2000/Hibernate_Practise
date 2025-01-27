package com.jspider.ManyToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Student_By_Batch_id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Batch id");
	int id = sc.nextInt();
	
	EntityManagerFactory fac =Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("Select b.students from Batch b where b.id=?1");
	q.setParameter(1, id);
	
	List<Student> st = q.getResultList();
	if(st.size()>0) {
		for(Student std:st) {
			System.out.println(std);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
