// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 integer nubmers: ");
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();
        Integer d = scanner.nextInt();
        Integer e = scanner.nextInt();
        System.out.println("Sum: " + (a+b+c+d+e) + " " + "Avarge: " + ((a+b+c+d+e)/5));

    }
}
