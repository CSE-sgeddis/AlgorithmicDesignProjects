/*
 * Written by Shalin Geddis
 */
import java.util.Scanner;
public class ABelowAverageWinter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperatures for 10 days
        System.out.println("Enter temperatures for 10 days:");

        // Array to store temperatures
        double[] temperatures = new double[10];

        // Input temperatures
        for (int i = 0; i < 10; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Calculate the average temperature
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        double averageTemperature = sum / temperatures.length;

        // Display the average temperature
        System.out.println("Average temperature: " + averageTemperature);

        // Display temperatures below the average
        System.out.println("Temperatures below the average:");
        for (int i = 0; i < 10; i++) {
            if (temperatures[i] < averageTemperature) {
                System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
            }
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
