package Doubts;

import java.util.Scanner;

/**
 * An Internet service provider has three different subscription packages for its customers:
 * Package A:
 * For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour.
 * Package B:
 * For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.
 * Package C:
 * For $19.95 per month unlimited access is provided.
 *Write a program that calculates a customer’s monthly bill.
 * It should ask the user to enter the letter of the package
 * the customer has purchased (A, B, or C) and the number of hours
 * that were used. It should then display the total charges.
 */
public class InternetServiceProvider {
    public static void main(String[] args) {
        String letter;
        double hours;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letter of the package you purchased: ");
        letter = scanner.next();
        if (letter.contains("A")){
            System.out.println("Enter the number of hours used: ");
            hours = scanner.nextDouble();
            double totalA = hours * 0.995;
            System.out.println("The Total charge is: £" + totalA);
            if (hours >10){
                System.err.println("The Total charge is: £" + hours * 2.00);
            }
        }
        else if (letter.contains("B")){
            System.out.println("Enter the number of hours used: ");
            hours = scanner.nextDouble();
            double totalB = hours * 0.6975;
            System.out.println("The Total charge is: £" + totalB);
            if (hours >20){
                System.err.println("The Total charge is: £" + hours * 1.00);
            }
        }
        else if (letter.contains("C")){
            System.out.println("Enter the number of hours used: ");
            hours = scanner.nextDouble();
            double totalC = 19.95;
            System.out.println("The Total charge is: £" + totalC);
        }
        else {
            System.err.println("Invalid entry Please check again!");
        }
    }
}
