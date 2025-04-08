
import java.util.Scanner;

class Thread1 extends Thread {

    int n;

    Thread1(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Thread 1 is even: " + i);
            }
        }
    }
}

class Thread2 extends Thread {

    int n;

    Thread2(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("Thread 2 is odd: " + i);
            }
        }
    }
}

class ques3 {

    public static void main(String[] args) {
        System.err.print("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Thread1 t1 = new Thread1(n);
        t1.start();
        Thread2 t2 = new Thread2(n);
        t2.start();
        System.out.println("Bhavya Talwar");
        System.out.println("500121992");
    }
}
