package dev.lpa.domain;

public class Employee {
	
	int id;
    int salary;
    
    Employee(int id, int salary){
        
        this.id=id;
        this.salary=salary;
    }

}

class SalesEmployee extends Employee {
    
    int sales;
    
    SalesEmployee(int id, int salary, int sales){
        
        super(id,salary);
        this.sales=sales;
        
    }
    
    public static void main() {
    	
    	//SalesEmployee SE=new SalesEmployee(14,30000,20);
    	 
    }
}


