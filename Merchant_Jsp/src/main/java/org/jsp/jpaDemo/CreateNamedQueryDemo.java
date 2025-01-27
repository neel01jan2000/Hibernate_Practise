package org.jsp.jpaDemo;

import java.util.List;

import javax.persistence.*;

public class CreateNamedQueryDemo {
public static void main(String[] args) {
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	Query q = man.createNamedQuery("fetchAll");
	List<Merchant> lm = q.getResultList();
	if(lm.size()>0) {
		for(Merchant mer:lm) {
			System.out.println(mer);
		}
	}
	else {
		System.out.println("No merchant info found");
	}
}
}
