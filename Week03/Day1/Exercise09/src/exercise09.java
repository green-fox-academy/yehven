// Create a method that decrypts reversed-order.txt

import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class exercise09 {
    public static void main(String[] args) {
        String path = "src/reversed-order.txt";
        Decrypt(path);
    }

    public static void Decrypt(String path){
        try{
            Path path1= Paths.get(path);
            Path path2 = Paths.get("src/reversed-order.txt");
            List<String> lines = Files.readAllLines(path1);
            List<String> decryptedLines = new ArrayList<String>();

            for(int i = lines.size() - 1; i >= 0; i--){
                decryptedLines.add(lines.get(i));
            }
            Files.write(path2,decryptedLines);
            System.out.print("Reversing completed");
        } catch (Exception e) {
            System.out.println("Reversing failed");
        }
    }
}