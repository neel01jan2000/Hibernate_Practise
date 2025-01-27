package com.jspider.ManyToMany;

import java.util.List;

import javax.persistence.*;

@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String batch_code;
	private String trainer;
	private String subject;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBatch_code() {
		return batch_code;
	}
	public void setBatch_code(String batch_code) {
		this.batch_code = batch_code;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Batch [id=" + id + ", batch_code=" + batch_code + ", trainer=" + trainer + ", subject=" + subject + "]";
	}
	
	

}
