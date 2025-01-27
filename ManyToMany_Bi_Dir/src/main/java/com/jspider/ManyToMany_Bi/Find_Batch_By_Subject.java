package com.jspider.ManyToMany_Bi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Batch_By_Subject {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Subject name");
	String sub =sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("select b from Batch b where b.subject=?1");
	q.setParameter(1, sub);
	List<Batch> bt = q.getResultList();
	if(bt.size()>0) {
		for(Batch bth : bt) {
			System.out.println(bth);
		}
	}
	else {
		System.out.println("NO result found");
	}
	sc.close();
 }
}
