package task3;
import java.awt.*;
import javax.swing.*;
public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame win;
		Container contentPane;
		Graphics g;
		win = new JFrame("My First Rectangle");
		win.setSize(300, 200);
		win.setLocation(100,100);
		win.setVisible(true);
		contentPane = win.getContentPane();
		g = contentPane.getGraphics(); 
		g.drawRect(50,50,100,30);
	}

}
