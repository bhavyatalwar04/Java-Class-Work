import java.util.Scanner;

public class ques2 {

    String name;
    int age;

    ques2(String name, int age) throws Exception {
        if (!name.matches("[a-zA-Z]+")) {
            throw new Exception("Invalid Name: Your name contains numbers.");
        }
        if (age > 50) {
            throw new Exception("Invalid Age: " + age + " exceeds the limit of 50.");
        }
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Age: ");
        int age = scanner.nextInt();
        try {
            ques2 emp = new ques2(name, age);
            emp.display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bhavya Talwar");
            System.out.println("500121992");
        }
    }
}
