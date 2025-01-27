package com.jspider.ManyToMany_Bi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Batches_By_Student_Id_Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student id");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Student name");
	String nam = sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("Select s.batches from Student s where s.id=?1 and s.name=?2");
	q.setParameter(1, id);
	q.setParameter(2, nam);
	
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
