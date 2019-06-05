package pack6;

import javax.swing.JOptionPane;

public class Cylinder 
{
	private int xCenter;
	private int yCenter;
	private int radius;
	private int height;
	
	public  Cylinder()
	{
		xCenter = 0;
		yCenter = 0;
		radius    = 0;
		height   = 0;
	}
	public  Cylinder(int x, int y, int r, int h)
	{
		xCenter = x;
		yCenter = y;
		radius    = r;
		height   = h;
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
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"The Center X Coordinate of Cylinder",JOptionPane.QUESTION_MESSAGE);
        xCenter=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"The Center Y Coordiante of Cylinder",JOptionPane.QUESTION_MESSAGE);
        yCenter=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Radius of Cylinder",JOptionPane.QUESTION_MESSAGE);
        radius=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Height of the Cylinder",JOptionPane.QUESTION_MESSAGE);
        height = Integer.parseInt(input);
        
        
	}
	public double getSurface()
	{
		double a = 2 * Math.PI *(
				(radius * height));
		double b = 2 * Math.PI *(
				(radius * radius));
		double cylinderSurf = a + b;
		
		return cylinderSurf;
		
	}
	public double getVolume()
	{
		double cylinderVol=
				Math.PI * (
						(radius * radius) * height);
		return cylinderVol;
	}

}
