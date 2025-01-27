package com.jspider.ManyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Question_By_Question_Attributes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Question");
		String name= sc.nextLine();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
		Query q=man.createQuery("Select q from QuestionData q where q.question=?1");
		q.setParameter(1,name);
		
		List<QuestionData> qd = q.getResultList();
		if(qd.size()>0) {
			for(QuestionData qby:qd) {
				System.out.println(qby);
			}
		}
		else {
			System.out.println("No result found");
		}
		
		sc.close();
	}
}
