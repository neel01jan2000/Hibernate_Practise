package com.jspider.ManyToMany_Bi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Batch_By_Student_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter student id");
	int sid = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("select s.batches from Student s where s.id=?1");
	q.setParameter(1, sid);
	
	List<Batch> bt =q.getResultList();
	if(bt.size()>0) {
		for(Batch b:bt) {
			System.out.println(b);
		}
	}
	else {
		System.out.println("NO Result found");
	}
	sc.close();
}
}
