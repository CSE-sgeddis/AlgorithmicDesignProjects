/*
 * Written by Shalin Geddis
 */
import java.util.Scanner;
public class PBJFrontEnd {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("Welcome to the PBJ Sandwich Maker!");
        System.out.println("-----------------------------------");

        // Creating Sandwich 1
        System.out.println("-----Sandwich 1-----");
        PBJSandwich sandwich1 = createSandwich(scanner);

        // Creating Sandwich 2
        System.out.println("-----Sandwich 2-----");
        PBJSandwich sandwich2 = createSandwich(scanner);

        // Printing Sandwiches
        System.out.println("-----Sandwich 1-----");
        System.out.println(sandwich1);

        System.out.println("\n-----Sandwich 2-----");
        System.out.println(sandwich2);

        // Checking if sandwiches are equal
        System.out.println("\nAre they the same sandwich? " + sandwich1.equals(sandwich2));

        scanner.close();
    }

    // Method to create a sandwich
    private static PBJSandwich createSandwich(Scanner scanner) {
        PBJSandwich sandwich = new PBJSandwich();

        // Top Slice of Bread Information
        System.out.println("Top Slice of Bread Information");
        Bread topBread = new Bread();
        System.out.print("Enter name of the bread: ");
        topBread.setName(scanner.nextLine());
        System.out.print("Enter the number of calories: ");
        topBread.setCalories(Integer.parseInt(scanner.nextLine()));
        System.out.print("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\": ");
        topBread.setType(scanner.nextLine());

        sandwich.setTopSlice(topBread);

        // Peanut Butter Information
        System.out.println("\nPeanut Butter Information");
        PeanutButter peanutButter = new PeanutButter();
        System.out.print("Enter name of the peanut butter: ");
        peanutButter.setName(scanner.nextLine());
        System.out.print("Enter the number of calories: ");
        peanutButter.setCalories(Integer.parseInt(scanner.nextLine()));
        System.out.print("Is it crunchy? Enter \"true\" or \"false\": ");
        peanutButter.setCrunchy(Boolean.parseBoolean(scanner.nextLine()));

        sandwich.setPeanutButter(peanutButter);

        // Jelly Information
        System.out.println("\nJelly Information");
        Jelly jelly = new Jelly();
        System.out.print("Enter name of the jelly: ");
        jelly.setName(scanner.nextLine());
        System.out.print("Enter the number of calories: ");
        jelly.setCalories(Integer.parseInt(scanner.nextLine()));
        System.out.print("Enter the type of fruit. Must be \"Apple\", \"Blackberry\", \"Grape\", \"Blueberry\", or \"Tomato\": ");
        jelly.setFruitType(scanner.nextLine());

        sandwich.setJelly(jelly);

        // Bottom Slice of Bread Information
        System.out.println("\nBottom Slice of Bread Information");
        Bread bottomBread = new Bread();
        System.out.print("Enter name of the bread: ");
        bottomBread.setName(scanner.nextLine());
        System.out.print("Enter the number of calories: ");
        bottomBread.setCalories(Integer.parseInt(scanner.nextLine()));
        System.out.print("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\": ");
        bottomBread.setType(scanner.nextLine());

        sandwich.setBottomSlice(bottomBread);

        return sandwich;
    }
}
