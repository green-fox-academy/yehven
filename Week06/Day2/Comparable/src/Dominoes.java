import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();

        orderOfDominoes(dominoes);
        System.out.println("Wanted order");
        System.out.println(orderOfDominoes(dominoes));

        System.out.println("Sorted order");
        Collections.sort(dominoes);
        System.out.println(dominoes);

    }

    private static List<Domino> orderOfDominoes(List<Domino> dominoOrder) {
        for (int i = 0; i < dominoOrder.size(); i++) {
            for (int j = i; j < dominoOrder.size(); j++) {
                if (dominoOrder.get(i).getValues()[1] == dominoOrder.get(j).getValues()[0]) {
                    dominoOrder.add(i+1, dominoOrder.get(j));
                    dominoOrder.remove(j+1);
                }
            }
        }
        return dominoOrder;
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}