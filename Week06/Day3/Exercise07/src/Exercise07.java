//Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise07 {

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
                "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

        List<String> filteredNames = numbers.stream()
                .filter(name -> name.startsWith("A") && name.endsWith("I"))
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
