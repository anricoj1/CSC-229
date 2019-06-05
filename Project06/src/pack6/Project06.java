package pack6;

import javax.swing.JOptionPane;

public class Project06 
{
	static Rectangle r = new Rectangle();
	static Ellipse e = new Ellipse();
	static Triangle t = new Triangle();
	static Diamond d = new Diamond();
	static Cube cube = new Cube();
	static Cone cone = new Cone();
	static Cylinder cylinder = new Cylinder();
	
	static int optionSelected = 0;
	
	public static void main(String[] args)
	{
		menu();
	}
	
	public static void menu()
	{
		String input;
		
		
	    while (optionSelected != 8 )
	    {
		   input = JOptionPane.showInputDialog(null,
                      "          CSC 229 - Project 06 (Geometric Shapes)"     +"\n" +
                      " ________________________________________________"+"\n" +
                      " Select a Shape by Pressing The Number key Associated"+"\n" +
                      "                       8 to Exit the Program          "+"\n" +
                      "_________________________________________________"+"\n"+
                      "                          Two-Dimensional Shapes      "+"\n"+
                      "_________________________________________________"+"\n" +
                      "                               1)  Rectangle          "+"\n" +
                      "                               2)  Ellipse            "+"\n" +
                      "                               3)  Triangle			 "+"\n" +
                      "                               4)  Diamond            "+"\n" +
                      "_________________________________________________"+"\n"+
                      "                          Three-Dimensional Shapes     "+"\n"+
                      "_________________________________________________"+"\n"+
                      "                              5)  Cube                "+"\n" +
                      "                              6)  Cone                "+"\n" +
                      "                              7)  Cylinder		     "+"\n" +
                      "_________________________________________________"+"\n"+
                      "                              8)  Exit                         "+"\n" +
                      "_________________________________________________"
		                             
				                      );
	       optionSelected = Integer.parseInt(input);


			switch (optionSelected)
			{
				case 1: 
				{
					r.getAttributes();
					displayResults();
					break;
				}
				case 2: 
				{
					e.getAttributes();
					displayResults();
					break;
				}
				case 3: 
				{
					t.getAttributes();
					displayResults();
					break;
				}
				case 4: 
				{
					d.getAttributes();
					displayResults();
					break;
				}
				case 5: 
				{
					cube.getAttributes();
					displayResults();
					break;
				}
				case 6:
				{
					cone.getAttributes();
					displayResults();
					break;
				}
				case 7:
				{
					cylinder.getAttributes();
					displayResults();
					break;
				}
				case 8:
				{
					displayResults();
					System.exit(0);
				}
				
				default:
				{
					displayResults();
					break;
				}
			}

	  }
	}
	
	public static void displayResults()
	{
		switch (optionSelected)
		{
			case 1: 
			{
				JOptionPane.showMessageDialog(null, 
						        "Properties of the Rectangle Are:\n"+
				        		"__________________________\n"+
								"Top Left Corner              =  ("+r.getxTopLeft() +","+r.getyTopLeft()+")"+"\n"+
								"Width                             = "+r.getWidth()+"\n"+
								"Height                            = "+r.getHeight()+"\n"+
								"Perimeter                         = "+r.getPerimeter()+"\n"+
								"Area                               = "+r.getArea()
						);
				break;
			}
			case 2: 
			{
				JOptionPane.showMessageDialog(null, 
				        "Properties of the Ellipse Are:\n"+
		        		"__________________________\n"+
						"Top Left Corner              = ("+e.getxtopLeft() +","+e.getytopLeft()+")"+"\n"+
						"Width                             = "+e.getwidth()+"\n"+
						"Height                            = "+e.getheight()+"\n"+
						"Perimeter                        = "+e.getPerim()+"\n"+
						"Area                               = "+e.getArea()
						);
				
				break;
			}
			case 3: 
			{
				JOptionPane.showMessageDialog(null, 
				        "Properties of the Triangle Are:\n"+
		        		"__________________________\n"+
						"First Vertex              = ("+t.getx1() +","+t.gety1()+")"+"\n"+
		        		"Second Vertex			      = ("+t.getx2() +","+t.gety2()+")"+"\n"+
						"Third Vertex			         = ("+t.getx3() +","+t.gety3()+")"+"\n"+
		        		"Side1                      = "+t.getSide1()+"\n"+
						"Side2					                 = "+t.getSide2()+"\n"+
		        		"Side3					                 = "+t.getSide3()+"\n"+
						"Perimeter               = "+t.getPerim()+"\n"+
						"Area                       = "+t.getArea()
						);
				break;
			}
			case 4: 
			{
				JOptionPane.showMessageDialog(null, 
				        "Properties of the Diamond Are:\n"+
		        		"__________________________\n"+
						"Center Point                = ("+d.getxCenter() +","+d.getyCenter()+")"+"\n"+
						"Width                          = "+d.getWidth()+"\n"+
						"Height                         = "+d.getHeight()+"\n"+
						"Side							                      = "+d.getSide()+"\n"+
						"Perimeter                    = "+d.getPerimeter()+"\n"+
						"Area                             = "+d.getArea()
						);
				break;
			}
			case 5: 
			{
				JOptionPane.showMessageDialog(null, 
				        "Properties of the Cube Are:\n"+
		        		"__________________________\n"+
						"Top Left Corner              = ("+cube.getxtopLeft() +","+cube.getytopLeft()+")"+"\n"+
						"Width                             = "+cube.getWidth()+"\n"+
						"Height                            = "+cube.getHeight()+"\n"+
						"Surface                           = "+cube.getPerimeter()+"\n"+
						"Volume                           = "+cube.getArea()
						);
				break;
			}
			case 6: 
			{
				JOptionPane.showMessageDialog(null, 
				        "Properties of the Cone Are:\n"+
		        		"__________________________\n"+
						"Top Left Corner              = ("+cone.getxCenter() +","+cone.getyCenter()+")"+"\n"+
						"Radius                           = "+cone.getRadius()+"\n"+
						"Height                           = "+cone.getHeight()+"\n"+
						"Surface                          = "+cone.getSurface()+"\n"+
						"Volume                           = "+cone.getVolume()
						);
				break;
			}
			case 7: 
			{
				JOptionPane.showMessageDialog(null, 
				        "Properties of the Cylinder Are:\n"+
		        		"__________________________\n"+
						"Top Left Corner              = ("+cylinder.getxCenter() +","+cylinder.getyCenter()+")"+"\n"+
						"Radius                           = "+cylinder.getRadius()+"\n"+
						"Height                           = "+cylinder.getHeight()+"\n"+
						"Surface                          = "+cylinder.getSurface()+"\n"+
						"Volume                           = "+cylinder.getVolume()
						);
				break;
			}
			case 8:
			{
				JOptionPane.showMessageDialog(null, "                 Good By                   ");
				System.exit(0);
			}
			default:
			{
				JOptionPane.showMessageDialog(null, "Incorrect input Value, Please Enter Numbers Between 1 and 8");
				break;
			}
		}
	}
	


}
