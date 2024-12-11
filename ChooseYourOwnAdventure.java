/*
 * Written by Shalin Geddis
 */
import java.util.Scanner;
public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Choose Your Own Adventure game!");
        System.out.println("You find yourself standing at a crossroad. Which path will you choose?");
        System.out.println("1. Take the left path");
        System.out.println("2. Take the right path");
        int choice1 = scanner.nextInt();
        
        if (choice1 == 1) {
            // Path 1
            System.out.println("You encounter a river. What will you do?");
            System.out.println("1. Swim across");
            System.out.println("2. Look for a bridge");
            int choice2 = scanner.nextInt();
            
            if (choice2 == 1) {
                // Path 1.1
                System.out.println("You successfully swim across the river.");
                System.out.println("You find a treasure chest! You win!");
            } else if (choice2 == 2) {
                // Path 1.2
                System.out.println("You find a bridge and cross it safely.");
                System.out.println("You come across a group of friendly villagers who guide you home.");
                System.out.println("Congratulations, you made it!");
            } else {
                System.out.println("Invalid choice. Game over.");
            }
            
        } else if (choice1 == 2) {
            // Path 2
            System.out.println("You come across a cave. What will you do?");
            System.out.println("1. Enter the cave");
            System.out.println("2. Keep walking past the cave");
            int choice3 = scanner.nextInt();
            
            if (choice3 == 1) {
                // Path 2.1
                System.out.println("You enter the cave and find a sleeping dragon!");
                System.out.println("What will you do now?");
                System.out.println("1. Try to sneak past the dragon");
                System.out.println("2. Wake up the dragon");
                int choice4 = scanner.nextInt();
                
                if (choice4 == 1) {
                    // Path 2.1.1
                    System.out.println("You successfully sneak past the dragon and find a hidden treasure!");
                    System.out.println("Congratulations, you win!");
                } else if (choice4 == 2) {
                    // Path 2.1.2
                    System.out.println("You wake up the dragon and it devours you. Game over.");
                } else {
                    System.out.println("Invalid choice. Game over.");
                }
                
            } else if (choice3 == 2) {
                // Path 2.2
                System.out.println("You keep walking and find a beautiful garden.");
                System.out.println("You relax in the garden and find inner peace.");
                System.out.println("Congratulations, you made it!");
            } else {
                System.out.println("Invalid choice. Game over.");
            }
            
        } else {
            System.out.println("Invalid choice. Game over.");
        }
        
        scanner.close();
    }
}