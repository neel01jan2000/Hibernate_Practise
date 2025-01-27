package org.jsp.Demo1;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class FIndEmployeeByget {
public static void main(String[] args) {
	
	Configuration conf = new Configuration();
	conf.configure();
	SessionFactory sef = conf.buildSessionFactory();
	Session ses = sef.openSession();
	Employee e = ses.get(Employee.class, 2);
	
	if(e!=null) {
		System.out.println(e);
	}
	else {
		System.out.println("No employee found with such id");
	}
}
}
