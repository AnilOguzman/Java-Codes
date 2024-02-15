package week5;

import java.awt.*;

import javax.swing.*;

public class managedraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		draw d=new draw(50,100,"hello");
		JFrame win;
		Container contentPane;
		Graphics g;
		win = new JFrame("My First Rectangle");
		win.setSize(500, 200);
		win.setLocation(100,100);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = win.getContentPane();	
		g = contentPane.getGraphics();
		d.print(g,win.getContentPane());
	}

}
