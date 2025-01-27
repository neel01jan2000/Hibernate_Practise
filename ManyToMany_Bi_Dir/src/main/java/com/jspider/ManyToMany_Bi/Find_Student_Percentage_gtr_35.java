package com.jspider.ManyToMany_Bi;

import java.util.List;

import javax.persistence.*;

public class Find_Student_Percentage_gtr_35 {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	
	Query query = manager.createQuery("Select s from Student s where s.perc > 35");
	
	List<Student> st = query.getResultList();
	if(st.size()>0) {
		for(Student student:st) {
			System.out.println(student);
		}
	}
	else {
		System.out.println("NO Result found");
	}
}
}
