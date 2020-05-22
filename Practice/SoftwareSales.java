package Practice;

import java.util.Scanner;

/**
 * A software company sells a package that retails for $99.
 * Quantity discounts are given according to the following table:
 * Quantity
 * Discount
 *   10–19 20%
 *   20–49 30%
 *   50–99 40%
 *   100 or more 50%
 *   Write a program that asks the user to enter the number of packages purchased.
 *   The pro- gram should then display the amount of the discount (if any) and the
 *   total amount of the purchase after the discount.
 */
public class SoftwareSales {
    public static void main(String[] args) {
        double Package;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Packages Purchased: ");
        Package = scanner.nextDouble();
        double price = Package * 99;
        double discount1 = (price * 20) /100;
        double discount2 = (price * 30) /100;
        double discount3 = (price * 40) /100;
        double discount4 = (price * 50) /100;
        if(Package <=19 && Package >= 10){
            System.out.println("The amount of discount is: £" + discount1);
            System.out.println("The total amount of the purchase after the discount is:  £" + (price - discount1));
        }
        else if(Package <=49 && Package >= 20){
            System.out.println("The amount of discount is: £" + discount2);
            System.out.println("The total amount of the purchase after the discount is:  £" + (price - discount2));
        }
        else if (Package <=99 && Package >=50){
            System.out.println("The amount of discount is: £" + discount3);
            System.out.println("The total amount of the purchase after the discount is:  £" + (price - discount3));
        }
        else if (Package >=100){
            System.out.println("The amount of discount is: £" + discount4);
            System.out.println("The total amount of the purchase after the discount is:  £" + (price - discount4));
        }
        else{
            System.err.println("your Purchase Doe not Qualify Discount!");
            System.out.println("The amount Due is: £" + price);
        }
    }
}
