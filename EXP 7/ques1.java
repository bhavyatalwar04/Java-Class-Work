
abstract class Shape {

    abstract double calculatearea();
}

class Rectangle extends Shape {

    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    double calculatearea() {
        return l * b;
    }
}

class Circle extends Shape {

    double r;
    final double PI = 3.14;

    Circle(double r) {
        this.r = r;
    }

    double calculatearea() {
        return PI * r * r;
    }
}

class ques1 {

    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rect.calculatearea());
        Shape cir = new Circle(7);
        System.out.println("Area of Circle: " + cir.calculatearea());
    }
}
