import java.awt.*;

public class Character extends PositionedImage{
    int maxHealthPoint;
    int currentHealthPoint;
    int defendPoint;
    int strikePoint;
    int level;
    boolean isAlive;

    public Character(String filename, int posX, int posY, boolean isAlive) {
        super(filename, posX, posY);
    }

    public Character (){
    }
}
