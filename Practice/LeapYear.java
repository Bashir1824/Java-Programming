package Practice;

import java.util.Scanner;

/**
 *Write a program that asks the user to enter a year and then checks whether it is a leap year or not.
 * If it is a leap year, the program should display the message “The year is a leap year.”
 */
public class LeapYear {
    public static void main(String[] args) {
        double year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = scanner.nextDouble();
        if (year % 4 ==0 ){
            System.out.println("The year is a leap year.");
        }
        else {
            System.err.println("The year is not a leap year!");
        }
    }
}
