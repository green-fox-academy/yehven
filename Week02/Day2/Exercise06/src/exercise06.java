//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many words you want to print? ");
        int numberOfWords = scanner.nextInt();
        String[] words = new String[numberOfWords];
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Please enter the word: ");
            String userInput = scanner.next();
            words[i] = userInput;
        }
        System.out.println("The sum is: " + printer(words));
    }
    public static String printer(String[] input){
        String total = "";
        for (int i = 0; i < input.length; i++) {
            total = total + "\" " + input[i] + " \" ";
        }
        return total;
    }
}

