
import java.util.Scanner;
class sum_digits {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n/=10;
        }
        System.out.println("The sum of digits is " + sum);
    }
}
