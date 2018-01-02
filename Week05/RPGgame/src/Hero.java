import java.awt.*;

public class Hero extends Character {
    public Hero(String filename, int posX, int posY, boolean isAlive) {
        super(filename, posX, posY, isAlive);
    }

    @Override
    public void draw (Graphics graphics){
        this.posX = posX;
        this.posY = posY;
        super.draw(graphics);
    }

    public Hero (int posX, int posY){
        super("C:\\Users\\Adam\\Desktop\\hero-down.png", posX, posY, true);
        this.posX = posX;
        this.posY = posY;
    }

    public void moving (int posX, int posY){
        this.posX += posX;
        this.posY += posY;
    }
}


