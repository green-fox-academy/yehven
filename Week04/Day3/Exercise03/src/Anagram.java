import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public Anagram (){

    }

    public boolean isAnagram (String text1, String text2){
       if (text1.length() != text2.length()) return false;

       char[] char1 = text1.toCharArray();
       char[] char2 = text2.toCharArray();

       Arrays.sort(char1);
       Arrays.sort(char2);

       for (int i = 0; i < char1.length; i++){
           if (char1[i] != char2[i])return false;
       }
       return true;

    }
}
