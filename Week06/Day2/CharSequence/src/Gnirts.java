public class Gnirts implements CharSequence {
    String text;

    public Gnirts(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public int length() {
        return length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(text.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return text.subSequence(text.length() - end, text.length() - start);
    }

    public static void main(String[] args) {
        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
    }
}
