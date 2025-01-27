package com.jspider.ManyToMany_Bi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FInd_Batch_By_Trainer_Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter trainer name");
	String tname = sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("Select b from Batch b where b.trainer=?1");
	q.setParameter(1, tname);
	List<Batch> bt = q.getResultList();
	
	if(bt.size()>0) {
		for(Batch b:bt) {
			System.out.println(b);
		}
	}
	else {
		System.out.println("NO result found");
	}
	sc.close();
}
}
