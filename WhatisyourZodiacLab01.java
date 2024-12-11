/*
 * Written by Shalin Geddis
 */
import java.util.Scanner;

public class WhatisyourZodiacLab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		 // User inputs month and day
        System.out.println("Enter your birth month and day as two separate whole numbers:");
        System.out.print("Month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Day: ");
        int day = scanner.nextInt();

        // Check if month is valid
        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
            scanner.close();
            return;
        }

        // Check if day is valid based on month
        int maxDay;
        switch (month) {
            case 4: case 6: case 9: case 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 29; // Assume February has 29 days
                break;
            default:
                maxDay = 31;
        }

        if (day < 1 || day > maxDay) {
            System.out.println("Invalid day for the given month.");
            scanner.close();
            return;
            
        }

        // Determine Zodiac sign
        String zodiacSign = determineZodiacSign(month, day);

        // Print result
        System.out.println("Your Zodiac Sign is: " + zodiacSign);

        scanner.close();
    }

    // Method to determine the Zodiac sign based on month and day
    public static String determineZodiacSign(int month, int day) {
        switch (month) {
            case 1:
                return (day <= 19) ? "Capricorn" : "Aquarius";
            case 2:
                return (day <= 18) ? "Aquarius" : "Pisces";
            case 3:
                return (day <= 20) ? "Pisces" : "Aries";
            case 4:
                return (day <= 19) ? "Aries" : "Taurus";
            case 5:
                return (day <= 20) ? "Taurus" : "Gemini";
            case 6:
                return (day <= 20) ? "Gemini" : "Cancer";
            case 7:
                return (day <= 22) ? "Cancer" : "Leo";
            case 8:
                return (day <= 22) ? "Leo" : "Virgo";
            case 9:
                return (day <= 22) ? "Virgo" : "Libra";
            case 10:
                return (day <= 22) ? "Libra" : "Scorpio";
            case 11:
                return (day <= 21) ? "Scorpio" : "Sagittarius";
            case 12:
                return (day <= 21) ? "Sagittarius" : "Capricorn";
            default:
                return "Invalid date";
	}
    
}
}
