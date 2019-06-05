package pack4;

import javax.swing.JOptionPane;

public class Project04 
{
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
	while(optionSelected !=4)
	{
		input = JOptionPane.showInputDialog(
				"CSC 229 Project 04(Math Series)"+"\n"+
				"______________________________"+"\n"+
				"Select a series by pressing the numnber key Associated 4 to Exit the program"+"\n"+
				"_______________________________"+"\n"+
				" 1) 1+2+3+....+N"+"\n"+
				" 2) 1^2+2^2+3^2+....+N^2"+"\n"+
				" 3) 1x2x3x....xN"+"\n"+
				" 4) Exit"+"\n"+
				"_______________________________"
				);
		optionSelected = Integer.parseInt(input);
		switch(optionSelected)
		{
			case 1:
			{
				input = JOptionPane.showInputDialog("Please type a positive integer number: ");
				n = Integer.parseInt(input);
				result = sum1N(n);
				displayResults(optionSelected,n,result);
				break;
			}
			case 2:
			{
				input = JOptionPane.showInputDialog("Please enter a postive integer: ");
				n = Integer.parseInt(input);
				result = sumSquares(n);
				displayResults(optionSelected,n,result);
				break;
			}
			case 3:
			{
				input = JOptionPane.showInputDialog("Please enter a positive integer: ");
				n = Integer.parseInt(input);
				result = factorial(n);
				displayResults(optionSelected,n,result);
				break;
			}
			case 4:
			{
				JOptionPane.showMessageDialog(null,
						"You are exiting the program....");
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("Incorrect input");
				
			}
		}
	}
	}
				
	public static double sum1N(int n)
	{
		double sum = 0.0;
		for (int i=1; i<=n; i++)
		{
			sum = sum + i;
			
		}
		return sum;
	}
	public static double sumSquares(int n)
	{
		int sum = 1;
		for (int i=2; i<=n; i++)
		{
			sum = sum + (i*i);
		}
		return sum;
	}
	public static double factorial(int n)
	{
		if (n== 0)
			return 1;
		else
			return(n*factorial(n-1));
	}
	public static void wrongInput(int optionSelected) // i tried making an execption statement for incorrect input type but i couldnt get it to work
	{
		try 
		{
			int num= Integer.parseInt(" ");
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "You entered the wrong input");
			menu();
		}
	}
	public static void displayResults(int optionSelected, int n, double result)
	{
		switch(optionSelected)
		{
			case 1:
			{
				JOptionPane.showMessageDialog(null,
						"    CSC 229 - Project 4 (Math Series)"+"\n"+
						"__________________________________________________"+"\n"+
						"    1 + 2 + 3 + .... +"+n+" = " +result +"\n"+
						"__________________________________________________"
					);
			break;
		}
		case 2:
		{
			JOptionPane.showMessageDialog(null,
					"     CSC 229 - Project 4 (Math Series)"+"\n"+
					"_________________________________________________"+"\n"+
					"     1^2 + 2^2 + 3^2 + .... +"+n+" = " +result +"\n"+
					"__________________________________________________"
					);
			break;
		}
		case 3:
		{
			JOptionPane.showMessageDialog(null,
					"     CSC 229 - Project 4 (Math Series)"+"\n"+
					"________________________________________________"+"\n"+
					"     1 * 2 * 3 * .... *"+n+" = " +result+"\n"+
					"_________________________________________________"
					);
			break;
		}
		case 4:
		{
			JOptionPane.showMessageDialog(null,
					"     CSC 229 - Project 4 (Math Series)"+"\n"+
					"_______________________________________________"+"\n"+
					"                Exiting program....          ");
			break;
		}
		default:
		{
			JOptionPane.showMessageDialog(null,
					"You entered an invalid input...restarting");
			menu();
			break;
		}
		}
	}


}
