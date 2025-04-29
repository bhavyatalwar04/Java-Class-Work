
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // Create Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game instructions
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Choose one of the following options:");
        System.out.println("1: Rock");
        System.out.println("2: Paper");
        System.out.println("3: Scissors");

        // User input
        System.out.print("Enter your choice (1, 2, or 3): ");
        int userChoice = scanner.nextInt();

        // Validate user input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice! Please choose 1, 2, or 3.");
            return; // Exit the game if input is invalid
        }

        // Computer's choice (random)
        int computerChoice = random.nextInt(3) + 1;

        // Output the choices
        System.out.println("You chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Determine the winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if (isUserWinner(userChoice, computerChoice)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        // Close the scanner
        scanner.close();
    }

    // Convert number to string (Rock, Paper, Scissors)
    private static String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid";
        }
    }

    // Check if user wins
    private static boolean isUserWinner(int userChoice, int computerChoice) {
        return (userChoice == 1 && computerChoice == 3)
                || // Rock beats Scissors
                (userChoice == 2 && computerChoice == 1)
                || // Paper beats Rock
                (userChoice == 3 && computerChoice == 2);   // Scissors beats Paper
    }
}
