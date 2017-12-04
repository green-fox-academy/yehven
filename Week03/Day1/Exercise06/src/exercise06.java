// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of the source file");
        String inputPath1 = scanner.nextLine();
        System.out.println("Please input the name of the destination file");
        String inputPath2 = scanner.nextLine();
        Path path1 = Paths.get(inputPath1);
        Path path2 = Paths.get(inputPath2);
        try {
            List<String> lines = Files.readAllLines(path1);
            Files.write(path2, lines);
            System.out.println("Copy succesful: " + true);
        } catch (Exception e) {
            System.out.println("Copy succesful: " + false);
        }
    }
}