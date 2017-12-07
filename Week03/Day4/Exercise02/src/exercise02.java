// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class exercise02 {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(countFromN (n));
    }

    private static int countFromN(int n) {
        if (n == 1){
            return 1;
        }
        else {
            return n+countFromN(n-1);
        }
    }
}