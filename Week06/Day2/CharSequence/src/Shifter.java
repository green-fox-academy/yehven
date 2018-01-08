public class Shifter implements CharSequence {
    String text;
    int number;

    public Shifter(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int length() {
        return length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(index + number);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return text.subSequence(start, end);
    }

    public static void main(String[] args) {
        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));
    }
}
