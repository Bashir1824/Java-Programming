package Practice;

import java.util.Scanner;

/**
 * The date June 10, 1960, is special because when we write it in the following format,
 * the month times the day equals the year: 6/10/60
 * Write a program that asks the user to enter a month (in numeric form), a day, and a two- digit year.
 * The program should then determine whether the month times the day is equal to the year. If so,
 * it should display a message saying the date is magic. Otherwise,
 * it should display a message saying the date is not magic.
 */
public class MagicDates {
    public static void main(String[] args) {
        int month;
        int day;
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month were you porn in? ");
        month = scanner.nextInt();
        System.out.println("Which day were you porn in? ");
        day = scanner.nextInt();
        System.out.println("Which year were porn in? ");
        year = scanner.nextInt();
        if(month * day == year){
            System.out.println("Your Dates are magic!");
        }
            else {
            System.out.println("Your Dates are not magic dates!");
        }

    }
}
