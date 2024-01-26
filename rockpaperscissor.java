import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("0. Quit");

            int userChoice = scanner.nextInt();

            if (userChoice == 0) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                continue;
            }

            String[] choices = {"Rock", "Paper", "Scissors"};
            String userMove = choices[userChoice - 1];
            String computerMove = choices[random.nextInt(3)];

            System.out.println("Your move: " + userMove);
            System.out.println("Computer's move: " + computerMove);

            determineWinner(userMove, computerMove);

        } while (true);

        scanner.close();
    }

    private static void determineWinner(String userMove, String computerMove) {
        if (userMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if ((userMove.equals("Rock") && computerMove.equals("Scissors")) ||
                   (userMove.equals("Paper") && computerMove.equals("Rock")) ||
                   (userMove.equals("Scissors") && computerMove.equals("Paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
