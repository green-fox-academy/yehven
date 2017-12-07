// Write a recursive function that takes one parameter: n and counts down from n.

public class exercise01 {
    public static void main(String[] args) {
       countFromN(20);
    }

    private static int countFromN(int n) {
        System.out.println(n);
        if (n == 0) {
            return 0;
        } else {
            return countFromN(n - 1);
        }
    }
}
