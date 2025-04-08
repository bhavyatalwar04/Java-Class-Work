
import java.util.Scanner;

class triangle_area {

    public static void main(String[] args) {
        // ...existing code...
        System.out.println("Area of triangle is: " + area);

        // New code for normal triangle
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double userBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double userHeight = scanner.nextDouble();
        double userArea = 0.5 * userBase * userHeight;
        System.out.println("Area of the triangle (user input) is: " + userArea);
        scanner.close();
    }
}
