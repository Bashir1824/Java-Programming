package Practice;

import java.util.Scanner;

/**
 * Write a program that asks the user to enter the values of the rate of egg production of Euro- pean
 * and African honey bees and calculates the average egg production per honey bee in a week.
 */
public class ProductionAverage {
    public static void main(String[] args) {
     double European;
     double African;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Euro-pean Production rate number: ");
        European = scanner.nextDouble();
        System.out.println("Enter the African Production rate number: ");
        African = scanner.nextDouble();
        System.out.println("The Average egg production per honey bee in a week is: " + (European + African) / 2 );
    }
}
