class NonNumericException extends Exception {
    public NonNumericException(String message) {
        super(message);
    }
}
public class ques1 {
    static double Numeric(String arg) throws NonNumericException {
        try {
            return Double.parseDouble(arg);
        } catch (NumberFormatException e) {
            throw new NonNumericException("Invalid numeric operand: " + arg);
        } 
    }
    public static void main(String[] args) {
        try {
            double a = Numeric(args[0]);
            double b = Numeric(args[1]);
            double sum = a + b;
            System.out.println("Sum: " + sum);
        } catch (NonNumericException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            System.out.println("Bhavya Talwar");
            System.out.println("500121992");
        }
    }
}
