package pack6;

import javax.swing.JOptionPane;

public class Diamond 
{
	private int xCenter;
	private int yCenter;
	private double width;
	private double height;
	private double side;
	
	public  Diamond()
	{
		yCenter = 0;
		xCenter = 0;
		width    = 0;
		height   = 0;
		side = 0;
	}
	public  Diamond(int x, int y, double w, double h, double s)
	{
		xCenter = x;
		yCenter = y;
		width    = w;
		height   = h;
		side = s;
	}
	public int getxCenter()
	{
		return xCenter;
	}
	public int getyCenter()
	{
		return yCenter;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	public double getSide()
	{
		side = Math.sqrt((0.5 * height) * (0.5 * height) + (0.5 * width) * (0.5 * width));
		return side;
	}
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"X Center Coordinate of Diamond",JOptionPane.QUESTION_MESSAGE);
        xCenter=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Y Center Coordinate of Diamond",JOptionPane.QUESTION_MESSAGE);
        yCenter=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Width of the Diamond",JOptionPane.QUESTION_MESSAGE);
        width=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Height of the Diamond",JOptionPane.QUESTION_MESSAGE);
        height = Integer.parseInt(input);   
        
	}
	public double getPerimeter()
	{
		double diamondPerim = side * 4;
		return diamondPerim;
		
	}
	public double getArea()
	{
		double diamondArea = 0.5 * height * width;
		return diamondArea;
		
	}
}



