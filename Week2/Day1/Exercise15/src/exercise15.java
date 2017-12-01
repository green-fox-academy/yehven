// Write a program that asks for an integer that is a distance in kilometers,
// then it converts that value to miles and prints it

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        double m = 0.621371192;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a distance in kilometers:");
        Integer userInput1 = scanner.nextInt();
        System.out.println("The entered value in miles: " + "\n" + userInput1*m);



    }
}
