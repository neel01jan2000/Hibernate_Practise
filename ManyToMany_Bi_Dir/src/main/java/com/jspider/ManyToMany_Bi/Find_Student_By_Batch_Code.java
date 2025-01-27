package com.jspider.ManyToMany_Bi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;


public class Find_Student_By_Batch_Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batch id");
		String id = sc.nextLine();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q = man.createQuery("Select b.students from Batch b where b.batch_code=?1");
		q.setParameter(1, id);
		
		@SuppressWarnings("unchecked")
		List<Student> st = q.getResultList();
		if(st.size()>0) {
			for(Student std:st) {
				System.out.println(std);
			}
		}
		else {
			System.out.println("No result found");
		}
		sc.close();
	}
}
