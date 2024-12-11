/*
 * Written by Shalin Geddis
 */
import java.util.Scanner;
public class DateAndTimeTester {
	Scanner scanner;

    // Constructor to initialize scanner
    public DateAndTimeTester() {
        scanner = new Scanner(System.in);
    }

    // Method to handle input from the user
    public void run() {
        System.out.println("Please enter date and time (MM/DD hh:mm): ");
        String inputDateTime = scanner.nextLine();

        boolean isValidDateTime = isValid(inputDateTime);
        if (isValidDateTime) {
            System.out.println("Input date and time is valid.");
        } else {
            System.out.println("Input date and time is not valid.");
        }
    }

    // Method to check if a given string has the correct date and time format
    public boolean isValid(String inputDateTime) {
        String[] dateTimeParts = inputDateTime.split(" ");
        if (dateTimeParts.length != 2) {
            return false;
        }
        String datePart = dateTimeParts[0];
        String timePart = dateTimeParts[1];
        return isValidDate(datePart) && isValidTime(timePart);
    }

    // Method to check if a given string has the correct date format
    public boolean isValidDate(String inputDate) {
        String[] dateParts = inputDate.split("/");
        if (dateParts.length != 2) {
            return false;
        }
        int month = getMonth(inputDate);
        int day = getDay(inputDate);
        return (month >= 1 && month <= 12) && (day >= 1 && day <= 28);
    }

    // Method to check if a given string has the correct time format
    public boolean isValidTime(String inputTime) {
        String[] timeParts = inputTime.split(":");
        if (timeParts.length != 2) {
            return false;
        }
        int hour = getHour(inputTime);
        int minute = getMinute(inputTime);
        return (hour >= 1 && hour <= 12) && (minute >= 0 && minute <= 59);
    }

    // Method to get the month from the given date string
    public int getMonth(String inputDate) {
        String[] dateParts = inputDate.split("/");
        return Integer.parseInt(dateParts[0]);
    }

    // Method to get the day from the given date string
    public int getDay(String inputDate) {
        String[] dateParts = inputDate.split("/");
        return Integer.parseInt(dateParts[1]);
    }

    // Method to get the hour from the given time string
    public int getHour(String inputTime) {
        String[] timeParts = inputTime.split(":");
        return Integer.parseInt(timeParts[0]);
    }

    // Method to get the minute from the given time string
    public int getMinute(String inputTime) {
        String[] timeParts = inputTime.split(":");
        return Integer.parseInt(timeParts[1]);
    }

    public static void main(String[] args) {
        DateAndTimeTester tester = new DateAndTimeTester();
        tester.run();
    }

}
