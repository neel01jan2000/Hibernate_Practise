package com.jpsider.Cache_Level2;

import javax.persistence.*;

public class Save_User1 {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();

		User1 ur = new User1();
		ur.setName("Neel Avinash");
		ur.setEmail("neel01@gmail.com");

		man.persist(ur);
		tran.commit();
	}
}
