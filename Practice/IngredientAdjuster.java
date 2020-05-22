package Practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * A cookie recipe calls for the following ingredients:
 * • 1.5 cups of sugar
 * • 1 cup of butter
 * • 2.75 cups of flour
 * The recipe produces 48 cookies with these amounts of the ingredients.
 * Write a program that asks the user how many cookies he or she wants to make,
 * and then displays the num- ber of cups of each ingredient needed for the specified number of cookies.
 */
public class IngredientAdjuster {
    public static void main(String[] args) {
     int cookies;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Cookies would you like to make? ");
        cookies = scanner.nextInt();
        double sugar = 0.031 * cookies;
        double butter = 0.020 * cookies;
        double flour = 0.057 * cookies;
        System.out.println("Ingredient needed for the specified number of cookies are: \n" + sugar +" Cups of Sugar \n"
        + butter + "  Cup of Butter \n" + flour + " Cup of Flour");
    }
}
