package org.jsp.Demo1;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {
public static void main(String[] args) {
	
	Configuration conf=new Configuration();
	conf.configure();
	SessionFactory sef = conf.buildSessionFactory();
	Session ses = sef.openSession();
	Transaction tran =ses.getTransaction();
	tran.begin();
	
	Employee e = new Employee();
	
	e.setName("Avinash");
	e.setPhone(900000120);
	e.setDesg("Boss");
	e.setEmail("neel01janb2000@gmail.com");
	e.setPassword("neeAvinah");
	e.setSalary(998000);
	
	int i =(Integer)ses.save(e);
	System.out.println("Employee is saved with the is value "+i);
	tran.commit();
	
}
}
