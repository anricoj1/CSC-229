package pack6;

import javax.swing.JOptionPane;

public class Triangle 
{
	private int pickx1;
	private int pickx2;
	private int pickx3;
	private int picky1;
	private int picky2;
	private int picky3;
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		pickx1 = 0;
		pickx2 = 0;
		pickx3 = 0;
		picky1 = 0;
		picky2 = 0;
		picky3 = 0;
		
	}
	public Triangle(int x1,int x2,int x3,int y1,int y2,int y3, double s1, double s2)
	{
		pickx1 = x1;
		pickx2 = x2;
		pickx3 = x3;
		picky1 = y1;
		picky2 = y2;
		picky3 = y3;
		
	}
	public int getx1()
	{
		return pickx1;
	}
	public int getx2()
	{
		return pickx2;
	}
	public int getx3()
	{
		return pickx3;
	}
	public int gety1()
	{
		return picky1;
	}
	public int gety2()
	{
		return picky2;
	}
	public int gety3()
	{
		return picky3;
	}
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null, "Please enter an integer:",
				"The X1 Coordinate",JOptionPane.QUESTION_MESSAGE);
		pickx1=Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Please enter an integer:",
				"The Y1 Coordinate",JOptionPane.QUESTION_MESSAGE);
		picky1=Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Please enter an integer:",
				"The X2 Coordinate",JOptionPane.QUESTION_MESSAGE);
		pickx2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Please enter an integer:",
				"The Y2 Coordinate",JOptionPane.QUESTION_MESSAGE);
		picky2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Please enter an integer:",
				"The X3 Coordinate",JOptionPane.QUESTION_MESSAGE);
		pickx3 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Please enter an integer:",
				"The Y3 Coordinate",JOptionPane.QUESTION_MESSAGE);
		picky3 = Integer.parseInt(input);
		
	}
	public double getSide1()
	{
		side1 = Math.sqrt((pickx1-pickx2) * (pickx1-pickx2) + (picky1-picky2) * (picky1-picky2));
		return side1;
	}
	public double getSide2()
	{
		side2 = Math.sqrt((pickx1-pickx3) * (pickx1-pickx3) + (picky1-picky3) * (picky1-picky3));
		return side2;
	}
	public double getSide3()
	{
		side3 = Math.sqrt((pickx2-pickx3) * (pickx2-pickx3) + (picky2-picky3) * (picky2-picky3));
		return side3;
	}
	public double getPerim()
	{
		double trianglePerim = side1 + side2 + side3;
		return trianglePerim;
	}
	public double getArea()
	{
		double s = (side1 + side2 + side3) / 2;
		double findArea = s * (s-side1) * (s-side2) * (s-side3);
		double triangleArea = Math.sqrt(findArea);
		return triangleArea;
	}

}
