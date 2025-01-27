package com.jspider.ManyToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Batch_By_Batch_Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batch Code");
		String sname = sc.nextLine();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q = man.createQuery("Select b from Batch b where b.batch_code=?1");
		q.setParameter(1, sname);
		List<Batch> bt = q.getResultList();
		if(bt.size()>0) {
			for(Batch bch : bt) {
				System.out.println(bch);
			}
		}
		else {
			System.out.println("No Result found");
		}
		sc.close();
	}
}
