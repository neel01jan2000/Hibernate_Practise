package com.jspider.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Answer_By_QuestionBy_attribute {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name who Questioned");
		String qs = sc.nextLine();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man=fac.createEntityManager();
		
		Query q= man.createQuery("select a from AnswerData a where a.question.questionBy=?1");
		q.setParameter(1,qs);
		
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
