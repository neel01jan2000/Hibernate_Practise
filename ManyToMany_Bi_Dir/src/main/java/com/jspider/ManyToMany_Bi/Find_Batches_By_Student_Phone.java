package com.jspider.ManyToMany_Bi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;



public class Find_Batches_By_Student_Phone {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student phone No.");
	long phno = sc.nextLong();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("Select b.batches from Student b where b.phone=?1");
	q.setParameter(1, phno);
	
	List<Batch> bt = q.getResultList();
	if(bt.size()>0) {
		for(Batch b:bt) {
			System.out.println(b);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
	
}
}
