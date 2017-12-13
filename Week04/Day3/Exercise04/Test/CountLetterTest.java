import org.junit.Test;

import static org.junit.Assert.*;

public class CountLetterTest {

    CountLetter test = new CountLetter("thinggoesskraaaaa");

    @Test
    public void mapMaker() throws Exception {
        assertEquals(5,test.mapMaker("thinggoesskraaaaa").get('a'));
    }

}