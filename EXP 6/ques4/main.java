
final class Logger {

    void logMessage(String message) {
        System.out.println(message);
    }
}

// class ExtendedLogger extends Logger {
// Uncommenting the following method will result in a compilation error
//     void logMessage(String message) {
//         System.out.println("Overridden logMessage method");
//     }
// }   
public class main {

    public static void main(String[] args) {
        Logger logger = new Logger(); // Creating a Logger object
        logger.logMessage("This is a sample message."); // Calling the logMessage method
    }
}
