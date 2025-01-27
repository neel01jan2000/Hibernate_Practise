package com.jspider.OneToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Find_Employee_By_Dept_Id_Location {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Department id");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Department location");
	String dloc= sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("Select d.emps from Department d where d.id=?1 and d.location=?2");
	q.setParameter(1,id);
	q.setParameter(2, dloc);
	
	List<Employee> e = q.getResultList();
	if(e.size()>0) {
		for(Employee emp : e) {
			System.out.println(emp);
		}
	}
	else {
		System.out.println("NO Result found");
	}
	sc.close();
}
}
