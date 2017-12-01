// - Create an array variable named `ag`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

import java.util.Arrays;

public class exercise14 {
    public static void main(String[] args) {

        int[] ag = {3, 4, 5, 6, 7};
        int length = ag.length;
        for (int i = 0; i <length; i++) {
            ag[i] *= 2;
        }
        System.out.println("The new array values are: " + Arrays.toString(ag));
    }
}
