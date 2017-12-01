
import java.lang.*;
import java.util.Scanner;
class exercise02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word, number or any characters:");
        String userInput = scanner.nextLine();
        String input = userInput;
        char[] temparray = input.toCharArray();
        int left, right=0;
        right = temparray.length-1;

        for (left=0; left < right ; left++ ,right--)
        {
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right]=temp;
        }
        System.out.print(userInput);
        for (char c : temparray)
            System.out.print(c);

    }
}
