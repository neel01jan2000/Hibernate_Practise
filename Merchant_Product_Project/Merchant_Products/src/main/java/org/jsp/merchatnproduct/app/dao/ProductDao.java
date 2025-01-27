package org.jsp.merchatnproduct.app.dao;

import java.util.List;

import javax.persistence.*;

import org.jsp.merchantproductapp.dtp.Merchant;
import org.jsp.merchantproductapp.dtp.Product;

public class ProductDao {

	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	static EntityManager man = fac.createEntityManager();
	
	
	
	public Product addProduct(Product p, int mid) {
		
		Merchant m = man.find(Merchant.class,mid);
		if(m!=null) {
			m.getProducts().add(p);
			p.setMerchant(m);
			
			EntityTransaction tran = man.getTransaction();
			tran.begin();
			man.persist(p);
			tran.commit();
			
			return p;
		}
		
		
		return null;
	}



	public List<Product> findProductByMerchantID(int mid) {
		Query q = man.createQuery("select p.products from Merchant p where p.id=?1");
		q.setParameter(1,mid);
		List<Product> lp = q.getResultList();
		
		return lp;
	}



	public Product updateProduct(Product p) {
		Product pdt = man.find(Product.class,p.getId());
		if(pdt!=null) {
			EntityTransaction tran = man.getTransaction();
			tran.begin();
			pdt.setName(p.getName());
			pdt.setBrand(p.getBrand());
			pdt.setCategory(p.getCategory());
			
			tran.commit();
			return pdt;
		}
		return null;
	}



	public List<Product> findProductByCategory(String pCatagory) {
		Query q = man.createQuery("Select p from Product p where p.category=?1");
		q.setParameter(1, pCatagory);
		
		List<Product> lp = q.getResultList();
		return lp;
	}



	public List<Product> findProductByBrand(String pBrand) {

		Query q = man.createQuery("select p from Product p where p.brand=?1");
		q.setParameter(1, pBrand);
		List<Product> lp = q.getResultList();
		return lp;
	}



	
	
	
	
}
