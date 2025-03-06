package dev.lpa.domain;

import java.util.Comparator;

public class Employee1 {
	
	public static class EmployeeComparator<T extends Employee1> implements Comparator<Employee1> {

		private String sortType;
		
		
		
		public EmployeeComparator() {
			this("name");
		}
		public EmployeeComparator(String sortType) {
			
			this.sortType = sortType;
		}
		@Override
		public int compare(Employee1 o1, Employee1 o2) {
			// TODO Auto-generated method stub
			
			if (sortType.equalsIgnoreCase("yearStarted")) {
                return o1.yearStarted - o2.yearStarted;
            }

			return o1.name.compareTo(o2.name);
			//return o1.getYearStarted().o2.yearStarted ;

	}
	}


    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee1() {
    }

    public Employee1(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
}
