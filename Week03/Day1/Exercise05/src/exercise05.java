// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the path where the file is located: ");
        String Path = input.nextLine();
        System.out.println("Please enter the word you'd like to write to the file: " );
        String Word = input.nextLine();
        System.out.println("Please enter the number of lines there supposed to be in the file: ");
        int numberLines = input.nextInt();
        multipleLinesInFile(Path, Word, numberLines);

    }

    private static String multipleLinesInFile(String inputPath, String inputWord, Integer inputLines) {
        try {
            List<String> content = new ArrayList<>();
            for (int i = 0; i < inputLines; i++) {
                content.add(inputWord);
            }
            Files.write(Paths.get(inputPath), content);
        } catch (Exception e) {
            System.out.println("Does not worked");
        }
        return inputPath;
    }
}