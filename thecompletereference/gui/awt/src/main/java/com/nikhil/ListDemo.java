package com.nikhil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Nikhil
 * @date 22 Feb2020
 */

public class ListDemo extends Frame implements ActionListener {
    private List os;
    private List browser;
    private String message = "";


    public ListDemo(){

        this.setLayout(new FlowLayout());

        os = new List(4,false);
        browser = new List(4);

        os.add("Windows");
        os.add("Mac");
        os.add("Ubuntu");
        os.add("Solaris");

        browser.add("Edge");
        browser.add("Firefox");
        browser.add("Chrome");
        browser.add("Opera");

        browser.select(0);
        os.select(0);

        this.add(os);
        this.add(browser);

        os.addActionListener(this);
        browser.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        int idx[];
        message = "Current os : ";
        message += os.getSelectedItem();
       /*
        idx = os.getSelectedIndexes();
        for(int i = 0 ; i < idx.length ; ++i){
            message += os.getItem(idx[i]) + " ";
        }*/
        g.drawString(message,10,200);
        message = "Current browser : ";
        message += browser.getSelectedItem();
        g.drawString(message,10,230);
    }

    public static void main(String[] args) {
        ListDemo listDemo = new ListDemo();
        listDemo.setSize(300,300);
        listDemo.setVisible(true);
        listDemo.setTitle("List Demo");
    }
}
   
