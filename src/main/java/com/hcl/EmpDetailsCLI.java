package com.hcl;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Iterator;

import com.hcl.entity.EmployeeDetails;

/**
 * When each Collection should be used:
 * 
 * ArrayList: It is best to use an ArrayList if you are Searching the list
 * frequently, but also not adding/removing elements often.
 * 
 * Map: Map should be used when data is stored as Key:Value pairs. -Tree Map if
 * the data needs to be stored in sorted order -Hash Map if the data Value needs
 * to be retrieved by the data Key frequently and quickly
 * 
 * Set: Set should be used when data values must be unique.
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
		
		System.out.println("Displaying emp objects stored in ArrayList:\n");
		for (EmployeeDetails emp : empList) {
			System.out.println(emp.toString());
		}
		System.out.println("\n=================================\n\n");

		// Attempting to store duplicates in a set
		EmployeeDetails emp4 = new EmployeeDetails(123, "John", "Raleigh"); // Duplicate to emp1

		// TreeSet is ordered on insertion
		Set<EmployeeDetails> empSet = new TreeSet<>();
		empSet.add(emp2);
		empSet.add(emp1);
		empSet.add(emp3);
		// emp4 is identical to emp1 so it is a duplicate and not added to the Set
		empSet.add(emp4);
		
		System.out.println("Tree set stores unique elements in sorted order: \n");
		System.out.println("Size of set: " + empSet.size() + "\n");
		
		Iterator<EmployeeDetails> it = empSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n=================================\n\n");
		System.out.println("Utilize Map's get() function to quickly retrieve Values based on Key\n");
		// Map's are used to retrieve Values based on their respective Keys
		Map<Integer, EmployeeDetails> tmap1 = new HashMap<>();
		
		// Populating HashMap
		tmap1.put(1, emp1);
		tmap1.put(2, emp2);
		tmap1.put(3, emp3);
		tmap1.put(4, emp4);
		
		System.out.println("Retrieving Value by Key: ");
		System.out.println("Get Value for Key '2': \n" + tmap1.get(2));
		System.out.println("Get Value for Key '4': \n" + tmap1.get(4));
		
	}
}
