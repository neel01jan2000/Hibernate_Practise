package com.jspider.ManyToMany;

import java.util.Arrays;

import javax.persistence.*;

public class Save_BatchAndStudents {
public static void main(String[] args) {
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	
	tran.begin();
	
	Batch b1 = new Batch();
	b1.setBatch_code("M1");
	b1.setTrainer("Abishek");
	b1.setSubject("Java");
	
	Batch b2 = new Batch();
	b2.setBatch_code("A2");
	b2.setTrainer("Guru");
	b2.setSubject("JEE");
	
	Student s1 = new Student();
	s1.setName("Neel");
	s1.setPhone(98398228);
	s1.setPerc(74.98);

	Student s2 = new Student();
	s2.setName("Avinash");
	s2.setPhone(893839393);
	s2.setPerc(89.9);
	
	Student s3 = new Student();
	s3.setName("Mohit");
	s3.setPhone(89383933);
	s3.setPerc(67.39);
	
	b1.setStudents(Arrays.asList(s1,s2,s3));
	b2.setStudents(Arrays.asList(s2,s3));
	
	man.persist(b1);
	man.persist(b2);
	tran.commit();
	
	
	
	
}
}
