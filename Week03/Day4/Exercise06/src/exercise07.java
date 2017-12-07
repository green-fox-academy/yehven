// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class exercise07 {
    public static void main(String[] args) {
        int bunny = 11;
        System.out.println(numberOfEars (bunny));
    }

    private static int numberOfEars(int bunny) {
        if (bunny ==0){
            return 0;
        }
        else if (bunny %2==1){
            return numberOfEars(bunny-1)+2;
        }
        else {
            return numberOfEars(bunny-1)+3;
        }
    }
}
