package com.jspider.OneToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FInd_Employee_By_Dept_Id_and_Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Department id");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Department name");
	String dname= sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	
	Query q = man.createQuery("Select d.emps from Department d where d.id=?1 and d.name=?2");
	q.setParameter(1,id);
	q.setParameter(2, dname);
	
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
