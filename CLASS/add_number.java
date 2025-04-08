
import java.util.Scanner;

class add_number {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                System.out.println("The number is not prime");
                break;
            } else {
                System.out.println("The number is prime");
                break;
            }
        }
    }
}
