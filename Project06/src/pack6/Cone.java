package pack6;

import javax.swing.JOptionPane;

public class Cone 
{
	private int xCenter;
	private int yCenter;
	private int radius;
	private int height;
	private double side;
	
	public  Cone()
	{
		xCenter = 0;
		yCenter = 0;
		radius    = 0;
		height   = 0;
		side = 0;
	}
	public  Cone(int x, int y, int r, int h, double l)
	{
		xCenter = x;
		yCenter = y;
		radius    = r;
		height   = h;
		side = l;
	}
	public int getxCenter()
	{
		return xCenter;
	}
	public int getyCenter()
	{
		return yCenter;
	}
	public int getRadius()
	{
		return radius;
	}
	public int getHeight()
	{
		return height;
	}
	public double getSide()
	{
		side = Math.sqrt((0.5 * height) * (0.5 * height) + (radius * radius));
		return side;
	}
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"X Center Coordinate of Cone",JOptionPane.QUESTION_MESSAGE);
        xCenter=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Y Center Coordinate of Cone",JOptionPane.QUESTION_MESSAGE);
        yCenter=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Radius of Cone",JOptionPane.QUESTION_MESSAGE);
        radius=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Height of the Cone",JOptionPane.QUESTION_MESSAGE);
        height = Integer.parseInt(input);
        
        
	}
	public double getSurface()
	{
		double conePerim = 
				Math.PI * (
						radius * side) + Math.PI *(
								(radius * radius)
								);
				
		return conePerim;
			
	}
	public double getVolume()
	{
		double coneArea=
				0.333 * Math.PI * (
						(radius * radius) * height);
		return coneArea;
		
	}

}
