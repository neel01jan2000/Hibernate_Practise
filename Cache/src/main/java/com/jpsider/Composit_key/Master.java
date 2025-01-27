package com.jpsider.Composit_key;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Master {
	@EmbeddedId
	private MasterId mid;
	
	
	private String sname;
	private String uname;
	
	
	public MasterId getMid() {
		return mid;
	}
	public void setMid(MasterId mid) {
		this.mid = mid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "Master [mid=" + mid + ", sname=" + sname + ", uname=" + uname + "]";
	}
	
	
	
}
