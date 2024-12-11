/*
 * Written by Shalin Geddis
 */
import java.util.Scanner;
import java.util.Random;
public class PotholeDriving {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] grid = new char[10][10];
        boolean[][] potholes = new boolean[10][10];

        // Initialize grid
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = '-';
            }
        }

        // Add potholes
        int potholeCount = 0;
        while (potholeCount < 5) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            if (!potholes[x][y]) {
                potholes[x][y] = true;
                potholeCount++;
            }
        }

        // Set car and home positions
        int carX = 0, carY = 0;
        int homeX = 9, homeY = 9;
        grid[carX][carY] = 'X';
        grid[homeX][homeY] = '^';

        boolean gameOver = false;

        while (!gameOver) {
            // Display grid
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (grid[i][j] == 'X' || grid[i][j] == '^') {
                        System.out.print(grid[i][j] + " ");
                    } else {
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }

            // User input
            System.out.println("Enter direction (N, S, E, W, NE, NW, SE, SW):");
            String direction = scanner.nextLine().toUpperCase();

            // Move car
            switch (direction) {
                case "N":
                    if (carX > 0) carX--;
                    break;
                case "S":
                    if (carX < 9) carX++;
                    break;
                case "E":
                    if (carY < 9) carY++;
                    break;
                case "W":
                    if (carY > 0) carY--;
                    break;
                case "NE":
                    if (carX > 0 && carY < 9) {
                        carX--;
                        carY++;
                    }
                    break;
                case "NW":
                    if (carX > 0 && carY > 0) {
                        carX--;
                        carY--;
                    }
                    break;
                case "SE":
                    if (carX < 9 && carY < 9) {
                        carX++;
                        carY++;
                    }
                    break;
                case "SW":
                    if (carX < 9 && carY > 0) {
                        carX++;
                        carY--;
                    }
                    break;
                default:
                    System.out.println("Invalid direction!");
            }

            // Check for win or lose
            if (potholes[carX][carY]) {
                System.out.println("Game Over! You landed on a pothole!");
                gameOver = true;
            } else if (carX == homeX && carY == homeY) {
                System.out.println("Congratulations! You reached home!");
                gameOver = true;
            }
        }

        // Ask for replay
        System.out.println("Do you want to play again? (yes/no)");
        String playAgain = scanner.nextLine().toLowerCase();
        if (playAgain.equals("yes")) {
            main(null); // Restart the game
        } else {
            System.out.println("Thank you for playing!");
        }
        scanner.close();
	}

}
