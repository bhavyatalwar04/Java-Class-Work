
class Student {

    String name;
    int age;

    Student() {
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student c1 = new Student();
        c1.display();
        Student c2 = new Student("Bhavya", 20);
        c2.display();
    }
}
