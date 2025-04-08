
abstract class Employee {

    abstract void calculateSalary();

    abstract void displayDetails();
}

class Manager extends Employee {

    String name;
    String role;
    double salary;

    Manager(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Salary of Manager: " + salary);
    }

    void displayDetails() {
        System.out.println("Name: " + name + "\nRole: " + role);
    }
}

class Developer extends Employee {

    String name;
    String role;
    double hourlyWage;
    int hoursWorked;

    Developer(String name, String role, double hourlyWage, int hoursWorked) {
        this.name = name;
        this.role = role;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        System.out.println("Salary of Developer: " + (hourlyWage * hoursWorked));
    }

    void displayDetails() {
        System.out.println("Name: " + name + "\nRole: " + role);
    }
}

public class ques2 {

    public static void main(String[] args) {
        Manager man = new Manager("Bhavya Talwar", "Manager", 50000);
        Developer dev = new Developer("Aditya", "Developer", 10, 40);
        man.displayDetails();
        man.calculateSalary();
        dev.displayDetails();
        dev.calculateSalary();
    }
}
