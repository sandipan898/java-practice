package constructor_chaining;

public class Employee {
    public String name;
    public int salary;
    public String address;

    //default constructor of the class
    public Employee()
    {
    	//this will call the constructor with String param
        this("Sandipan");
    }

    public Employee(String name)
    {
    	//call the constructor with (String, int) param
    	this(name, 3050000);
    }
    public Employee(String name, int sal)
    {
    	//call the constructor with (String, int, String) param
    	this(name, sal, "Kolkata");
    }
    public Employee(String name, int sal, String addr)
    {
    	this.name=name;
    	this.salary=sal;
    	this.address=addr;
    }

    void disp() {
    	System.out.println("Employee Name: " + name);
    	System.out.println("Employee Salary: " + salary);
    	System.out.println("Employee Address: " + address);
    }
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.disp();
    }
}
