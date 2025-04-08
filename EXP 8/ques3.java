
import java.util.Scanner;

class ques3 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            double div = a / b;
            System.out.println("The quotient is: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Operation completed.");
            System.out.println("Bhavya Talwar");
            System.out.println("500121992");
        }

    }
}
