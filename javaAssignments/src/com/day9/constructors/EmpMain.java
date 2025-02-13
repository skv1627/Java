package com.day9.constructors;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee("Rama","Java Developer",10,0);
		System.out.println("The Salary of "+emp.getName()+" is "+emp.calculate());
		emp.setSalary(30);
		System.out.println("Increment the salary by " + emp.getSalary());
		System.out.println("Updated salary : "+emp.updateSalary());
				
	}

}
