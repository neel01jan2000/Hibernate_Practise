package com.jspider.ManyToMany_Bi;

import java.util.Scanner;

import javax.persistence.*;


public class Find_Student_By_Phone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Phone Number");
		long phno = sc.nextLong();
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q = man.createQuery("Select s from Student s where s.phone=?1");
		q.setParameter(1, phno);
		
		try {
			Student student = (Student)q.getSingleResult();
			System.out.println(student);
		}
		catch (NoResultException e) {
			System.out.println("NO result found");
		}
		sc.close();
	}
}
