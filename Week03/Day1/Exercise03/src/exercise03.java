// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a filename: ");
        String file = input.nextLine();
        numberOfLines(file);

    }

    private static Integer numberOfLines(String input) {
        int numberLines = 0;
        try {
            Path filePath = Paths.get(input);
            List<String> lines = Files.readAllLines(filePath);
            numberLines = lines.size();
            System.out.println(numberLines);
        } catch (Exception e) {
            System.out.println("File not found.");
        }
        return numberLines;
    }
}
