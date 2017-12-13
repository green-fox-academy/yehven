import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    //ArrayList<Integer> test = new ArrayList<>(Arrays.asList(2,3,5));

    ArrayList<Integer> test = new ArrayList<>();

    @Test
    public void sum() throws Exception {
        test.add(2);
        test.add(3);
        test.add(5);
        int result = 10;
        Sum sum = new Sum();
        assertEquals(result,sum.sum(test));
    }

}