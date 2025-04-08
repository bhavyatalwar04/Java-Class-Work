
class MathConstants {

    final double PI = 3.14159; // Declaring a final variable PI

    final void displayPI() { // Declaring a final method displayPI
        System.out.println("The value of PI is: " + PI);
    }
}

class Circle extends MathConstants {

    void calculateArea(double radius) {
        double area = PI * radius * radius; // Calculating the area of the circle
        System.out.println("The area of the circle is: " + area);
    }

    // Uncommenting the following method will result in a compilation error
    // void displayPI() {
    //     System.out.println("Overridden displayPI method");
    // }
}

public class main {

    public static void main(String[] args) {
        Circle c = new Circle(); // Creating a Circle object
        c.calculateArea(5); // Calling the calculateArea method
        c.displayPI(); // Calling the displayPI method
    }
}
