package Practice;

import java.util.Scanner;

/**
 *A stationery store sells pencils at $1.20 each, erasers at $2 each, and compasses at $5 each.
 *  Write a program that asks the user for the number of each of these items purchased, calcu- lates
 *  the total expenditure made by the user, and then displays the result on the screen.
 */
public class StationaryExpenditure {
    public static void main(String[] args) {
        double pencils = 1.20;
        double erasers = 2;
        double compasses = 5;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Quantity of Pencils: ");
        pencils = scanner.nextDouble();
        System.out.println("Quantity of Erasers: ");
        erasers =scanner.nextDouble();
        System.out.println("Quantity of Compasses:");
        compasses = scanner.nextDouble();
        double TotalExpenditure = (pencils * 1.20) + (erasers * 2) + (compasses * 5);
        System.out.println("The Total Cost is: $" + TotalExpenditure);

    }
}
