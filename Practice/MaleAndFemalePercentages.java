package Practice;

import java.util.Scanner;

/**
 * Write a program that asks the user for the number of males and the number of females regis- tered in a class.
 * The program should display the percentage of males and females in the class.
 * Hint: Suppose there are 8 males and 12 females in a class. There are 20 students in the class.
 * The percentage of males can be calculated as 8 4 20 5 0.4, or 40%.
 * The percentage of females can be calculated as 12 4 20 5 0.6, or 60%.
 */
public class MaleAndFemalePercentages {
    public static void main(String[] args) {
        int male;
        int female;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Males in your class? ");
        male = scanner.nextInt();
        System.out.println("How many Females in your class? ");
        female = scanner.nextInt();
        double total = male + female;
        double percentage = (total * male) /100;
        double percentages = (total * female) /100;
        System.out.println("The percentage of Male Students is: " + percentage);
        System.out.println("The percentage of Female Students is: " + percentages);
        System.out.println("The total of Students class is: " + total);
    }
}
