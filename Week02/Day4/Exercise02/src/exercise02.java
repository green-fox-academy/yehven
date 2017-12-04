import java.util.Arrays;
import java.util.Collections;


public class exercise02 {
    public static void main(String[] args) {
        Integer[] intArray = {3,2,1,4,2,1};
        boolean f = true;

        if (f == false) {
            Arrays.sort(intArray);
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + " ");
            }
        }
        else {
            Arrays.sort(intArray, Collections.reverseOrder());
            for (int i = 0; i < intArray.length; i++)
                System.out.print(intArray[i] + " ");
        }

    }
}
