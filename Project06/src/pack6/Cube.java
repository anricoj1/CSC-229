package pack6;

import javax.swing.JOptionPane;

public class Cube 
{
	private int xtopLeft;
	private int ytopLeft;
	private double width;
	private double height;
	
	public  Cube()
	{
		xtopLeft = 0;
		ytopLeft = 0;
		width    = 0;
		height   = 0;
	}
	public  Cube(int x, int y, int w, int h)
	{
		xtopLeft = x;
		ytopLeft = y;
		width    = w;
		height   = h;
	}
	public int getxtopLeft()
	{
		return xtopLeft;
	}
	public int getytopLeft()
	{
		return ytopLeft;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"X Top Left Coordinate of Cube",JOptionPane.QUESTION_MESSAGE);
        xtopLeft=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Y Top Left Coordinate of Cube",JOptionPane.QUESTION_MESSAGE);
        ytopLeft=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Width of the Cube",JOptionPane.QUESTION_MESSAGE);
        width=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Height of the Cube",JOptionPane.QUESTION_MESSAGE);
        height = Integer.parseInt(input);  
        
	}
	public double getPerimeter()
	{
		double cubePerim = (6 * width) * (6 * width);
		return cubePerim;
		
	}
	public double getArea()
	{
		double cubeArea = width * width * width;
		return cubeArea;
		
	}

}
