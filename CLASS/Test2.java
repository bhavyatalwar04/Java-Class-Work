
import java.util.Scanner;

class bank {

    String name;
    int accno;
    int bal;

    public void insertData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the account number: ");
        accno = sc.nextInt();
        System.out.print("Enter the balance: ");
        bal = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account number: " + accno);
        System.out.println("Balance: " + bal);
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        int dep = sc.nextInt();
        bal = bal + dep;
        System.err.println("Balance after deposit: " + bal);
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        int with = sc.nextInt();
        bal = bal - with;
        System.out.println("Balance after withdrawal: " + bal);
    }

}

class Test2 {

    public static void main(String[] args) {
        bank b1 = new bank();
        b1.insertData();
        b1.display();
        b1.deposit();
        b1.withdraw();
    }
}
