package com.jspider.ManyToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Student_By_Batch_Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batch Code");
		String bt = sc.nextLine();
		
		EntityManagerFactory fac =Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q = man.createQuery("Select b.students from Batch b where b.batch_code=?1");
		q.setParameter(1, bt);
		
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
