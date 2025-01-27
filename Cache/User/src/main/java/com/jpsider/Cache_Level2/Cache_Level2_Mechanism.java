package com.jpsider.Cache_Level2;

import javax.persistence.*;


public class Cache_Level2_Mechanism {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man1 = fac.createEntityManager();
		EntityManager man2 = fac.createEntityManager();
		
		man1.find(User1.class, 1);
		man1.find(User1.class, 1);
		
		man2.find(User1.class, 1);
		man2.find(User1.class, 1);
		
		
	}
}
