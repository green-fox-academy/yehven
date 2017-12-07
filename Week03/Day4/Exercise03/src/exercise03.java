// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class exercise03 {
    public static void main(String[] args) {
        int n = 233;
        System.out.println(sumOfDigits(n));
    }

    private static int sumOfDigits(int n) {
        if (n == 0){
            return 0;
        }
        else {
            return sumOfDigits(n/10) + n % 10;
        }
    }
}
