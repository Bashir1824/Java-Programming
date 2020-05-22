package Practice;

import java.util.Scanner;

/**
 * Write a program that computes the tax and tip on a restaurant bill.
 * The program should ask the user to enter the charge for the meal.
 * The tax should be 6.75 percent of the meal charge.
 * The tip should be 20 percent of the total after adding the tax.
 * Display the meal charge, tax amount, tip amount, and total bill on the screen.
 */
public class ResturantBill {
    public static void main(String[] args) {
        double meal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much did you pay for your meal? ");
        meal = scanner.nextDouble();
        double tax = (meal * 6.75) / 100 ;
        double tip = (meal+ tax) * 20 / 100;
        System.out.println("The meal charge is: £" + meal);
        System.out.println("The Tax amount Deducted is: " + (tax));
        System.out.println("The Tip amount Paid is: " + (tip));
        System.out.println("The total Bill is: £" + (meal+tax+tip));

    }
}
