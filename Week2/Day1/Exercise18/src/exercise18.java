// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write an integer number: ");
        Integer userInput1 = scanner.nextInt();
        if (userInput1 == 0 || userInput1 %2==0){
            System.out.println("The written number is even number.");
        }
        else {
            System.out.println("The writtne number is odd number.");
        }

    }
}
