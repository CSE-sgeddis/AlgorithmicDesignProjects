import java.util.Scanner;
public class SortingRectangles {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Your name:
		// Prompt user for the size of the collection
        System.out.print("Enter the size of the collection: ");
        int size = getValidSize(); // Get a valid size from the user
        
        // Create array to store rectangles
        Rectangle[] rectangles = new Rectangle[size];
        
        // Main menu
        int choice;
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Enter Rectangle Data");
            System.out.println("2. Sort and display Rectangles' areas from Smallest to Largest");
            System.out.println("3. Sort and display Rectangles' areas from Largest to Smallest");
            System.out.println("4. Display Average Area of the rectangles");
            System.out.println("5. Display Minimum area in the collection");
            System.out.println("6. Display Maximum area in the collection");
            System.out.println("7. Quit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enterRectangleData(rectangles);
                    break;
                case 2:
                    sortAndDisplay(rectangles, true);
                    break;
                case 3:
                    sortAndDisplay(rectangles, false);
                    break;
                case 4:
                    displayAverageArea(rectangles);
                    break;
                case 5:
                    displayMinimumArea(rectangles);
                    break;
                case 6:
                    displayMaximumArea(rectangles);
                    break;
                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);

        scanner.close(); // Close the scanner
    }

    // Method to get a valid size from the user
    private static int getValidSize() {
        int size;
        do {
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Invalid size. Size must be a positive integer.");
                System.out.print("Enter the size of the collection: ");
            }
        } while (size <= 0);
        return size;
    }

    // Method to enter rectangle data
    private static void enterRectangleData(Rectangle[] rectangles) {
        for (int i = 0; i < rectangles.length; i++) {
            System.out.print("Enter length for rectangle " + (i + 1) + ": ");
            double length = scanner.nextDouble();
            System.out.print("Enter width for rectangle " + (i + 1) + ": ");
            double width = scanner.nextDouble();
            rectangles[i] = new Rectangle(length, width);
        }
    }

    // Method to sort and display rectangles' areas
    private static void sortAndDisplay(Rectangle[] rectangles, boolean ascending) {
        if (rectangles.length == 0) {
            System.out.println("Cannot sort an empty collection.");
            return;
        }

        // Bubble sort implementation
        for (int i = 0; i < rectangles.length - 1; i++) {
            for (int j = 0; j < rectangles.length - i - 1; j++) {
                if ((ascending && rectangles[j].getArea() > rectangles[j + 1].getArea()) ||
                    (!ascending && rectangles[j].getArea() < rectangles[j + 1].getArea())) {
                    // Swap
                    Rectangle temp = rectangles[j];
                    rectangles[j] = rectangles[j + 1];
                    rectangles[j + 1] = temp;
                }
            }
        }

        // Display sorted areas
        System.out.println("Sorted areas of rectangles:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.getArea());
        }
    }

    // Method to display average area of rectangles
    private static void displayAverageArea(Rectangle[] rectangles) {
        if (rectangles.length == 0) {
            System.out.println("Cannot calculate average of an empty collection.");
            return;
        }

        double sum = 0;
        for (Rectangle rectangle : rectangles) {
            sum += rectangle.getArea();
        }
        double average = sum / rectangles.length;
        System.out.println("Average area of rectangles: " + average);
    }

    // Method to display minimum area in the collection
    private static void displayMinimumArea(Rectangle[] rectangles) {
        if (rectangles.length == 0) {
            System.out.println("Cannot find minimum in an empty collection.");
            return;
        }

        double minArea = Double.MAX_VALUE;
        for (Rectangle rectangle : rectangles) {
            if (rectangle.getArea() < minArea) {
                minArea = rectangle.getArea();
            }
        }
        System.out.println("Minimum area in the collection: " + minArea);
    }

    // Method to display maximum area in the collection
    private static void displayMaximumArea(Rectangle[] rectangles) {
        if (rectangles.length == 0) {
            System.out.println("Cannot find maximum in an empty collection.");
            return;
        }

        double maxArea = Double.MIN_VALUE;
        for (Rectangle rectangle : rectangles) {
            if (rectangle.getArea() > maxArea) {
                maxArea = rectangle.getArea();
            }
        }
        System.out.println("Maximum area in the collection: " + maxArea);
    }
}

// Rectangle class
class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }

	}
