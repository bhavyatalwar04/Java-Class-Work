
class SuperClass {

    private int val = 42;
    int num = 42;
}

class SubClass extends SuperClass {

    public void display() {
        System.out.println("Public Value: " + num);
        // System.out.println("Private Value: " + val);
    }
}

public class ques1 {

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
