package com.nikhil;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * @author Nikhil
 * @date 21 Feb2020
 */

public class SwingEventHandler<pvsm> {
	private JLabel jlabel;


	SwingEventHandler(){

		JFrame jframe = new JFrame("This is my Event demo.");

		jframe.setLayout(new FlowLayout());


		jframe.setSize(220,90);

		jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);



		JButton button1 = new JButton("Alpha");
		JButton button2 = new JButton("Beta");



		button1.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				jlabel.setText("Alpha was pressed"); 
			}
		});


		button2.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e){
				jlabel.setText("Beta was pressed");
			}
		});



		jframe.add(button1);
		jframe.add(button2);

        jlabel = new JLabel("Enter a button.");
        jframe.add(jlabel);

		jframe.setVisible(true);
		
	}

   public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new SwingEventHandler();
            }
        });
    }
}
   
