package p2;

import javax.swing.JOptionPane;

public class AnricoProject2
{

	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "CSC 229 Project 02");
		
		String input;
		input = JOptionPane.showInputDialog(null, "Please enter a Positive Number: ");
		double heightRec= Double.parseDouble(input);
		input = JOptionPane.showInputDialog(null, "Please enter a Positive Number: ");
		double widthRec= Double.parseDouble(input);
		double areaRec= heightRec * widthRec;
		double a =widthRec * 0.5;
		double b =heightRec * 0.5;
		double peramRec =Math.pow(heightRec,2) * Math.pow(widthRec,2);
		double ellipsePeram = 
				Math.PI * (
						3 * (a + b) - Math.sqrt(
								(3 * a + b) * (a + 3 * b)
								)
						);
		double ellipiseArea =Math.PI a * b;
		
		
		JOptionPane.showMessageDialog(null, "CSC 229 Project02"+"\n"+
											"______________________"+"\n"+
											
											"Rectangle Properties"
											"______________________"+"\n"
											"Height: "+heightRec+"\n"+
											"Width: "+widthRec+"\n+"
											"Perimeter: "+peramRec+"\n"+
											"Area: "+areaRec+"\n"+
											"______________________"+"\n"+
											"Bounded Ellipse Properties"+"\n"+
											"_______________________"+"\n"+
											"Height: "+heightRec+"\n"+
											"Width: "+widthRec+"\n"+
											"Perimeter: "+ellipsePeram+"\n"+
											"Area: "+ellipiseArea);
		
		
		
	}

}