package com.jspider.Food_Order;

import java.time.LocalDateTime;
import java.util.Scanner;

import javax.persistence.*;

public class Update_Order {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter order id to update the order");
	int id =sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran =man.getTransaction();
	tran.begin();
	
	FoodOrder fo = man.find(FoodOrder.class, id);
	if(fo!=null) {
		fo.setFood("Chicken Chilli");
		fo.setCost(100);
		fo.setDeliveryTime(LocalDateTime.now().plusMinutes(20));
		
		tran.commit();
	}
	sc.close();
}
}
