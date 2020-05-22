package Doubts;

import java.util.Scanner;

/**
 *Write a program that prompts the user to enter a number within the range of 1 through 10.
 *The program should display the Roman numeral version of that number.
 *If the number is outside the range of 1 through 10, the program should display an error message.
 */
public class RomanNumerals {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number Between 0-10");
        number = scanner.nextInt();
        if(number<=10){
            System.out.println("The number entered is: " + number);
        }
        else{
            System.err.println("Wrong number Try again!");
        }
    }
}
