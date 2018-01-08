//Write a Stream Expression to find the uppercase characters in a string!

public class Exercise08 {
    public static void main(String[] args) {
        String findUpperCase = "ZdfaSfhAghKkdgOfdSeFRjfjxOdgDerjkO"
                .chars()
                .filter(c -> Character.isUpperCase(c))
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        System.out.println(findUpperCase);

    }
}
