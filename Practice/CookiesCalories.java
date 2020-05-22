package Practice;


import java.util.Scanner;

/**
 * A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 servings in the bag
 * and that a serving equals 300 calories. Write a program that lets the user enter the number of cookies he or she
 * actually ate and then reports the number of total calories consumed.
 */
public class CookiesCalories {
    public static void main(String[] args) {
        int bag = 40;
        int servings = 10;
        int serving = 300;
        int calorie = (servings * serving) / bag;
        int cookie;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Cookies Have you ate: ? ");
        cookie = scanner.nextInt();
        System.out.println("The Total Calories Consumed is: " + calorie * cookie);

    }
}
