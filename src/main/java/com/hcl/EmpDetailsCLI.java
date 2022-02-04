package com.hcl;

import java.util.List;
import java.util.ArrayList;

import com.hcl.entity.EmployeeDetails;
/**
 * When each Collection should be used:
 * 
 *     ArrayList: It is best to use an ArrayList if you are Searching the list frequently,
 *     				but also not adding/removing elements often.
 *     
 *     Map: Map should be used when data is stored as Key:Value pairs.
 *     		-Tree Map if the data needs to be stored in sorted order
 *     		-Hash Map if the data Value needs to be retrieved by the data Key frequently and quickly
 *     
 *     Set: Set should be used when data values must be unique.
 *
 */
public class EmpDetailsCLI {
	
    public static void main(String[] args) {
    	
    	List<EmployeeDetails> empList = new ArrayList<>();
    	
    	EmployeeDetails emp1 = new EmployeeDetails(123, "John", "Raleigh");
    	EmployeeDetails emp2 = new EmployeeDetails(125, "Meghan", "Cary");
    	EmployeeDetails emp3 = new EmployeeDetails(345, "Scarlett", "Durham");
    	
    	empList.add(emp1);
    	empList.add(emp2);
    	empList.add(emp3);
    	
    	for (EmployeeDetails emp : empList) {
    		System.out.println(emp.toString());
    	}
    }
}
