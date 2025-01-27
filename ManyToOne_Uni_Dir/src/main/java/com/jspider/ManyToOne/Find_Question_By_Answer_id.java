package com.jspider.ManyToOne;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Question_By_Answer_id {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Answer id");
		int id = sc.nextInt();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q=man.createQuery("Select a.question from AnswerData a where a.id=?1");
		q.setParameter(1,id);
		
		try {
			QuestionData qs = (QuestionData)q.getSingleResult();
			System.out.println(qs);
		}
		catch(NoResultException e) {
			System.out.println("No result found");
		}
		
		
		sc.close();
	}
}
