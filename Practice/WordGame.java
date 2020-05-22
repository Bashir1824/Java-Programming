package Practice;

import java.util.Scanner;

/**
 * Write a program that plays a word game with the user. The program should ask the user to enter the following:
 * • His or her name
 * • His or her age
 * • The name of a city
 * • The name of a college
 * • A profession
 * • A type of animal
 * • A pet’s name
 * After the user has entered these items, the program should display
 * the following story, inserting the user’s input into the appropriate locations:
 *There once was a person named NAME who lived in CITY. At the age of AGE,
 * NAME went to college at COLLEGE. NAME graduated and went to work as a
 * PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
 * happily ever after!
 */
public class WordGame {
    public static void main(String[] args) {
        String name;
        int age;
        String city;
        String college;
        String profession;
        String animal;
        String petname;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        name = scanner.next();
        System.out.println("How old are you?");
        age = scanner.nextInt();
        System.out.println("Which city do you live in?");
        city =scanner.next();
        System.out.println("What is the name of the college you went to?");
        college = scanner.next();
        System.out.println("What is your profession?");
        profession = scanner.next();
        System.out.println("Which animal you like?");
        animal = scanner.next();
        System.out.println("What did you named your animal?");
        petname = scanner.next();
        System.out.println("There once was a person named " + name + " who lived in " + city + ".\n" + "At the age of " +
                age + "," + name + " went to college at " + college + ".\n" + name + " graduated and went to work as a " +
                profession + ".\n" + "Then, " + name + " adopted a (n) " + animal + " named " + petname + ".\n"
        + "They both lived happily ever after!");



    }
}
