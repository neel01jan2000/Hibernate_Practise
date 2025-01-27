package com.jspider.ManyToOne;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;

public class FInd_Answer_By_Answer_attribute {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter answer");
	String ans=sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man=fac.createEntityManager();
	
	Query q = man.createQuery("Select a from AnswerData a where a.answer=?1");
	q.setParameter(1, ans);
	
	List<AnswerData> ad = q.getResultList();
	if(ad.size()>0) {
		for(AnswerData asd : ad) {
			System.out.println(asd);
		}
	}
	else {
		System.out.println("No Result found");
	}
	
	sc.close();
}
}
