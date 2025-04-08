
class MyThread1 extends Thread {

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Running Thread1 " + i);
        }
    }

}

class MyThread2 extends Thread {

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Running Thread2 " + i);
        }
    }
}

class thread {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
