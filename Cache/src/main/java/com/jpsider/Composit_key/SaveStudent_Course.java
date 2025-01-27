package com.jpsider.Composit_key;

import javax.persistence.*;

public class SaveStudent_Course {
public static void main(String[] args) {
	EntityManagerFactory fac= Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	tran.begin();
	
	Master m = new Master();
	m.setSname("Java");
	m.setUname("Chandani");
	
	MasterId mid = new MasterId();
	mid.setSid(1);
	mid.setCid(101);
	
	
	m.setMid(mid);
	
	man.persist(m);
	
	tran.commit();
}
}
