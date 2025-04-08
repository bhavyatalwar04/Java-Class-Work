
class Worker {

    String name;
    double salaryRate;

    Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    String getName() {
        return name;
    }

    double computePay(int hours) {
        return hours * salaryRate;
    }

}

class DailyWorker extends Worker {

    DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    double computePay(int hours) {
        int days = (int) Math.ceil(hours / 8.0);
        return days * 8 * salaryRate;
    }
}

class SalariedWorker extends Worker {

    SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    double computePay(int hours) {
        return 40 * salaryRate;
    }
}

class Ques3 {

    public static void main(String[] args) {
        Worker d = new DailyWorker("Bhavya", 10.0);
        Worker s = new SalariedWorker("Aditya", 20.0);

        // Test daily worker with 35 hours
        System.out.printf("Weekly pay for %s:\n", d.getName());
        System.out.printf("Hours worked: %d\n", 35);
        System.out.printf("Pay: $%.2f\n\n", d.computePay(35));

        // Test salaried worker with 45 hours
        System.out.printf("Weekly pay for %s:\n", s.getName());
        System.out.printf("Hours worked: %d\n", 5);
        System.out.printf("Pay: $%.2f\n\n", s.computePay(5));
    }
}
