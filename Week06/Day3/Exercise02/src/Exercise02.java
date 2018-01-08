import java.util.ArrayList;
import java.util.Arrays;

//Write a Stream Expression to get the average value of the odd numbers from the following array:

public class Exercise02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        System.out.println(numbers.stream()
                .filter(x -> Math.abs(x) % 2 == 1)
                .mapToDouble(a -> a)
                .average());
    }
}
