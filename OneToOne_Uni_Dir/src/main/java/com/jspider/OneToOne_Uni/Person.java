package com.jspider.OneToOne_Uni;

import javax.persistence.*;

@NamedQuery(name="findByName",query="Select p from Person p where p.name=?1")
@NamedQuery(name="findByPhone", query="Select pno from Person pno where pno.phone=?1")
@NamedQuery(name="findPersonByCardId", query="select p from Person p where p.card.id=?1")
@NamedQuery(name="findPersonByCardNo", query="select p from Person p where p.card.number=?1")
@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private long phone;
	
	@OneToOne
	private PanCard card;
	
	
	public PanCard getCard() {
		return card;
	}
	public void setCard(PanCard card) {
		this.card = card;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	

}
