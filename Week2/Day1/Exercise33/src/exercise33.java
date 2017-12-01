// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class exercise33 {
    public static void main(String[] args) {
        int g = 22;
        Scanner scanner = new Scanner(System.in);
        boolean usercorrect = false;
        System.out.println("Guess the number what I thinking for:");

        while (!usercorrect){
            int userguess = scanner.nextInt();
            if (userguess < g){
                System.out.println("The stored number is higher");

            }
            else if (userguess > g){
                System.out.println("The stored number is lower");
            }
            else  {
                System.out.println("You found the number: " + g);
                usercorrect = true;
            }
        }



    }
}
