//Write a Stream Expression to find the frequency of characters in a given string!

import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Exercise06 {

    public static void main(String[] args) {
        String findFrequency = "ergfdgkjéfdierokmsf";
        Map<Object, Long> map = findFrequency
                .chars()
                .mapToObj(c -> (char)c).collect(groupingBy(c -> c,counting()));
        System.out.println(map);
    }
}
