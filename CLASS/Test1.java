
class Student {

    int roll;
    String name;
    double marks;

    public void setData(int r, String s, double m) {
        roll = r;
        name = s;
        marks = m;
    }

    public void getData() {
        System.out.println("roll number: " + roll);
        System.out.println("name: " + name);
        System.out.println("marks " + marks);
    }
}

class Test1 {

    public static void main(String[] args) {
        Student S1 = new Student();
        S1.setData(49, "Rahul", 90.54);
        S1.getData();
        System.err.println();
    }
}
