package com.jspider.ManyToOne;

import javax.persistence.*;

@Entity
public class AnswerData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String answer;
	private String answerBy;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private QuestionData question;
	
	
	
	public QuestionData getQuestion() {
		return question;
	}
	public void setQuestion(QuestionData question) {
		this.question = question;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswerBy() {
		return answerBy;
	}
	public void setAnswerBy(String answerBy) {
		this.answerBy = answerBy;
	}
	
	@Override
	public String toString() {
		return "AnswerData [id=" + id + ", answer=" + answer + ", answerBy=" + answerBy + "]";
	}
	

}
