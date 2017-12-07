// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class exercise07 {
    public static void main(String[] args) {
        String word = "xolo xolo xolo";
        System.out.println(changeXtoY (word));
    }

    private static String changeXtoY(String word) {
        if (word.length() == 0) {
            return "";
        }
        if (word.charAt(0) == 'x') {
            return "y" + changeXtoY(word.substring(1, word.length()));
        } else {
            return word.charAt(0) + changeXtoY(word.substring(1, word.length()));
        }
    }

}
