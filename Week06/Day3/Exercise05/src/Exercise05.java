import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

//Write a Stream Expression to find the frequency of numbers in the following array:

public class Exercise05 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
        Map<Integer,Integer> map =
                numbers.parallelStream()
                        .collect(Collectors.toConcurrentMap(a -> a, a -> 1, Integer::sum));
        System.out.println(map);
    }
}
