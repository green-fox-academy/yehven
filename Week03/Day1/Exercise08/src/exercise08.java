// Create a method that decrypts reversed-lines.txt

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercise08 {
    public static void main(String[] args) {
        Path path = Paths.get("src/reversed-lines.txt");
        Decrypt (path);
    }

    private static void Decrypt(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size() ; i++) {
                for (int k = lines.get(i).length() - 1; k > -1; k--) {
                    System.out.print((String.valueOf(lines.get(i).charAt(k))));
                }
                System.out.println("");
            }

        } catch (Exception e){
            System.out.println("Decryption failed");
        }
    }
}
