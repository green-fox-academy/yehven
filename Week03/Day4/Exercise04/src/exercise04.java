// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class exercise04 {
    public static void main(String[] args) {
        int b = 2;
        int n = 10;
        System.out.println(powerOfBase (b,n));
    }

    private static int powerOfBase(int b, int n) {
        if (n == 0){
            return 1;
        }
        else {
            return b * powerOfBase(b,n-1);
        }

    }
}
