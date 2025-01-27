package com.jspider.OneToOne;

import java.util.Scanner;

import javax.persistence.*;

public class Find_User_By_Id {
	public static void main(String[] args) {
		System.out.println("Enter User Id");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		User u = man.find(User.class, id);
		if(u!=null) {
			System.out.println(u);
		}
		else {
			System.out.println("User not found");
		}
		sc.close();
				
	}
}
