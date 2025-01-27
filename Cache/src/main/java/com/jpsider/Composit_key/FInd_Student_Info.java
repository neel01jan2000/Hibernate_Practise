package com.jpsider.Composit_key;

import javax.persistence.*;

public class FInd_Student_Info {
public static void main(String[] args) {
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	MasterId m1 = new  MasterId();
	m1.setSid(1);
	m1.setCid(101);
	
	Master m2 = man.find(Master.class, m1);
	if(m1!=null) {
		System.out.println(m2);
	}
	else {
		System.out.println("No Result found");
	}
}
}
