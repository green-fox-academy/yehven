
import java.util.Random;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        int g;
        g = (int) (Math.random()*99+1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number 1-100, you have 5 lives!");

        for (int lives = 4; lives >= 0 ; lives--){
            int userguess = scanner.nextInt();
            if (userguess < g){
                System.out.println("The stored number is higher, you have " + lives + " lives left.");

            }
            else if (userguess > g){
                System.out.println("The stored number is lower, you have " + lives + " lives left.");

            }

            else {
                System.out.println("Congratulation! You've found the number: " + g);
                break;
            }


        }


    }
}
