package com.nikhil;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
class BasicJframe{
	public BasicJframe(){
		JFrame jframe = new JFrame("This is my first swing application.");
		jframe.setSize(600,600);
		jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel jlabel = new JLabel("Swing means power.");
		jframe.add(jlabel);
		jframe.setVisible(true);
	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(() -> new BasicJframe());
	}

}
