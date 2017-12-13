import java.util.List;

public class Plant {
    String name;
    String color;
    double waterAmount;
    double thirstyLevel;
    double absorption;
    boolean thirsty;

    public Plant() {
        this.waterAmount = 0;
        this.thirsty = true;
    }

    public void setThirsty() {
        thirsty = this.waterAmount < this.thirstyLevel;
    }
}