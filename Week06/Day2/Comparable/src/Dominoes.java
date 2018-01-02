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

    private static List<Domino> orderOfDominoes(List<Domino> dominoeOrder) {
        for (int i = 0; i < dominoeOrder.size(); i++) {
            for (int j = i; j < dominoeOrder.size(); j++) {
                if (dominoeOrder.get(i).getValues()[1] == dominoeOrder.get(j).getValues()[0]) {
                    dominoeOrder.add(i+1, dominoeOrder.get(j));
                    dominoeOrder.remove(j+1);
                }
            }
        }
        return dominoeOrder;
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