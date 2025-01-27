package org.jsp.merchatnproduct.app.dao;

import javax.persistence.*;

import org.jsp.merchantproductapp.dtp.Merchant;

public class MerchantDao {

	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	
	public Merchant saveMerchant(Merchant m) {
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		man.persist(m);
		tran.commit();
		
		return m;
		
	}


	public Merchant updateMerchant(Merchant m) {
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		
		Merchant md = man.find(Merchant.class,m.getId());
		if(md!=null) {
			md.setName(m.getName());
			md.setPhone(m.getPhone());
			md.setEmail(m.getEmail());
			md.setPassword(m.getPassword());
			tran.commit();
			System.out.println("Merchant Updated");
		}
		else {
			System.err.println("Invalid Merchant id");
		}
		
		return m;
	}


	public Merchant findMerchantByID(int id) {
		return man.find(Merchant.class, id);
		
	}


	public Merchant verifyMerchantByEmailandPhone(String email, String pass) {
		Query q = man.createQuery("select m from Merchant m where m.email=?1 and m.password=?2");
		q.setParameter(1,email);
		q.setParameter(2, pass);
		
		try {
			Merchant mc = (Merchant)q.getSingleResult();
			return mc;
		}
		catch(NoResultException e) {
			return null;
		}
		
	}


	public Merchant verifyMerchantByPhoneAndPassword(long phno, String pass) {
		Query q = man.createQuery("select m from Merchant m where m.phone=?1 and m.password=?2");
		q.setParameter(1,phno);
		q.setParameter(2, pass);
		
		try {
			Merchant mc = (Merchant)q.getSingleResult();
			return mc;
		}
		catch(NoResultException e) {
			return null;
		}
		
	}


	


	

}
