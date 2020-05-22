package Practice;

import java.util.Scanner;

public class ConditionalOp {
    public static void main(String[] args) {
//        Take values of length and breadth (Width) of a rectangle from user and check if it is square or not.
        Scanner scanner = new Scanner(System.in);
        int length;
        int width ;


        System.out.println("enter Length Number: ");
        length = scanner.nextInt();
        System.out.println("Enter Width: ");
        width = scanner.nextInt();
        int square = width * length;
        if(length == width){
            System.out.println("It's Square: " + square);
        }else{
            System.out.println("It's not a Square!");
        }


    }
}

