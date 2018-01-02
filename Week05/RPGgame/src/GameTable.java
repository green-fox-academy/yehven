import java.awt.*;

public class GameTable {
    int[][] table;
    int width;

    public GameTable(int[][]table, int width) {
        this.width = width;
        this.table = table;
    }

    public void makeTable(Graphics graphics) {
        for (int i = 0; i < this.table.length; i++) {
            for (int j = 0; j < this.table.length; j++) {
                if (this.table[i][j] == 1) {
                    PositionedImage wall = new PositionedImage("C:\\Users\\Adam\\Desktop\\wall.png", j*72, i*72);
                    wall.draw(graphics);
                } else if (this.table[i][j] == 0) {
                    PositionedImage background = new PositionedImage("C:\\Users\\Adam\\Desktop\\floor.png", j*72, i*72);
                    background.draw(graphics);


                }
            }
        }
    }
}