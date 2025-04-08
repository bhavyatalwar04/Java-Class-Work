
import java.util.Scanner;

class Rect {

    int l, b, area;

    public void insertData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        l = sc.nextInt();
        System.out.print("Enter the breadth: ");
        b = sc.nextInt();
    }

    public void display() {
        area = l * b;
        System.out.println("Area: " + area);
    }
}

class rect {

    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.insertData();
        r1.display();
    }
}
