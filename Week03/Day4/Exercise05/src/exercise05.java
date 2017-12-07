// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class exercise05 {
    public static void main(String[] args) {
        int bunny = 117;
        System.out.println(numberOfEars (bunny));
    }

    private static int numberOfEars(int bunny) {
        if (bunny == 0){
            return 0;
        }
        else {
            return numberOfEars(bunny-1) + 2;
        }
    }
}
