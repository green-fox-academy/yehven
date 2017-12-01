// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integer number:");
        Integer userInput1 = scanner.nextInt();
        Integer userInput2 = scanner.nextInt();

        if (userInput1 > userInput2){
            System.out.println("The bigger number is: " + userInput1);
        }
        if (userInput1 == userInput2){
            System.out.println("The two number are the same");
        }
        if (userInput1 < userInput2){
            System.out.println("The bigger number is: " + userInput2);
        }
    }
}
