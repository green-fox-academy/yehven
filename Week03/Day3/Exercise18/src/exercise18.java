// create a 300x300 canvas.
// create a function that takes 1 parameter:
// an array of {x, y} points
// and connects them with green lines.
// connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
// connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
// {120, 100}, {85, 130}, {50, 100}}

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise18 {

    public static void mainDraw(Graphics graphics){
        int[][] input1 = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] input2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        connectDots(graphics,input1);
        connectDots(graphics, input2);
    }

    private static void connectDots(Graphics graphics, int [][] input) {
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < input.length - 1; i++) {
            graphics.drawLine(input[i][0], input[i][1], input[i + 1][0], input[i + 1][1]);
        }
        graphics.drawLine(input[0][0], input[0][1], input[input.length-1][0], input[input.length-1][1]);
    }

    //    Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}



