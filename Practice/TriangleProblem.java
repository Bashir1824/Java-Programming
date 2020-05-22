package Practice;

import java.util.Scanner;

/**
 * Only if the sum of three angles is 180 degrees can we say that the formation of a triangle is possible.
 * Write a program that asks the user to enter the values of three angles and calcu- lates the sum of the angles.
 * If the sum is 180 degrees, display a message indicating that tri- angle formation is possible,
 * else display a message indicating that triangle formation is not possible.
 */
public class TriangleProblem {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of angle 1:");
        number1 = scanner.nextInt();
        System.out.println("Enter the value of angle 2:");
        number2 = scanner.nextInt();
        System.out.println("Enter the value of angle 3:");
        number3 =scanner.nextInt();
        if(number1 + number2 + number3 == 180){
            System.out.println("Triangle Formation is Possible!");
        }
        else{
            System.err.println("Triangle Formation is not Possible!");
        }
    }
}
