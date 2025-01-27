package com.jspider.OneToMany;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Department_By_DeptName {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in );
	System.out.println("Enter Department name");
	String dept=sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("select d from Department d where d.name=?1");
	q.setParameter(1, dept);
	
	try {
		Department dp =(Department)q.getSingleResult();
		System.out.println(dp);
	}
	catch(NoResultException e) {
		System.out.println("NO result found");
	}
	sc.close();
}
}
