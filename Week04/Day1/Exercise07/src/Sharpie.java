public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width, float inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }
    public Sharpie() {
        this.inkAmount = 100;
    }

    public void use() {
        this.inkAmount -= 10;
    }

    @Override
    public String toString() {
        return "[" + color + ", " + width + ", " + inkAmount + "]";
    }

    public static void main(String[] args) {
        Sharpie pen = new Sharpie();
        System.out.println(pen);
        pen.color = "green";
        pen.width = (float) 1.1;
        System.out.println(pen);
        pen.use();
        System.out.println(pen);

    }
}
