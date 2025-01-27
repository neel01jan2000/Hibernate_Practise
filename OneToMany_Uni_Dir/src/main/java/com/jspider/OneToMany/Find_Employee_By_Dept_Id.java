package com.jspider.OneToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Employee_By_Dept_Id {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Department id to Know employee info");
	int id = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q=man.createQuery("select d.emps from Department d where d.id=?1");
	q.setParameter(1, id);
	
	List<Employee> e = q.getResultList();
	if(e.size()>0) {
		for(Employee emp :e) {
			System.out.println(emp);
		}
	}
	else {
		System.out.println("No Result found");
	}
	sc.close();
	
}
}
