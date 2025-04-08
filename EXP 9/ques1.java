
class Thread1 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1 is running: " + (i + 1));
        }
    }
}

class Thread2 extends Thread {

    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("Thread 2 is running: " + i);
        }
    }
}

class ques1 {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
        System.out.println("Bhavya Talwar");
        System.out.println("500121992");
    }
}
