package com.jspider.ManyToMany_Bi;

import java.util.Arrays;

import javax.persistence.*;

public class Save_Batch_Student {
public static void main(String[] args) {
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	tran.begin();
	
	Batch b1 = new Batch();
	b1.setBatch_code("A1");
	b1.setSubject("Java");
	b1.setTrainer("Abishek");
	
	Batch b2 = new Batch();
	b2.setBatch_code("M2");
	b2.setSubject("Hibernate");
	b2.setTrainer("Guru");
	
	Student s1 = new Student();
	s1.setName("Neel Avinash");
	s1.setPerc(89.87);
	s1.setPhone(989829281);
	
	Student s2 = new Student();
	s2.setName("Mohit");
	s2.setPerc(87.39);
	s2.setPhone(893839822);
	
	Student s3 = new Student();
	s3.setName("Aditya");
	s3.setPerc(83.39);
	s3.setPhone(922839822);
	
	b1.setStudents(Arrays.asList(s1,s2,s3));
	b2.setStudents(Arrays.asList(s2,s3));
	
	s1.setBatches(Arrays.asList(b1,b2));
	s1.setBatches(Arrays.asList(b1));
	s1.setBatches(Arrays.asList(b2));

	man.persist(b1);
	man.persist(b2);
	tran.commit();
	
	
	
}
}
