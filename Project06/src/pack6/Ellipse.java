package pack6;

import javax.swing.JOptionPane;

public class Ellipse 
{
	private int xtopLeft;
	private int ytopLeft;
	private double height;
	private double width;
	
	public Ellipse()
	{
		xtopLeft = 0;
		ytopLeft = 0;
		height = 0;
		width = 0;
	}
	public Ellipse(int x, int y, double h, double w)
	{
		xtopLeft = x;
		ytopLeft = y;
		height = h;
		width = w;
	}
	public int getxtopLeft()
	{
		return xtopLeft;
	}
	public int getytopLeft()
	{
		return ytopLeft;
	}
	public double getheight()
	{
		return height;
	}
	public double getwidth()
	{
		return height;
	}
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"Top Left X Corner of Ellipse",JOptionPane.QUESTION_MESSAGE);
        xtopLeft=Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"Top Left X Corner of Ellipse",JOptionPane.QUESTION_MESSAGE);
        ytopLeft=Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"The Height of Ellipise",JOptionPane.QUESTION_MESSAGE);
        height=Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"Top Width of Ellipse",JOptionPane.QUESTION_MESSAGE);
        width=Double.parseDouble(input);
        
	}
	public double getPerim()
	{
		double a = width * 0.5;
		double b = height * 0.5;
		double ellipsePerim=
				Math.PI * (
						3 * (a + b) - Math.sqrt(
								(3 * a + b) * (a + 3 * b)
								)
						);
		return ellipsePerim;
	}
	public double getArea()
	{
		double a = width * 0.5;
		double b = height * 0.5;
		double ellipseArea= Math.PI * a * b;
		return ellipseArea;
	}
}
