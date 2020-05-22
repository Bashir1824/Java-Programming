package Practice;

import java.util.Scanner;

/**
 * Write a program that calculates and displays a person’s body mass index (BMI).
 * The BMI is often used to determine whether a person with a sedentary lifestyle
 * is overweight or under- weight for his or her height.
 * A person’s BMI is calculated with the following formula:
 * BMI = Weight X 703 / Height2
 *where weight is measured in pounds and height is measured in inches. The program should
 * display a message indicating whether the person has optimal weight, is underweight, or is
 * verweight. A sedentary person’s weight is considered optimal if his or her BMI is between
 * 18.5 and 25. If the BMI is less than 18.5, the person is considered underweight. If the BMI
 * value is greater than 25, the person is considered overweight.
 */
public class BodyMassIndex {
    public static void main(String[] args) {
        double weight;
        double hieght;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Weight: ");
        weight = scanner.nextDouble();
        System.out.println("Enter your Hieght: ");
        hieght = scanner.nextDouble();
       double BMI = (weight * 703) / Math.sqrt(hieght);
       if(BMI<=25 && BMI >= 18.5){
           System.out.println("You have  a sedentary person weight");
       }
       else {
           System.out.println("You are underweight");
       }
    }
}
