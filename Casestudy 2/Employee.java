package com.caseStudy2.EmployeeArrayList;

public class Employee {

	int empId;
	String firstName;
	String lastName;
	int age;
	double salary;

	public Employee(String firstName, String lastName, int age, double salary) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee Id 		= " + empId);
		System.out.println("Employee Firstname  	= " + firstName);
		System.out.println("Employee LastName   	= " + lastName);
		System.out.println("Employee Age		= " + age);
		System.out.println("Employee Salary 	= " + salary);
		System.out.println("");
	}

}
