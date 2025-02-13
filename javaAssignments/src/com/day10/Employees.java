package com.day10;

public class Employees extends Person{

		int employeeId;
		String jobTitle;
		public Employees(String firstName,String lastName, int employeeId, String jobTitle) {
			super(firstName,lastName);
			this.employeeId=employeeId;
			this.jobTitle=jobTitle;
		}
		public String getLastName() {
			return jobTitle;
		}
		public int getEmployeeId() {
			return employeeId;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees emp = new Employees("Rama","Krishna",123,"Java Developer");
		emp.printDetails();
		System.out.println("Employee ID: "+emp.getEmployeeId());
		System.out.println("Employee job title: "+emp.getLastName());
	}

}
