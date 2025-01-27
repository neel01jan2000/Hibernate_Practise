package com.jspider.OneToOne_Uni;

import javax.persistence.*;

@NamedQuery(name="findPanCardBByNo", query="select pc from PanCard pc where pc.number=?1")
@NamedQuery(name="findCardByPersonID", query="select p.card from Person p where p.id=?1")

@NamedQuery(name="findCardByPersonPhone", query="select p.card from Person p where p.phone=?1")
@Entity
public class PanCard {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String number;
	private long pinCode;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "PanCard [id=" + id + ", Number=" + number + ", PinCode=" + pinCode + "]";
	}
	
}
