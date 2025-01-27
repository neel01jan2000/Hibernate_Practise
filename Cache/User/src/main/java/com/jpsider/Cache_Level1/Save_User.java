 package com.jpsider.Cache_Level1;

import javax.persistence.*;

public class Save_User {
public static void main(String[] args) {
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	tran.begin();
	
	User ur = new User();
	ur.setName("Neel Avinash");
	ur.setEmail("neel01@gmail.com");
	
	man.persist(ur);
	tran.commit();
}
}
