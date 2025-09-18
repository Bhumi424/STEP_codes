public // Practice Problem 3

// Parent class
class Employee {
    protected String name;
    protected int employeeId;
    protected double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public void displayInfo() {
        System.out.println("Employee -> Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
    }
}

// Child class
public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary); // call Employee constructor
        this.department = department;
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting in the " + department + " department.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Manager -> Department: " + department);
    }

    // main method
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 50000);
        emp.displayInfo();
        emp.work();

        System.out.println();

        Manager mgr = new Manager("Bob", 201, 80000, "IT");
        mgr.displayInfo();
        mgr.work();
        mgr.conductMeeting();
    }
}
 {
    
}
