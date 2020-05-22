package Practice;

import java.util.Scanner;

/**
 * Write a program that asks the user to enter a number,
 * and then checks whether it is an odd number or not.
 * If the number is odd, the program should display “
 * The number is an odd number.”
 */
public class OddNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even number!");
        } else {
            System.out.println("The number is an odd number: ");

        }
    }
}
