public class Main {

    public static void main(String[] args) {
        Garden garden = new Garden();
        Flower yellow = new Flower("yellow");
        Flower blue = new Flower("blue");
        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");

        garden.addFlower(yellow);
        garden.addFlower(blue);
        garden.addTree(purple);
        garden.addTree(orange);

        garden.status();
        System.out.println();
        garden.watering(40);
        garden.status();
        System.out.println();
        garden.watering(70);
        garden.status();

    }
}
