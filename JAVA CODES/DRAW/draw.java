package week5;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

public class draw {
	
	int x,y;
	String text;
	public static int count=0;
	
	draw(int x,int y,String text)
	{
		this.text=text;
		this.x=x;
		this.y=y;
	}
	
	public void print(Graphics g,Container content_size)
	{
		int x1,y1,x2,y2;
		Rectangle2D r = g.getFontMetrics().getStringBounds(text, g);
		int text_width=(int)r.getWidth();
		int text_heigth=(int)r.getHeight();
		for(x1=x;x1<content_size.getWidth()-text_width;x1++)
		{
			g.clearRect(0, 0, content_size.getWidth(), content_size.getHeight());
			count++;
			g.drawString(count+"", content_size.getWidth()/2, content_size.getHeight()/2);
			g.drawString(text, x1, y);
			try {Thread.sleep(50);} catch (Exception e) {}
		}
		for(y1=y;y1<content_size.getHeight()-text_heigth;y1++)
		{
			g.clearRect(0, 0, content_size.getWidth(), content_size.getHeight());
			count++;
			g.drawString(count+"", content_size.getWidth()/2, content_size.getHeight()/2);
			g.drawString(text,x1,y1);
			try {Thread.sleep(50);} catch (Exception e) {}
		}
		for(x2=x1;x2>x;x2--)
		{
			g.clearRect(0, 0, content_size.getWidth(), content_size.getHeight());
			count++;
			g.drawString(count+"",  content_size.getWidth()/2, content_size.getHeight()/2);
			g.drawString(text,x2,y1);
			try {Thread.sleep(50);} catch (Exception e) {}
		}
		for(y2=y1;y2>y;y2--)
		{
			g.clearRect(0, 0, content_size.getWidth(), content_size.getHeight());
			count++;
			g.drawString(count+"", content_size.getWidth()/2, content_size.getHeight()/2);
			g.drawString(text,x2,y2);
			try {Thread.sleep(50);} catch (Exception e) {}
		}
	}
}
