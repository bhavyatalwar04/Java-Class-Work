
// class bubble {
//     public static void main(String[] args) {
//         int[] arr = new int[5];
//         arr[0] = 5;
//         arr[1] = 1;
//         arr[2] = 0;
//         arr[3] = 6;
//         arr[4] = 9;
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.err.println(arr[i]);
//         }
//     }
// }
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class bubble {

    public static void main(String[] args) {
        Student[] students = {
            new Student("Bhavya", 22),
            new Student("Arnav", 19),
            new Student("Rudra", 21),
            new Student("Arunangshu", 20)
        };

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].age > students[j + 1].age) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("Students sorted by age:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}
