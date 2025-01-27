package org.jsp.merchantproductapp.dtp;

import java.util.List;

import javax.persistence.*;


@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private long phone;
	private String gst_no;
	private String email;
	private String password;
	
	@OneToMany(mappedBy="merchant", cascade=CascadeType.ALL)
	private List<Product>products;
	
	
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
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
	public String getGst_no() {
		return gst_no;
	}
	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
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
		return "Merchant [id=" + id + ", name=" + name + ", phone=" + phone + ", gst_no=" + gst_no + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
}
