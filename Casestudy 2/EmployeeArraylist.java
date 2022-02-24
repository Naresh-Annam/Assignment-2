package com.caseStudy2.EmployeeArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeArraylist {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Employee emp1 = new Employee(1380, "Naresh", "Annam", 24, 30000);
		Employee emp2 = new Employee(1381, "Praveen", "Kalavakuntla", 25, 40000);
		Employee emp3 = new Employee(1382, "Preetham", "Paladugu", 23, 50000);
		Employee emp4 = new Employee(1383, "Hemanth", "Rachabattuni", 22, 60000);
		Employee emp5 = new Employee(1384, "Sathwik", "Suroju", 26, 70000);
		Employee emp6 = new Employee(1385, "Shivani", "Sripadojwar", 23, 80000);
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		emplist.add(emp6);
		for (Employee emp : emplist) {
			emp.display();
		}

		Iterator<Employee> it = emplist.iterator();
		double maxsalary = 0;
		double sal = 0;
		while (it.hasNext()) {
			Employee emp = it.next();
			sal = emp.salary;
			if (sal > maxsalary) {
				maxsalary = sal;
			}
		}
		System.out.println("maximum salary of the Employee = " + maxsalary);

		double avgAge = 0;
		int sum = 0;
		int age;
		while (it.hasNext()) {
			Employee emp = it.next();
			age = emp.age;
			sum = sum + age;
		}
		avgAge = avgAge / 5;
		System.out.println("Average age of the employees in the company = " + avgAge);

	}

}
