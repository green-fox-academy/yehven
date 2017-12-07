// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class exercise08 {
    public static void main(String[] args) {
        String word = "xyolo xyolo xyolo";
        System.out.println(removeX (word));

    }

    private static String removeX(String word) {
        if (word.length() == 0){
            return "";
        }
        else if (word.charAt(0) == 'x'){
            return "" + removeX(word.substring(1, word.length()));
        }
        else {
            return word.charAt(0) + removeX(word.substring(1, word.length()));
        }
    }
}
