package org.jsp.jpaDemo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindMerchantByIDUsing_createNativeQuery {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Merchant id");
	int mid=sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createNativeQuery("select * from merchant_Info where id=?1 ",Merchant.class);
	q.setParameter(1,mid);
	
	List<Merchant> m=q.getResultList();
	if(m.size()>0) {
		for(Merchant mer : m) {
			System.out.println(m);
		}
	}
	else {
		System.out.println("No Merchant found");
	}
	
}
}
