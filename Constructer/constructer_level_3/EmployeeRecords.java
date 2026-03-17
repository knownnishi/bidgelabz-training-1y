class Employee {
    public int employeeID;          // public
    protected String department;    // protected
    private double salary;          // private

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        setSalary(salary);
    }

    // Public getter
    public double getSalary() {
        return salary;
    }

    // Public setter with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }

    public void displayDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : $" + salary);
    }
}

// Subclass demonstrating access to public and protected members
class Manager extends Employee {
    private String managerLevel;  // e.g., "Junior", "Senior"

    public Manager(int employeeID, String department,
                   double salary, String managerLevel) {
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }

    public void giveRaise(double percent) {
        double newSalary = getSalary() * (1 + percent / 100);
        setSalary(newSalary);
        System.out.println("Raise of " + percent + "% applied.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee ID   : " + employeeID);       // public ✅
        System.out.println("Department    : " + department);        // protected ✅
        System.out.println("Salary        : $" + getSalary());     // private via getter ✅
        System.out.println("Manager Level : " + managerLevel);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Engineering", 60000.00);
        emp.displayDetails();

        System.out.println("\nUpdating salary...");
        emp.setSalary(65000.00);
        System.out.println("New Salary: $" + emp.getSalary());

        System.out.println("\n--- Manager ---");
        Manager mgr = new Manager(201, "HR", 90000.00, "Senior");
        mgr.displayDetails();

        System.out.println();
        mgr.giveRaise(10);
        System.out.println("Salary after raise: $" + mgr.getSalary());

        // emp.salary = 0; ❌ ERROR: salary is private
    }
}


