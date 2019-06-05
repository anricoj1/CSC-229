package pack5;

import javax.swing.JOptionPane;

public class Project05 {
	public static void main(String[] args)
	{
		menu();
	}
	public static void menu()
	{
		String input;
		int optionSelected = 0;
		int n = 0;
		double result;
	while(optionSelected !=5)
	{
		input = JOptionPane.showInputDialog(
				"CSC 229 Project 05(Shape Properties)"+"\n"+
				"______________________________"+"\n"+
				"Select a Shape by pressing the numnber key Associated 4 to Exit the program"+"\n"+
				"_______________________________"+"\n"+
				" 1) Rectangle"+"\n"+
				" 2) Ellipse"+"\n"+
				" 3) Triangle"+"\n"+
				" 4) Diamond"+"\n"+
				" 5) Exit"+"\n"+
				"_______________________________"
				);
		optionSelected = Integer.parseInt(input);
		switch(optionSelected)
		{
			case 1:
			{
				rectangle();
				break;
			}
			case 2:
			{
				ellipise();
				break;
			}
			case 3:
			{
				triangle();
				
				break;
			}
			case 4:
			{
				diamond();
				break;
			}
			case 5:
			{
				JOptionPane.showMessageDialog(null, "Good Bye");
				System.exit(0);
				break;
			}
			default:
			{
				JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5");
				
			}
		}
	}
	}
	public static void rectangle()
	{
		String rectangleDescription = getRectangleAtt();
		displayResults(1,rectangleDescription);
		
	}
	public static String getRectangleAtt()
	{
		String input;
		int x,y,height,width;
		
		input = JOptionPane.showInputDialog(null, "Enter the x coordiante of topleft corner of rectangle: ");
		x = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter the y coordinate");
		y = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter the width of rectangle");
		width = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter the height of rectangle");
		height = Integer.parseInt(input);
		
		int p = getRectanglePerim(height,width);
		int a = getRectangleArea(height,width);
		String result = "Properties of the Rectangle Area: "+"\n"+
						"____________________________________"+"\n"+
						"Top left corner           = ("+x+","+y+")"+"\n"+
						"Width                        = "+width    +"\n"+
						"Height                       = "+height   +"\n"+
						"Perimeter                   = "+p+"\n"   +
						"Area                          = "+a        +"\n";
		return result;
	}
	public static int getRectanglePerim(int height, int width)
	{
		int perimeter = (height + width)*2;
		return perimeter;
	}
	public static int getRectangleArea(int height, int width)
	{
		return height*width;
	}
	public static void ellipise()
	{
		String ellipiseDescription = getEllipiseAtt();
		displayResults(2,ellipiseDescription);
	}
	public static String getEllipiseAtt()
	{
		String input;
		double width,height;
		int x,y;
		
		input = JOptionPane.showInputDialog(null, "Top left X corner of Ellipise: ");
		x = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Top left Y corner of Ellipise: ");
		y = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter a positive integer(height): ");
		height = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter a positive integer(width): ");
		width = Integer.parseInt(input);
		
		double a = width * 0.5;
		double b = height * 0.5;
		
		
		double ep = getEllipisePerim(a,b);
		double ea = getEllipiseArea(a,b);
		
		String result = "Properties of the Ellipise:   "+"\n"+
						"________________________________"+"\n"+
						"Top Left Corner:          = "+"("+x+","+y+")"+"\n"+
						"Width                           =  "+width+"\n"+
						"Height                         = "+height+"\n"+
						"Perimeter:                     = "+ep+"\n"+
						"Area:                            = "+ea+"\n";
		return result;
		
	}
	public static double getEllipisePerim(double a, double b)
	{
		double ellipisePerim=
				Math.PI * (
					3 * (a + b) - Math.sqrt(
						(3 * a + b) * (a + 3 * b)
						)
					);
		return ellipisePerim;
				
	}
	public static double getEllipiseArea(double a, double b)
	{
		double ellipiseArea= Math.PI * a * b;
		return ellipiseArea;
	}
	public static void triangle()
	{
		String triangleDescription = getTriangleAtt();
		displayResults(3,triangleDescription);
	}
	public static String getTriangleAtt()
	{
		String input;
		
		int x1,y1,x2,y2,x3,y3;
		
		input = JOptionPane.showInputDialog(null, "Enter x1: ");
		x1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter y1: ");
		y1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter x2: ");
		x2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter y2: ");
		y2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter x3: ");
		x3 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter y3: ");
		y3 = Integer.parseInt(input);
		
		double side1 = Math.sqrt(((x1-x2) * (x1-x2)) + ((y1-y2) * (y1-y2)));
		double side2 = Math.sqrt(((x1-x3) * (x1-x3)) + ((y1-y3) * (y1-y3)));
		double side3 = Math.sqrt(((x2-x3) * (x2-x3)) + ((y2-y3) * (y2-y3)));
		
		double ta = getTriangleArea(side1,side2,side3);
		double tp = getTrianglePerim(side1,side2,side3);
		
		String result = "Properties of a Triangle:      "+"\n"+
					"___________________________________"+"\n"+
				    "First Vertex:           = "+"("+x1+","+y1+")"+"\n"+
					"Second Vertex:       = "+"("+x2+","+y2+")"+"\n"+
				    "Third Vertex:          = "+"("+x2+","+y2+")"+"\n"+
					"Side 1:                   = "+side1+"\n"+
				    "Side 2:                   = "+side2+"\n"+
					"Side 3:                   = "+side3+"\n"+
				    "Perimeter:              = "+tp+"\n"+
					"Area:                      = "+ta;
		return result;
		
	}
	public static double getTrianglePerim(double side1, double side2, double side3)
	{
		double trianglePerim = side1 + side2 + side3;
		return trianglePerim;
	}
	public static double getTriangleArea(double side1, double side2, double side3)
	{
		double s = (side1 + side2 + side3) / 2;
		double findArea = s * (s-side1) * (s-side2) * (s-side3);
		double triangleArea = Math.sqrt(findArea);
		return triangleArea;
		
	}
	public static void diamond()
	{
		String diamondDescription = getDiamondAtt();
		displayResults(3,diamondDescription);
	}
	public static String getDiamondAtt()
	{
		String input;
		double height,width;
		int xcenter,ycenter;
		
		input = JOptionPane.showInputDialog(null, "Enter x coordinate: ");
		xcenter = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter y coordinate: ");
		ycenter = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter the height: ");
		height = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter the width: ");
		width = Integer.parseInt(input);
		
		double a = 0.5 * height;
		double b = 0.5 * width;
		double c = (a*a) + (b*b);
		double s = Math.sqrt(c);
		
		double dp = getDiamondPerim(height,width,s);
		double da = getDiamondArea(height,width);
		
		String result = "Properties of a Diamond:          "+"\n"+
						"__________________________________"+"\n"+
						"Center Point                  = "+"("+xcenter+","+ycenter+")"+"\n"+
						"Height                           = "+height+"\n"+
						"Width                            = "+width+"\n"+
						"Side                              = "+s+"\n"+
						"Perimeter                      = "+dp+"\n"+
						"Area                              = "+da;
		return result;
		
	}
	public static double getDiamondPerim(double height, double width, double c)
	{
		double diamondPerim = c * 4;
		return diamondPerim;
	}
	public static double getDiamondArea(double height,double width)
	{
		double diamondArea = 0.5 * height * width;
		return diamondArea;
	}
	public static void displayResults(int optionSelected, String shapeProperties)
	{
		switch (optionSelected)
		{
		case 1: 
		{
			JOptionPane.showMessageDialog(null,
											"CSC 229 - Project 05 (Shape Properties)"+"\n"+
											"Author: Jason Anrico"                   +"\n"+
											"_______________________________________"+"\n"+
											shapeProperties
					);
			break;
		}
		case 2:
		{
			JOptionPane.showMessageDialog(null,
											"CSC 229 - Project 05 (Shape Properties)"+"\n"+
											"Author: Jason Anrico"                   +"\n"+
											"_______________________________________"+"\n"+
											shapeProperties
					);
			break;
		}
		case 3:
		{
			JOptionPane.showMessageDialog(null,
											"CSC 229 - Project 05 (Shape Properties)"+"\n"+
											"Author: Jason Anrico"                   +"\n"+
											"_______________________________________"+"\n"+
											shapeProperties
					);
			break;
		}
		case 4:
		{
			JOptionPane.showMessageDialog(null,
											"CSC 229 - Project 05 (Shape Properties)"+"\n"+
											"Author: Jason Anrico"                   +"\n"+
											"_______________________________________"+"\n"+
											shapeProperties
					);
			break;
		}
		}
	}
}
