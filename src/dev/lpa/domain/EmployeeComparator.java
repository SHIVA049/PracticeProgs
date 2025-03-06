package dev.lpa.domain;

import java.util.Comparator;

public class EmployeeComparator<T extends Employee1> implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
		//return o1.getYearStarted().o2.yearStarted ;

}
}
