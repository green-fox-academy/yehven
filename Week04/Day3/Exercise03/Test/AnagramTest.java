import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram test = new Anagram();
    @Test
    public void isAnagram() throws Exception {
        assertTrue(test.isAnagram("egyem", "megye"));
    }

}