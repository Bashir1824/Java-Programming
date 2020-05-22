package Practice;

import java.util.Scanner;

/**
 * Write a program that asks the user to enter the name of his or her favorite city.
 * Use a String variable to store the input. The program should display the following:
 * • The number of characters in the city name
 * • The name of the city in all uppercase letters
 * • The name of the city in all lowercase letters
 * • The first character in the name of the city
 */
public class StringManipulator {
    public static void main(String[] args) {
        String cityName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Favorite City? ");
        cityName = scanner.next();
        System.out.print("\nThe Number of characters in your favorite city is: " + cityName.length());
        System.out.print("\nThe Name of your Favorite City is: " + cityName.toUpperCase());
        System.out.print("\nThe Name of your Favorite City is: " + cityName.toLowerCase());
        System.out.print("\nThe First Character in your favorite city is: " + cityName.charAt(0));

    }
}
