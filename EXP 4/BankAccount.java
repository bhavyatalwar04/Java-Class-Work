
class BankAccount {

    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    protected void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposit(1000);
        b1.checkBalance();
        b1.withdraw(500);
        b1.checkBalance();
        System.out.println(b1.balance);
    }

}
