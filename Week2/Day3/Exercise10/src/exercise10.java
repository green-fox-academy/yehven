// Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
// Do this again with a different solution using different list functions!

import java.util.*;

public class exercise10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7));

        if (arrayList.contains(7)){
            System.out.println("Hoorray");
        }
        else {
            System.out.println("Noooooo");
        }

    }
}
