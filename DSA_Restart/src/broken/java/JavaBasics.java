package broken.java;

public class JavaBasics {

	public static void main(String[] args) {
	
		  // TODO: Create Employee and Manager objects
        Employee e = new Employee("Alice",50000.0);
        Employee m = new Manager("Bob",80000.0,"IT");
        // TODO: Print their details using getDetails()
        System.out.println(e.getDetails());
        System.out.println(m.getDetails());
	}


}

interface myEMp{
	
	public default String getName() {
		return "Hello";
	}
}

class Employee implements myEMp{
    private String name;
    private double salary;
    
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    
     public String getName(){
	        return name;
	    }
	    public double getSalary(){
	        return salary;
	    }
	    
    public String getDetails(){
        return "Name: "+ name+", Salary: "+salary;
    }
}

// TODO: Create a class Manager that:
// - Extends Employee
class Manager extends Employee{
    private String department;
    
    public Manager(String name, double salary, String department){
        super(name,salary);
        this.department = department;
    }
    
     public String getDetails(){
	        return "Name: "+ getName()+", Salary: "+getSalary()+", Department: "+department;
	    }
}

