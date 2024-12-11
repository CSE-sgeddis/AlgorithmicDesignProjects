/*
 * Written by Shalin Geddis
 */
import java.util.Scanner;
public class TriangleMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Welcome message
        System.out.println("Welcome to Triangle Maker! Enter the size of the triangle.");

        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the size of the triangle from the user
        int size = scanner.nextInt();

        // Check for errors
        if (size <= 0) {
            System.out.println("Error: Please enter a positive non-zero number.");
            // Exit the program
            System.exit(1);
        }

        // Draw the triangle
        drawTriangle(size);

        // Close the scanner
        scanner.close();
    }

    // Method to draw the triangle
    public static void drawTriangle(int size) {
        // Draw the upper half of the triangle
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Draw the lower half of the triangle
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
	}

