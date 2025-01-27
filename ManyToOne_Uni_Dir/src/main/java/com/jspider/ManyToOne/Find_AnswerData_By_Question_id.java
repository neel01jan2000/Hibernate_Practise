package com.jspider.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_AnswerData_By_Question_id {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Question id");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man=fac.createEntityManager();
	
	Query q= man.createQuery("select a from AnswerData a where a.question.id=?1");
	q.setParameter(1,id);
	
	List<AnswerData> ad= q.getResultList();
	if(ad.size()>0) {
		for(AnswerData ads : ad) {
			System.out.println(ads);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
