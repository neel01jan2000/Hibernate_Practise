package com.jspider.OneToMany;

import java.util.*;

import javax.persistence.*;

public class Save_Department_and_Employee {
public static void main(String[] args) {
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	EntityTransaction tran = man.getTransaction();
	tran.begin();
	
	Department dp =new Department();
	dp.setName("Development");
	dp.setLocation("Banglore");
	
	Employee e1 =new Employee();
	e1.setName("Neel Avinash");
	e1.setDesg("Java Developer");
	e1.setSalary(98000);
	
	Employee e2 =new Employee();
	e2.setName("Mohit");
	e2.setDesg("Software Developer");
	e2.setSalary(108000);
	
	Employee e3 =new Employee();
	e3.setName("Aditya");
	e3.setDesg("Data Scientist");
	e3.setSalary(290000);
	
//	1st way to add employee in department
//	List<Employee> lemps = new ArrayList<Employee>();
//	lemps.add(e1);
//	lemps.add(e1);
//	lemps.add(e3);
//	dp.setEmps(lemps);
	
	
//	2nd way to add Employee in department
	
	dp.setEmps(Arrays.asList(e1,e2,e3));
	man.persist(dp);
	tran.commit();
	
}
}
