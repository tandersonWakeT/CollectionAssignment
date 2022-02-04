package com.hcl.entity;

public class EmployeeDetails {

	private int empId;
	private String empName;
	private String empCity;

	public EmployeeDetails() {

		this.empId = 0;
		this.empName = "";
		this.empCity = "";
	}

	public EmployeeDetails(int empId, String empName, String empCity) {

		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}
	
	public void setEmpId(int empId) {
		
		this.empId = empId;
	}
	
	public void setEmpName(String empName) {
		
		this.empName = empName;
	}
	
	public void setEmpCity(String empCity) {
		
		this.empCity= empCity;
	}
	
	public int getEmpId() {
		
		return this.empId;
	}
	
	public String getEmpName() {
		
		return this.empName;
	}
	
	public String getEmpCity() {
		
		return this.empCity;
		
	}
	
	public String toString() {
		
		return "EmpId: " + this.empId + "\nEmpName: " + this.empName + "\nLocation: " + this.empCity + "\n";
	}
}
