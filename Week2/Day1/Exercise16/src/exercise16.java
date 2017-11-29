import java.util.Scanner;
public class exercise16 {
    public static void main(String[] args) {
        System.out.println("Please enter how many pigs do you have? ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPigs = scanner.nextInt();
        System.out.println("And how many chickens do you have? ");
        int numberOfChickens = scanner.nextInt();
        System.out.println("That means that you have " + 4*numberOfPigs + " pig legs, and  " + 2*numberOfChickens + " chicken legs!");


    }
}
