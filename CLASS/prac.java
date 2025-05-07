
// import java.io.*;
// import java.util.*;
// class prac {
//     public static void main(String[] args) {
//         File file = new File("bhavya.txt");
//         try {
//             if (file.exists()) {
//                 System.out.println("File" + file.getName() + "already exists");
//             } else {
//                 if (file.createNewFile()) {
//                     System.out.println("File" + file.getName() + "created successfully");
//                 } else {
//                     System.out.println("Creation Failed");
//                 }
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         if (file.exists()) {
//             System.out.println("PATH: " + file.getPath());
//             System.out.println("Absolute PATH: " + file.getAbsolutePath());
//             System.out.println("Size: " + file.length());
//             System.out.println("Last modified: " + new Date(file.lastModified()));
//         } else {
//             System.out.println("File does not exist");
//         }
//         File obj = new File("OOPS");
//         if (obj.mkdir()) {
//             System.out.println("Directory: " + obj.getName());
//         } else {
//             System.out.println("Creation failed");
//         }
//         if (obj.isDirectory()) {
//             System.out.println(obj.getName() + " is a directory");
//         }
//     }
// }
// import java.io.*;
// import java.util.*;

// class prac {

//     public static void readFile(String filename) throws FileNotFoundException {
//         File file = new File(filename);
//         try {
//             FileReader r = new FileReader(file);
//             int ch;
//             while ((ch = r.read()) != -1) {
//                 System.out.println((char) ch);
//                 r.close();
//             }
//         } catch (FileNotFoundException e) {
//             System.out.println(e);
//         }
//         finally{
//             System.out.println("File operation executed");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String filename=sc.nextLine();
//         readFile(filename);
//     }

// }
