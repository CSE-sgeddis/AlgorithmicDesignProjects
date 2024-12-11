/*
 * Written by Shalin Geddis
 */
// AppleTester class to test the Apple class
public class AppleTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the apple tester\n");

        // Creating a default apple
        Apple defaultApple = new Apple();
        System.out.println("Printing the default apple's value\n" + defaultApple);

        // Creating another apple
        System.out.println("\nCreating another apple");
        Apple anotherApple = new Apple("Granny Smith", 0.75, 0.99);
        System.out.println("Setting the new apple's values to the following, valid values\n\"Granny Smith 0.75 0.99\"");
        System.out.println("Printing the new apple's values\n" + anotherApple);

        // Creating another default apple
        System.out.println("\nCreating another default apple");
        Apple newestApple = new Apple("iPad", 2.5, -200);
        System.out.println("Then setting the new apple's values to the following, invalid values \"iPad 2.5 -200\"");
        System.out.println("Printing the newest apple's values which should not have changed from the default values\n" + newestApple);

        // Checking if the first and last apple have the same values
        System.out.println("\nChecking if the first and last apple have the same values.");
        System.out.println(defaultApple.equals(newestApple));
    }
}