package com.jspider.ManyToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Batch_By_Trainer_Name {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tname = sc.nextLine();
		
		EntityManagerFactory fac =Persistence.createEntityManagerFactory("dev");
		EntityManager  man = fac.createEntityManager();
		Query q = man.createQuery("Select b from Batch b where b.trainer=?1");
		q.setParameter(1, tname);
		
		List<Batch> btc = q.getResultList();
		if(btc.size()>0) {
			for(Batch bt : btc) {
				System.out.println(bt);
			}
		}
		else {
			System.out.println("No Result found");
		}
		sc.close();
	}
}
