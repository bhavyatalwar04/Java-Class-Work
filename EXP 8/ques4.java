
import java.util.Scanner;

public class ques4 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an index to access the array element: ");
            int index = sc.nextInt();
            System.out.println("Element at index " + index + ": " + a[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a value between 0 and 4.");
        } finally {
            System.out.println("Array access attempted.");
            System.out.println("Bhavya Talwar");
            System.out.println("500121992");
        }
    }
}
