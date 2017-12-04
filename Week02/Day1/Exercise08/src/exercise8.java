public class exercise8 {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        a = a ^ b ^ (b = a);
        System.out.println(a);
        System.out.println(b);
    }

}
