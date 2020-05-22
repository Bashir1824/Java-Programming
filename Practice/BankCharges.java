package Practice;

import java.util.Scanner;

/**
 * A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:
 * $.10 each for less than 20 checks
 * $.08 each for 20–39 checks
 * $.06 each for 40–59 checks
 * $.04 each for 60 or more checks
 * Write a program that asks for the number of checks written for the month.
 * The program should then calculate and display the bank’s service fees for the month.
 */
public class BankCharges {
    public static void main(String[] args) {
        double checks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers Checks written for the month: ");
        checks = scanner.nextDouble();
        double baseFee = 10;
        if (checks <= 20){
            System.out.println("Bank Base fee is : $" + baseFee);
            System.out.println("Bank service fee for the month is: $" + (checks * 10 + baseFee));
        }
        else if(checks <=39 && checks >= 20){
            System.out.println("Bank Base fee is : $" + baseFee);
            System.out.println("Bank service fee for the month is: $" + (checks * 8 + baseFee));
        }
        else if (checks <=59 && checks >= 40){
            System.out.println("Bank Base fee is : $" + baseFee);
            System.out.println("Bank service fee for the month is: $" + (checks * 6 + baseFee));
        }
        else if (checks >=60){
            System.out.println("Bank Base fee is : $" + baseFee);
            System.out.println("Bank service fee for the month is: $" + (checks * 4 + baseFee));
        }
        else {
            System.err.println("Invalid Input Contact the Bank!");
        }
    }
}
