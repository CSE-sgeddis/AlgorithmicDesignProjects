/*
 * Written by Shalin Geddis
 */

class DresserFrontEnd {
    public static void main(String[] args) {
        Dresser dresser = new Dresser();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Welcome to the dresser!\n");
        while (true) {
            System.out.println("Enter 1: to add an item\n" +
                               "Enter 2: to remove an item\n" +
                               "Enter 3: to print out the dresser contents\n" +
                               "Enter 9: to quit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the type\n" +
                                       "It may be undergarment, socks, stockings, top, bottom, or cape");
                    String type = scanner.nextLine();
                    System.out.println("Enter a color\n" +
                                       "It may be brown, pink, orange, green, blue, purple, or grey");
                    String color = scanner.nextLine();
                    dresser.add(new Clothing(type, color));
                    break;
                case 2:
                    System.out.println("Enter the type\n" +
                                       "It may be undergarment, socks, stockings, top, bottom, or cape");
                    type = scanner.nextLine();
                    System.out.println("Enter a color\n" +
                                       "It may be brown, pink, orange, green, blue, purple, or grey");
                    color = scanner.nextLine();
                    dresser.remove(new Clothing(type, color));
                    break;
                case 3:
                    dresser.print();
                    break;
                case 9:
                    System.out.println("Goodbye");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}