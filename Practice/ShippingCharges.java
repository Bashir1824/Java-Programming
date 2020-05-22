package Practice;

import java.util.Scanner;

/**
 * The Fast Freight Shipping Company charges the following rates:
 * Weight of Package
 * 2 pounds or less
 * Over 2 pounds but not more than 6 pounds
 * Over 6 pounds but not more than 10 pounds
 * Over 10 pounds
 * Rate per 500 Miles Shipped
 * $1.10
 * $2.20
 * $3.70
 * $3.80
 * The shipping charges per 500 miles are not prorated.
 * For example, if a 2-pound package is shipped 550 miles,
 * the charges would be $2.20. Write a program that asks the user
 * to enter the weight of a package and then displays the shipping charges.
 */
public class ShippingCharges {
    public static void main(String[] args) {
        double weight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight of your Package: ");
        weight = scanner.nextDouble();
        if (weight <= 2){
            System.out.println("The Shipping charge is: £ 1.10");
        }
        else if (weight > 2 && weight <=6){
            System.out.println("The Shipping charge is: £ 2.20");
        }
        else if (weight >6 && weight <=10){
            System.out.println("The Shipping charge is: £ 3.70");
        }
        else if (weight >= 10){
            System.out.println("The Shipping charge is: £ 3.80");
        }
        else {
            System.err.println("Please contact the Fast Freight Shipping Company!");
        }
    }
}
