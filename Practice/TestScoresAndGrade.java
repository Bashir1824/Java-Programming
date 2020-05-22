package Practice;

import sun.security.krb5.internal.crypto.Des;

import java.util.Scanner;

/**
 * Write a program that has variables to hold three test scores.
 * The program should ask the user to enter three test scores and then assign the values
 * entered to the variables.The pro- gram should display the average of the test scores and
 * the letter grade that is assigned for the test score average.Use the grading scheme in the following table:
 * Letter Grade are as follows:
 * A--- 90-100
 * B---80-89
 * C---70-79
 * D---60-69
 * F---BELOW 60
 */
public class TestScoresAndGrade {
    public static void main(String[] args) {
        double Language;
        double Programing;
        double Designing;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wha is you test score in Language?");
        Language = scanner.nextDouble();
        System.out.println("Wha is you test score in Programing?");
        Programing = scanner.nextDouble();
        System.out.println("Wha is you test score in designing?");
        Designing = scanner.nextDouble();
        double scores = (Language + Programing + Designing) / 3;
        if (Language <=100 && Language>=90){
            System.out.println("Received Grade: A ");
        }
        if(Programing <=100 && Programing>=90){
            System.out.println("Received Grade: A ");
        }
        if(Designing <=100 && Designing >=90){
            System.out.println("Received Grade: A ");
        }
        if (Language <= 89 && Language >= 80 ){
            System.out.println("Received Grade: B ");
        }
        if(Programing <=89 && Programing >= 80){
            System.out.println("Received Grade: B ");
        }
        if(Designing <= 89 && Designing >= 80){
            System.out.println("Received Grade: B ");
        }
        if(Language <=79 && Language>=70 ){
            System.out.println("Received Grade: C ");
        }
        if(Programing<=79 && Programing>=70){
            System.out.println("Received Grade: C ");
        }
        if(Designing <=79 && Designing>=70){
            System.out.println("Received Grade: C ");
        }
        if(Language <=69 && Language>=60 ){
            System.out.println("Received Grade: D ");
        }
        if(Programing<=69 && Programing>=60){
            System.out.println("Received Grade: D ");
        }
        if(Designing <=69 && Designing>=60){
            System.out.println("Received Grade: D ");
        }
        else{
            System.out.println("Received Grade: F ");
        }
        System.out.println("The average of your Test scores is: " + scores);
    }
}
