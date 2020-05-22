package Practice;

import java.util.Scanner;

/**
 * Write a program that asks the user to enter the number of calories and fat grams in a food item.
 * The program should display the percentage of the calories that come from fat.
 * One gram of fat has 9 calories; therefore:
 * Calories from fat = Fat grams * 9
 * The percentage of calories from fat can be calculated as follows:
 * Calories from fat % Total calories
 * If the calories from fat are less than 30 percent of the total calories of the food, it should
 * also display a message indicating the food is low in fat.
 */
public class FatGramCalculator {
    public static void main(String[] args) {
        double calories;
        double fat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of calories in your food: ");
        calories = scanner.nextDouble();
        System.out.println("Enter the number of fat grams in your food: ");
        fat = scanner.nextDouble();
        double totalCal = fat * 9;
        if (calories > totalCal){
            System.err.println("Invalid input please check again!");
        }else {
            System.out.println("The percent of calories that come from fat is: " + totalCal / calories);
        }
    }
}
