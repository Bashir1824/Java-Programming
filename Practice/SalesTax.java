package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Write a program that will ask the user to enter the amount of a purchase.
 * The program should then compute the state and county sales tax.
 * Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
 * The program should display the amount of the pur- chase, the state sales tax, the county sales tax,
 * the total sales tax, and the total of the sale (which is the sum of the amount of purchase plus the total sales tax).
 * Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent.
 */
public class SalesTax {
    public static void main(String[] args) {
        double state = 0.04;
        double county = 0.02;
        int amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        amount = scanner.nextInt();
        double totalSales = (amount * state ) + (amount * county);
        double totalSalesTax = (amount * state) +(amount * county) + amount;
        System.out.println("The State Sales Tax: " + amount * state);
        System.out.println("The County Sales Tax: " + amount * county);
        System.out.println("The Total Sales Tax: " + totalSales);
        System.out.println("The Total Sales with Tax: " + totalSalesTax);




    }
}
