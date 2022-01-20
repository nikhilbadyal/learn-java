package com.nikhil;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * @author Nikhil
 * @date 21 Feb2020
 */

class PaintPanel extends JPanel {

    private Random random;

    public PaintPanel() {

        setBorder(
                BorderFactory.createLineBorder(Color.RED,10));

        random = new Random();
    }

    @Override
    protected void paintComponent(Graphics g){
        Insets insets ;
        super.paintComponent(g);

        int x;
        int y;
        int x2;
        int y2;

        int height = getHeight();
        int width = getWidth();
        insets = getInsets();

        for(int i = 0 ;  i< 10 ;++i){
            x = random.nextInt(width-insets.left);
            y = random.nextInt(height-insets.bottom);
            x2 = random.nextInt(width-insets.left);
            y2 = random.nextInt(height-insets.bottom);

            g.drawLine(x,y,x2,y2);
        }
    }
}

public  class PaintDemo{
    public PaintDemo() {
        JLabel jLabel;
        PaintPanel paintPanel;

        JFrame jFrame = new JFrame("Swing.");

        jFrame.setSize(200,150);

        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        paintPanel = new PaintPanel();

        jFrame.add(paintPanel);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaintDemo();
            }
        });

    }

}



   
