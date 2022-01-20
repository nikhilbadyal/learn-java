package com.nikhil;

import java.awt.*;
import java.awt.event.*;

/**
 * @author Nikhil
 * @date 22 Feb2020
 */

public class ScrollBarDemo extends Frame implements AdjustmentListener {

    String message = "";
    Scrollbar hori , verti;

    public ScrollBarDemo(){
        setLayout(new FlowLayout());

        hori = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
        verti = new Scrollbar(Scrollbar.VERTICAL,0,1,0,255);

        verti.setPreferredSize(new Dimension(20,700));
        hori.setPreferredSize(new Dimension(100,20));


        add(hori);
        add(verti);


        verti.addAdjustmentListener(this);
        hori.addAdjustmentListener(this);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                verti.setValue(y);
                hori.setValue(x);
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        message = "Vertical :  "+ verti.getValue();
        message += "Horizontal :  "+ hori.getValue();

        g.drawString(message , 20,160);

        g.drawString("*",verti.getValue(),hori.getValue());
    }

    public static void main(String[] args) {
        ScrollBarDemo scrollBarDemo = new ScrollBarDemo();

        scrollBarDemo.setSize(new Dimension(7000,7000));
        scrollBarDemo.setTitle("Scroll Bar");
        scrollBarDemo.setVisible(true);
    }
}
   
