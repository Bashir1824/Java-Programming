package Practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Write a program that asks the user to enter a number of seconds.
 * • There are 60 seconds in a minute. If the number of seconds entered by the user is
 * greater than or equal to 60, the program should display the number of minutes in that many seconds.
 * • There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater than or equal to 3,600,
 * the program should display the number of hours in that many seconds.
 * • There are 86,400 seconds in a day. If the number of seconds entered by the user is greater than or equal to 86,400,
 * the program should display the number of days in that many seconds.
 */
public class TimeCalculator {
    public static void main(String[] args) {
        double minutes = 60;
        double hour = 3600;
        double day = 86400;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Seconds: ");
        minutes =scanner.nextDouble();
        System.out.println("Enter the number of Hours: ");
        hour = scanner.nextDouble();
        System.out.println("Enter the number of Days: ");
        day = scanner.nextDouble();
        if (minutes >= 60){
            System.out.println("The Minutes: " + minutes / 60 );
        } if (hour >= 3600){
            System.out.println("The Hours: " + hour / 3600);

        }if (day >= 86400){
            System.out.println("The Days: " + day / 86400);
        }
        else {
            System.err.println("Your Input is invalid!");
        }
    }
}
