//Write a Stream Expression to convert a char array to a string!

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise09 {

    public static void main(String[] args) {
        char [] characters = {'Z', 's', 'a', 'k', 'o', 's', 'F', 'r', 'o', 'd', 'o', '!'};
        Stream<String> charStream =  new String(characters)
                .chars()
                .mapToObj(c -> String.valueOf((char) c));
        String stringOfCharacters = charStream.collect(Collectors.joining());
        System.out.println(stringOfCharacters);
    }
}
