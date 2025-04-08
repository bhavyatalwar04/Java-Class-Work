
class Thread3 implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1 is running: " + (i + 1));
        }
    }
}

class Thread4 implements Runnable {

    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("Thread 2 is running: " + i);
        }
    }
}

class ques2 {

    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        Thread t3 = new Thread(t1);
        t3.start();
        Thread4 t2 = new Thread4();
        Thread t4 = new Thread(t2);
        t4.start();
        System.out.println("Bhavya Talwar");
        System.out.println("500121992");
    }
}
