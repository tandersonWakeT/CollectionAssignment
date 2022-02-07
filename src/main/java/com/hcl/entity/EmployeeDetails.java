package com.hcl.entity;

public class EmployeeDetails extends Employee{

	private int empId;
	private String empName;
	private String empCity;

	public EmployeeDetails() {

		super();
		this.empName = "";
		this.empCity = "";
	}

	public EmployeeDetails(int empId, String empName, String empCity) {

		super(empId);
		this.empName = empName;
		this.empCity = empCity;
	}
	
	
	public void setEmpName(String empName) {
		
		this.empName = empName;
	}
	
	public void setEmpCity(String empCity) {
		
		this.empCity= empCity;
	}
	
	public String getEmpName() {
		
		return this.empName;
	}
	
	public String getEmpCity() {
		
		return this.empCity;
		
	}
	
	public String toString() {
		
		return "EmpId: " + this.getEmpId() + "\nEmpName: " + this.empName + "\nLocation: " + this.empCity + "\n";
	}
	
	public int compareTo(Employee e) {
		
		if (this.getEmpId() > ((EmployeeDetails) e).getEmpId()) {
			return 1;
		}
		else if (this.getEmpId() < ((EmployeeDetails) e).getEmpId()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
