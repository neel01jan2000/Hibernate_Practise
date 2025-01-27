package com.jspider.Food_Order;

import java.time.LocalDateTime;

import javax.persistence.*;

public class Place_Order {
public static void main(String[] args) {
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	
	tran.begin();
	
	FoodOrder fo = new FoodOrder();
	fo.setFood("Briyani");
	fo.setCost(150);
	
	LocalDateTime cTime = LocalDateTime.now();
	LocalDateTime dTime = cTime.plusMinutes(20);
	
	fo.setDeliveryTime(dTime);
	
	man.persist(fo);
	tran.commit();
}
}
