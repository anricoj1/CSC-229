import javax.swing.JOptionPane;

public class AnricoProject01
{
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null,"Project 1");
		String firstName =JOptionPane.showInputDialog(null, "Please enter your first name: ");
		String lastName =JOptionPane.showInputDialog(null, "Please enter your last name: ");
		
		String input;
		input = JOptionPane.showInputDialog(null, "Please enter # of hours worked (whole number)");
		int hoursWorked = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Hourly Rate: ");
		double hourlyRate = Double.parseDouble(input);
		double grossPay = hoursWorked * hourlyRate;
		input = JOptionPane.showInputDialog(null, "Enter State Income Tax Rate as a decimal: ");
		double stateTax= Double.parseDouble(input);
		double stateRate= stateTax * grossPay;
		input = JOptionPane.showInputDialog(null, "Enter Federal tax rate as a decimal: ");
		double federalTax= Double.parseDouble(input);
		double federalRate= federalTax * grossPay;
		input = JOptionPane.showInputDialog(null, "Enter Retirement plan deduction rate as a decimal: ");
		double retirementRate= Double.parseDouble(input);
		double retirementPlan= retirementRate * grossPay;
		input = JOptionPane.showInputDialog(null, "Enter your Health Insurance Plan as a decimal: ");
		double healthInsurance= Double.parseDouble(input);
		double netPay = grossPay - (stateRate + federalRate + retirementPlan + healthInsurance);
		
		JOptionPane.showMessageDialog(null, "CSC 229 Project 1 "+"\n"+
											
				
											"__________________________ "+"\n"+
											
											"First Name: "+firstName+"\n"+
											"Last Name: "+lastName+"\n"+
											"__________________________"+"\n"+
											"Number of Hours Worked: "+hoursWorked+"\n"+
											"Hourly Rate: "+hourlyRate+"\n"+
											"State Income Tax Rate: "+stateTax+"\n"+
											"Federal Income Tax Rate: "+federalTax+"\n"+
											"Retirement Plan Deduction Rate: "+retirementRate+"\n"+
											"Health Insurance Plan: "+healthInsurance+"\n"+
											
											"__________________________"+"\n"+
											
											"Gross Pay: "+grossPay+"\n"+
											"State Income Tax: "+stateRate+"\n"+
											"Federal Income Tax: "+federalRate+"\n"+
											"Retirement Plan Deduction: "+retirementPlan+"\n"+
											"Health Insurance Deduction: "+healthInsurance+"\n"+
											"Net Pay: "+netPay);
										
		JOptionPane.showMessageDialog(null, "Good Bye");
	}
}
