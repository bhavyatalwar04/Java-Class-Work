
class Employee {

    String name;
    int empid;
    double salary;

    Employee() {
        name = "Employee Name";
        empid = 0;
        salary = 0.0;
    }

    Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }
}

class Manager extends Employee {

    String department;

    Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }
}

class ques5 {

    public static void main(String[] args) {
        Employee emp = new Employee("Bhavya", 1234, 50000.0);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
        emp.increaseSalary(10);
        System.out.println("Salary after increase: " + emp.getSalary());

        Manager man = new Manager("Rudra", 5678, 70000.0, "CSE");
        System.out.println("\nManager Name: " + man.getName());
        System.out.println("Manager Salary: " + man.getSalary());
        System.out.println("Manager Department: " + man.department);
        man.increaseSalary(10);
        System.out.println("Salary after increase: " + man.getSalary());

    }
}
