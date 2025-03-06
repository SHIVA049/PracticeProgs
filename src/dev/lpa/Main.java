package dev.lpa;

import java.util.ArrayList;
import java.util.List;

import dev.lpa.domain.Employee1;
import dev.lpa.domain.EmployeeComparator;
import dev.lpa.domain.StoreEmployee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee1> employees = new ArrayList<>(List.of(
                new Employee1(10001, "Ralph", 2015),
                new Employee1(10005, "Carole", 2021),
                new Employee1(10022, "Jane", 2013),
                new Employee1(13151, "Laura", 2020),
                new Employee1(10050, "Jim", 2018) ));

//  		var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
		
		employees.sort(new Employee1.EmployeeComparator<>("yearStarted").reversed());
		
		for (Employee1 e : employees) {
            System.out.println(e);
        }
		
		System.out.println("Store Members");
		
		List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
				new StoreEmployee(10015, "Meg", 2019, "Target"),
				new StoreEmployee(10515, "Joe", 2021, "Walmart"),
				new StoreEmployee(10105, "Tom", 2020, "Macys"),
				new StoreEmployee(10215, "Marty", 2018, "Walmart"),
				new StoreEmployee(10322, "Bud", 2016, "Target")));
		
		//var genericEmployee = new StoreEmployee();
		
		//var comparator = genericEmployee.new StoreComparator<>();
		var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);		
		
		for(StoreEmployee e: storeEmployees) {
			 System.out.println(e);
		}

	}

}
