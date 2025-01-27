package com.jspider.OneToMany;

import java.util.*;
import java.util.Scanner;

import javax.persistence.*;

public class Save_By_Dynamic_field {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();

		Department dp = new Department();
		System.out.println("Enter Department name");
		dp.setName(sc.nextLine());

		System.out.println("Enter Department location");
		dp.setLocation(sc.nextLine());

		List<Employee> emp = new ArrayList<Employee>();
		System.out.println("Enter no. of employee you want to add");
		int empCount = sc.nextInt();

		for (int i = 0; i < empCount; i++) {
			Employee e = new Employee();

			System.out.println("Enter Employee " + (i + 1) + " Name: ");
			e.setName(sc.nextLine());
			
			System.out.println("Enter Employee " + (i + 1) + " Designation: ");
			e.setDesg(sc.nextLine());
			
			System.out.println("Enter Employee " + (i + 1) + " Salary: ");
			e.setSalary(sc.nextDouble());
			
			sc.nextLine(); 

			emp.add(e);
		}
		
		man.persist(dp);
		tran.commit();
		sc.close();
	}
}
