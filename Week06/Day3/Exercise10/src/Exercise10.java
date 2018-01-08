import java.util.ArrayList;

public class Exercise10 {

    public static void main(String[] args) {
        ArrayList<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Józsi", "pallida", "green"));
        foxes.add(new Fox("Pista", "csibész", "blue"));
        foxes.add(new Fox("Béla", "csirkefogó", "pink"));
        foxes.add(new Fox("Ubul", "kerge", "green"));
        foxes.add(new Fox("Frodó", "zsákos", "green"));

        foxes.stream()
                .filter(fox -> fox.getColor().equals("green"))
                .forEach(a -> System.out.println("Green colored fox: " + a.getName()));

        foxes.stream()
                .filter(fox -> fox.getType().equals("pallida") && fox.getColor().equals("green"))
                .forEach(a -> System.out.println("Green colored, pallida type fox: " + a.getName()));
    }
}
