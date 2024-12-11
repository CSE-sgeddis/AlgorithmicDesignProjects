/*
 * Written by Shalin Geddis
 */
import java.util.Scanner;
public class Homework00BinaryChanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Input the first binary number
		System.out.print("Enter the first four-digit binary number: ");
		String binary1 = scanner.next();
		int decimal1 = binaryToDecimal(binary1);
		
		// Input the second binary number
		System.out.print("Enter the second four-digit binary number: ");
		String binary2 = scanner.next();
		int decimal2 = binaryToDecimal(binary2);
		
		// Perform addition
		int sum = decimal1 + decimal2;
		
		// Output results
		System.out.println("Decimal equivalent of " + binary1 + " is: " + decimal1);
        System.out.println("Decimal equivalent of " + binary2 + " is: " + decimal2);
        System.out.println("Sum of " + decimal1 + " and " + decimal2 + " is: " + sum);

        scanner.close();
		
	}
// Method to convert binary to decimal
// Converts a binary string to its equivalent decimal integer representation
public static int binaryToDecimal(String binary) {
	int decimal = 0;
	int length = binary.length();
	
	// Convert binary to decimal 
	for (int i = 0; i < length; i++) {
		// Start from the rightmost bit
		char bit = binary.charAt(length - i - 1);
		if (bit == '1') {
			// If bit is 1, add the corresponding power of 2
			decimal += Math.pow(2, i);
		
		}
	}
	return decimal;
}
}
