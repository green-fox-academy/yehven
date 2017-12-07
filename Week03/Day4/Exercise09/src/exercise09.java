// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class exercise09 {
    public static void main(String[] args) {
        String word = "I dont wanna be separated by * characters";
        System.out.println(separateStar (word));

    }

    private static String separateStar(String word) {
        if (word.length() == 0){
            return "";
        }
        else if (word.charAt(0) != ' '){
            return word.charAt(0)+"*" + separateStar(word.substring(1, word.length()));
        }
        else {
            return word.charAt(0) + separateStar(word.substring(1, word.length()));
        }
    }

}
