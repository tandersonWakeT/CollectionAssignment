package com.hcl.entity;

public abstract class Employee implements Comparable<Employee>{
	
	private int empId;
	
	public Employee() {
		this.empId = 0;
	}
	
	public Employee(int empId) {
		this.empId = empId;
	}
	
	// getters and setters for empId
	public int getEmpId() {
		
		return this.empId;
	}
	
	public void setEmpId(int empId) {
		
		this.empId = empId;
	}
	
	// Abstract compareTo method to be implemented in concrete subclass
	public abstract int compareTo(Employee e);
}
