import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

//Write a Stream Expression to get the squared value of the positive numbers from the following array:

public class Exercise03 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        Function<Integer, Integer> square = x -> x * x;
        numbers.stream()
                .filter(a -> a > 0)
                .map(square)
                .forEach(System.out::println);
    }
}
