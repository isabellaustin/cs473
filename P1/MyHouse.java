import java.awt.event.*;
import java.awt.*;

public class MyHouse extends Frame
{
	public static void main(String[] args){new MyHouse();}
	
	MyHouse()
	{
		super("MyHouse: Welcome to my house!");
		addWindowListener(new WindowAdapter()
			{public void windowClosing(WindowEvent e){System.exit(0);}});
		setSize(1200, 800);
		add("Center", new CvMyHouse());
		show();
	}
}

class CvMyHouse extends Canvas
{  
	public void paint(Graphics g)
	{  
		Dimension d = getSize();
		int maxX = d.width - 1, maxY = d.height - 1;
		
		//sky
		g.setColor(Color.CYAN);
		g.fillRect(10, 10, maxX-20, maxY-20);
		
		//grass
		g.setColor(Color.green);
		g.fillRect(10, 650, maxX-20, maxY-20);
		
		//sun
		g.setColor(Color.YELLOW);
		g.fillOval(60, 60, 130, 130);
		
		//house base
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(200, 290, 900, 450);
		
		//roof
		g.setColor(Color.PINK);
		g.fillPolygon(new int[] {200, 1100, 650}, new int[] {290, 290, 100}, 3);
		
		//door
		g.setColor(Color.GRAY);
		g.fillRect(280, 400, 210, 340);
		
		//doorknob
		g.setColor(Color.YELLOW);
		g.fillOval(460, 570, 20, 20);
		
		//window
		g.setColor(Color.DARK_GRAY);
		g.fillRect(565, 350, 465, 200);
		
		//left curtain
		g.setColor(Color.PINK);
		g.fillRect(565, 350, 75, 200);
		
		//right curtain
		g.setColor(Color.PINK);
		g.fillRect(955, 350, 75, 200);
		
		//top left curtain, triangle
		g.setColor(Color.PINK);
		g.fillPolygon(new int[] {565, 565, 800}, new int[] {350, 400, 350}, 3);

		//top rght curtain, triangle
		g.setColor(Color.PINK);
		g.fillPolygon(new int[] {1030, 1030, 800}, new int[] {350, 400, 350}, 3);
		
		//plant
		g.setColor(Color.GREEN);
		g.fillRect(720, 580, 160,30);
		
		//plant basket
		g.setColor(Color.GRAY);
		g.fillRect(715, 605, 170, 65);
		
		//chimney base
		g.setColor(Color.DARK_GRAY);
		g.fillRect(465, 145, 50, 75);
		
		//chimney bottom
		g.setColor(Color.DARK_GRAY);
		g.fillRect(455, 135, 70, 25);
	}
}