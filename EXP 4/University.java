
class University {

    static String universityName = "UPES";
    String studentName;

    static void displayUniversity() {
        System.out.println("University Name: " + universityName);
    }

    University(String name) {
        studentName = name;
    }

    void displayStudent() {
        System.out.println("Student Name: " + studentName + ", University: " + universityName);
    }

    public static void main(String[] args) {
        University.displayUniversity();
        University s1 = new University("Bhavya");
        University s2 = new University("Rudra");
        University s3 = new University("Arnav");
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

    }
}
