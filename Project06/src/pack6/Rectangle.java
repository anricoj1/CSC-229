package pack6;

import javax.swing.JOptionPane;

public class Rectangle 
{
	private int xTopLeft;
	private int yTopLeft;
	private int width;
	private int height;
	
	public  Rectangle()
	{
		xTopLeft = 0;
		yTopLeft = 0;
		width    = 0;
		height   = 0;
	}
	public  Rectangle(int x, int y, int w, int h)
	{
		xTopLeft = x;
		yTopLeft = y;
		width    = w;
		height   = h;
	}
	public int getxTopLeft()
	{
		return xTopLeft;
	}
	public int getyTopLeft()
	{
		return yTopLeft;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"Top Left X Corner of Rectangle",JOptionPane.QUESTION_MESSAGE);
        xTopLeft=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Top Left Y Corner of Rectangle",JOptionPane.QUESTION_MESSAGE);
        yTopLeft=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Width of the Rectangle",JOptionPane.QUESTION_MESSAGE);
        width=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Height of the Rectangle",JOptionPane.QUESTION_MESSAGE);
        height = Integer.parseInt(input);
        
        
	}
	public int getPerimeter()
	{
		return(width + height) *2;
		
	}
	public int getArea()
	{
		return width * height;
		
	}
}
