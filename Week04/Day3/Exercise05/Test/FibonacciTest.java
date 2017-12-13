import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci test = new Fibonacci();

    @Test
    public void fibonacci() throws Exception {
        assertEquals(5,test.fibonacci(5));
    }

}