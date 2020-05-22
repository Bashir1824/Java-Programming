package Practice;

import java.util.Scanner;

/**
 * The following table shows the approximate speed of sound in air, water, and steel:
 * Medium
 * Air
 * Water
 * Steel
 * Speed
 * 1,100 feet per second
 * 4,900 feet per second
 * 16,400 feet per second
 * Write a program that asks the user to enter “air”, “water”, or “steel”,
 * and the distance that a sound wave will travel in the medium.
 * The program should then display the amount of time it will take.
 * You can calculate the amount of time it takes sound to travel in air with the following formula:
 * Time 5 Distance / 1,100
 * You can calculate the amount of time it takes sound to travel in water with the follow-
 * ing formula:
 * Time 5 Distance / 4,900
 * You can calculate the amount of time it takes sound to travel in steel with the follow- ing formula:
 * Time 5 Distance / 16,400
 */
public class TheSpeedOfSound {
    public static void main(String[] args) {
        String name ;
        double air;
        double water;
        double steel;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Speed you like to calculate? " + "\nAir \nWater \nSteel");
        name = scanner.next();
        if (name.contains("Air")){
            System.out.println("Enter the distance Air sound traveled: " );
            air = scanner.nextDouble();
            double timeA = air /1100;
            System.out.println("The amount of time it takes sound to travel in air is: " + timeA + " Feet per second");

        }
        else if (name.contains("Water")){
            System.out.println("Enter the distance Water sound traveled: " );
            water =scanner.nextDouble();
            double timeW = water /4900;
            System.out.println("The amount of time it takes sound to travel in Water is: " + timeW + " Feet per second");
        }
        else if (name.contains("Steel")){
            System.out.println("Enter the distance Steel sound traveled: " );
            steel = scanner.nextDouble();
            double timeS = steel / 16400;
            System.out.println("The amount of time it takes sound to travel in Steel is: " + timeS + " Feet per second");
        }
        else {
            System.err.println("Invalid Input please try again!");
        }
    }
}
