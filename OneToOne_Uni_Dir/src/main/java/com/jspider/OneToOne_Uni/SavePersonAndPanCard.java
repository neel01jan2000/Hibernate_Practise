package com.jspider.OneToOne_Uni;

import javax.persistence.*;

public class SavePersonAndPanCard {
public static void main(String[] args) {
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	
	tran.begin();
	Person p=new Person();
	p.setName("Avinash");
	p.setPhone(989283928);
	
	PanCard card = new PanCard();
	card.setNumber("KDI393839DS");
	card.setPinCode(800011);
	
	p.setCard(card);
	man.persist(p);
	man.persist(card);
	tran.commit();
	
}
}
