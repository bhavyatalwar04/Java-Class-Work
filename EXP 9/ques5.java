
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

class Thread3 extends Thread {

    public void run() {
        for (int i = 11; i <= 15; i++) {
            System.out.println("Thread 3 is running: " + i);
        }
    }
}

class ques5 {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Priority Value of t1 thread=" + t1.getPriority());
        System.out.println("Priority Value of t2 thread=" + t2.getPriority());
        System.out.println("Priority Value of t3 thread=" + t3.getPriority());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Bhavya Talwar");
        System.out.println("500121992");
    }
}
