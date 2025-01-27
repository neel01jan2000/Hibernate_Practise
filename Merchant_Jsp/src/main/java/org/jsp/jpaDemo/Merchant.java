package org.jsp.jpaDemo;
import  javax.persistence.*;

@NamedQuery(name="fetchAll", query="select m from Merchant m")
@NamedQuery(name="verifyMerchant", query="select m from Merchant m where m.phoneNo=?1 and m.password=?2")
@Entity
@Table(name="merchant_Info")
public class Merchant {

	@Id
	@GeneratedValue(strategy=(GenerationType.IDENTITY))
	private int Id;
	
	@Column(name ="m_name", nullable=false)
	private String name;
	
	@Column(name="phoneNo", nullable=false, unique=true)
	private long phoneNo;
	
	@Column(name="gstNo", nullable=false)
	private String gstNo;
	
	@Column(name="m_email",nullable=false, unique=true)
	private String email;
	
	@Column(name="m_password", nullable=false)
	private String password;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Merchant [Id=" + Id + ", name=" + name + ", phoneNo=" + phoneNo + ", gstNo=" + gstNo + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
}
