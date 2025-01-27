package com.jspider.OneToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Employee_By_Desg {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee Designation");
	String desg = sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q= man.createQuery("Select e from Employee e where e.desg=?1");
	q.setParameter(1,desg);
	
	List<Employee> e = q.getResultList();
	
	if(e.size()>0) {
		for(Employee emp : e) {
			System.out.println(emp);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
}
}
