
import java.util.Scanner;

class TrunkCall {

    int duration;
    double chargeRate;
    String Type;

    TrunkCall(int duration) {
        this.duration = duration;
    }

    double calculateCharge() {
        return duration * chargeRate;
    }

    void displayCharge() {
        System.out.println("Total Charge: $" + calculateCharge());
    }

    String getType() {
        return Type;
    }

}

class OrdinaryTrunkCall extends TrunkCall {

    OrdinaryTrunkCall(int duration) {
        super(duration);
        chargeRate = 0.5;
        Type = "Ordinary";
    }
}

class UrgentTrunkCall extends TrunkCall {

    UrgentTrunkCall(int duration) {
        super(duration);
        chargeRate = 1.0;
        Type = "Urgent";
    }
}

class LightningTrunkCall extends TrunkCall {

    LightningTrunkCall(int duration) {
        super(duration);
        chargeRate = 1.5;
        Type = "Lightning";
    }
}

class ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("My Name is: Bhavya Talwar (500121992)");

        System.out.print("Enter duration of the call (in mins): ");
        int duration = sc.nextInt();

        System.out.print("Enter type of the call (Ordinary, Urgent, Lightning): ");
        String type = sc.next();

        TrunkCall call;

        switch (type) {
            case "Ordinary":
                call = new OrdinaryTrunkCall(duration);
                break;
            case "Urgent":
                call = new UrgentTrunkCall(duration);
                break;
            case "Lightning":
                call = new LightningTrunkCall(duration);
                break;
            default:
                System.out.println("Invalid type");
                return;
        }

        call.displayCharge();
    }
}
