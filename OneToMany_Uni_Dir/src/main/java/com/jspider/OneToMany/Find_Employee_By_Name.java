package com.jspider.OneToMany;

import java.util.*;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Employee_By_Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in );
	System.out.println("Enter Employee name");
	String name = sc.nextLine();
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("Select e from Employee e where e.name=?1");
	q.setParameter(1,name);
	
	List<Employee> e = q.getResultList();
	if(e.size()>0) {
		for(Employee emp : e) {
			System.out.println(emp);
		}
	}
	else {
		System.out.println("NO employee found");
	}
	
	}
}
