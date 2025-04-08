
class Thread1 extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 1 is running: " + (i + 1));
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 2 is running: " + (i + 1));
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Thread3 extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 3 is running: " + (i + 1));
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ques4 {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        System.out.println("Thread-1 Started");
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Thread-1 Finished");
        System.out.println("Thread-2 Started");
        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Thread-2 Finished");
        System.out.println("Thread-3 Started");
        t3.start();
        try {
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Thread-3 Finished");
        System.out.println("Bhavya Talwar");
        System.out.println("500121992");
    }
}
