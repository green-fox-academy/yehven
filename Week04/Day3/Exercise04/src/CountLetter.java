import java.util.HashMap;
import java.util.Map;

public class CountLetter {
    String text;

    public CountLetter(String text){
        this.text = text;

    }
    public Map mapMaker(String text) {
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        for (int i = 0; i < this.text.length(); i++) {
            hashmap.put(this.text.charAt(i), this.text.length() - this.text.replaceAll(String.valueOf(text.charAt(i)), "").length());
        }
        return hashmap;
    }

}
