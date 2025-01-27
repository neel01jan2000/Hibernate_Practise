package org.jsp.Demo1;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class FIndEmployeeByLoad {
public static void main(String[] args) {
	
	Configuration conf = new Configuration();
	conf.configure();
	SessionFactory sef=conf.buildSessionFactory();
	Session ses = sef.openSession();
	
	try {
		Employee e = ses.load(Employee.class, 2);
//		if we just want identifier, load will not hit the database, hence query will not be generated
		System.out.println(e.getId());
//		IF we want load() to hit database and generate query, we have to
//		use object of Employee or ask for more information
		System.out.println(e);
	}
	catch(ObjectNotFoundException e) {
		System.out.println("Employee not found");
	}
}
}
