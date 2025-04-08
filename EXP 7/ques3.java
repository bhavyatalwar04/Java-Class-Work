
interface Bank {

    void deposit(double amount);

    void withdraw(double amount);
}

class Account implements Bank {

    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Withdrawn: " + amount);
            System.out.println("Insufficient balance");
        }
    }
}

public class ques3 {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(600);
        System.out.println("Balance: " + acc.balance);
    }
}
