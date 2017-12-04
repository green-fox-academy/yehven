// Check if list contains all of the following elements: 4,8,12,16
// Print "true" if it contains all, otherwise print "false"
// Can you do both the different approaches you tried in the previous one?

import java.util.*;

public class exercise11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        ArrayList<Integer> contains = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));
        if (list.containsAll(contains)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
