package Practice;

import java.util.Scanner;

/**
 * A car’s miles-per-gallon (MPG) can be calculated with the following formula:
 * MPG = Miles driven / Gallons of gas used
 * Write a program that asks the user for the number of miles driven and the gallons of gas
 * used. It should calculate the car’s miles-per-gallon and display the result on the screen.
 */
public class MillesPerGallon {
    public static void main(String[] args) {
    int miles;
    int gallons;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles have you driven ?");
        miles = scanner.nextInt();
        System.out.println("How many gallons of gas used ?");
        gallons = scanner.nextInt();
        int MPG = miles/gallons;
        System.out.println("Your Car's miles per gallon used is: " + MPG);

    }
}
