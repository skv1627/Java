package com.day9.constructors;

public class Employee {
 String name;
 String jobTitle;
 int salary;
 int increment;
 
 public Employee(String name, String jobTitle, int salary, int increment) {
	 this.name=name;
	 this.jobTitle=jobTitle;
	 this.salary=salary;
	 this.increment=increment;
	 
 }
 public int calculate() {
	 return salary*12;
 }
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int updateSalary() {
	 return (salary+increment)*12;
 }
public int getIncrement() {
	return increment;
}
public void setIncrement(int increment) {
	this.increment = increment;
}

}

