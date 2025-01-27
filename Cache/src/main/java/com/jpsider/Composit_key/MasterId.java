package com.jpsider.Composit_key;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class MasterId implements Serializable {
	
	
	private int sid;
	
	private int cid;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "MasterId [sid=" + sid + ", cid=" + cid + "]";
	}
	
}
