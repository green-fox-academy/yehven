import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();

    }

    public void addTree(Tree newTree) {
        plants.add(newTree);
    }

    public void addFlower(Flower newFlower) {
        plants.add(newFlower);
    }

    public void watering(int amount) {
        System.out.println("Watering with " + amount);
        int counterThirsty = 0;
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).thirsty) {
                counterThirsty++;
            }
        }
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).thirsty) {
                plants.get(i).waterAmount += amount / counterThirsty * plants.get(i).absorption;
                plants.get(i).setThirsty();
            }
        }
    }

    public void status() {
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).thirsty) {
                System.out.println("The " + plants.get(i).color + " " + plants.get(i).name + " needs water.");
            } else {
                System.out.println("The " + plants.get(i).color + " " + plants.get(i).name + " doesn't need water.");
            }
        }
    }
}