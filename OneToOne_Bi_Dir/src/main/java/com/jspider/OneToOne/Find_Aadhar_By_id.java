package com.jspider.OneToOne;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Aadhar_By_id {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Aadhar id");
		int aid = sc.nextInt();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		AadharCard ad = man.find(AadharCard.class, aid);
		if(ad!=null) {
			System.out.println(ad);
		}
		else {
			System.out.println("No resutl found");
		}
		sc.close();
		
	}
}
