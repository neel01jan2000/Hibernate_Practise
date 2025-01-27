package com.jspider.Food_Order;

import java.util.Scanner;

import javax.persistence.*;

public class Find_FoodOrder_By_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter food order id");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	FoodOrder fo = man.find(FoodOrder.class, id);
	if(fo!= null) {
		System.out.println(fo);
	}
	else {
		System.out.println("No result found");
	}
	sc.close();
}
}
