package com.jspider.ManyToOne;

import javax.persistence.*;

public class Save_Question_And_Answer {
public static void main(String[] args) {
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	
	tran.begin();
	QuestionData q = new QuestionData();
	q.setQuestion("What is your aim?");
	q.setQuestionBy("Guru");
	
	AnswerData a1 =new AnswerData();
	a1.setAnswer("Get Job");
	a1.setAnswerBy("Neel Avinash");
	a1.setQuestion(q);
	
	AnswerData a2 =new AnswerData();
	a2.setAnswer("StartUp");
	a2.setAnswerBy("Neel");
	a2.setQuestion(q);
	
	AnswerData a3 =new AnswerData();
	a3.setAnswer("Help under privlege people");
	a3.setAnswerBy("Neel Avinash");
	a3.setQuestion(q);
	
	man.persist(a1);
	man.persist(a2);
	man.persist(a3);
	tran.commit();
	
}
}
