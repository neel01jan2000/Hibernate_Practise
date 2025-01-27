package com.jspider.ManyToMany;

import java.util.List;

import javax.persistence.*;

public class Find_Student_Percentage_Gtr_60 {
public static void main(String[] args) {
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	Query q = man.createQuery("select s from Student s where s.perc >=60=?1");
	List<Student> st = q.getResultList();
	
	if(st.size()>0) {
		for(Student std : st) {
			System.out.println(std);
		}
	}
	else {
		System.out.println("No Result found");
	}

}
}
