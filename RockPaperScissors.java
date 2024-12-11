/*
 * Written by Shalin Geddis
 */
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;
        int rounds = 3;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        // Game loop
        while (rounds > 0) {
            System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            String computerChoice = generateComputerChoice(random);

            if (isValidChoice(userChoice)) {
                System.out.println("Computer chose: " + computerChoice);

                String winner = determineWinner(userChoice, computerChoice);
                if (winner.equals("user")) {
                    userScore++;
                    System.out.println("You win this round!");
                } else if (winner.equals("computer")) {
                    computerScore++;
                    System.out.println("Computer wins this round!");
                } else {
                    System.out.println("It's a tie!");
                }

                rounds--;
            } else {
                System.out.println("Invalid choice! Computer wins this round!");
                computerScore++;
                rounds--;
            }
        }

        // Determine overall winner
        System.out.println("Game over!");
        System.out.println("Your score: " + userScore);
        System.out.println("Computer's score: " + computerScore);

        if (userScore > computerScore) {
            System.out.println("Congratulations! You win!");
        } else if (userScore < computerScore) {
            System.out.println("Sorry! Computer wins!");
        } else {
            System.out.println("It's a tie!");
        }

        // Ask for replay
        System.out.println("Do you want to play again? (yes/no)");
        String playAgain = scanner.nextLine().toLowerCase();
        if (playAgain.equals("yes")) {
            main(null); // restart the game
        } else {
            System.out.println("Thanks for playing!");
            scanner.close();
        }
    }

    // Method to generate computer's choice
    public static String generateComputerChoice(Random random) {
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }

    // Method to determine the winner of a round
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "tie";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "user";
        } else {
            return "computer";
        }
    }

    // Method to validate user's choice
    public static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

	}
