package pack3;

import javax.swing.JOptionPane;

public class Project03 {
	
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "CSC 229 Project 3");
		String firstName = JOptionPane.showInputDialog(null, "Please enter your first name: ");
		String lastName = JOptionPane.showInputDialog(null, "Enter employees last name: ");
		
		String input;
		input = JOptionPane.showInputDialog(null, "Enter employees current gs level: ");
		int gsLevel = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter employees current step level: ");
		int stpLevel = Integer.parseInt(input);
		
		String newSal;
		newSal = " ";
		
		
		int newStep;
		newStep = stpLevel + 3;
		
JOptionPane.showMessageDialog(null,"CSC 229 Project 3 "+"\n"+
				
											"________________________"+"\n"+
											
											"First Name: "+firstName+"\n"+
											"Last Name: "+lastName+"\n"+
											
											"_________________________"+"\n"+
											
											"Current Grade Scale: "+gsLevel+"\n"+
											"Current Step Level: "+stpLevel+"\n"+
											
											"_________________________"+"\n"+
											
											"Future Step Level: "+newStep+"\n"+
											"Future Salary: "+newSal);
		
		
		switch(newStep) {
		case 1:{newSal = "$24,821";}
		break;
		case 2: {newSal = "$27,907";}
		break;
		case 3: {newSal = "$30,449";}
		break;
		case 4: {newSal = "$34,183";}
		break;
		case 5: {newSal = "$38,245";}
		break;
		case 6: {newSal = "$43,630";}
		break;
		case 7: {newSal = "$47,374";}
		break;
		case 8: {newSal = "$52,465";}
		break;
		case 9: {newSal = "$57,948";}
		break;
		case 10: {newSal = "$63,815";}
		break;
		case 11: {newSal = "$70,111";}
		break;
		case 12: {newSal = "$84,035";}
		break;
		case 13: {newSal = "$99,927";}
		break;
		case 14: {newSal = "$118,085";}
		break;
		case 15: {newSal = "$138,899";}
		break;
		default:
			System.out.println("Invalid");
		
		}
		switch(newStep) {
		case 1: {newSal = "$25,652";}
		break;
		case 2: {newSal = "$28,572";}
		break;
		case 3: {newSal = "$31,464";}
		break;
		case 4: {newSal = "$35,322";}
		break;
		case 5: {newSal = "$39,520";}
		break;
		case 6: {newSal = "$44,051";}
		break;
		case 7: {newSal = "$48,953";}
		break;
		case 8: {newSal = "$54,214";}
		break;
		case 9: {newSal = "$59,880";}
		break;
		case 10: {newSal = "$65,942";}
		break;
		case 11: {newSal = "$72,448";}
		break;
		case 12: {newSal = "$86,836";}
		break;
		case 13: {newSal = "$103,258";}
		break;
		case 14: {newSal = "$122,021";}
		break;
		case 15: {newSal = "$143,529";}
		break;
		default:
			System.out.println("Invalid");
		
		}
		switch(newStep) {
		case 1: {newSal = "$26,478";}
		break;
		case 2: {newSal = "$29,495";}
		break;
		case 3: {newSal = "$32,479";}
		break;
		case 4: {newSal = "$36,461";}
		break;
		case 5: {newSal = "$40,795";}
		break;
		case 6: {newSal = "$45,471";}
		break;
		case 7: {newSal = "$50,532";}
		break;
		case 8: {newSal = "$55,964";}
		break;
		case 9: {newSal = "$61,812";}
		break;
		case 10: {newSal = "$68,069";}
		break;
		case 11: {newSal = "$74,786";}
		break;
		case 12: {newSal = "$89,637";}
		break;
		case 13: {newSal = "$106,589";}
		break;
		case 14: {newSal = "$125,957";}
		break;
		case 15: {newSal = "$148,159";}
		break;
		default:
			System.out.println("Invalid");
		
		}
		switch(newStep) {
		case 1: {newSal = "$27,298";}
		break;
		case 2: {newSal = "$30,278";}
		break;
		case 3: {newSal = "$37,600";}
		break;
		case 4: {newSal = "$42,070";}
		break;
		case 5: {newSal = "$46,892";}
		break;
		case 6: {newSal = "$52,111";}
		break;
		case 7: {newSal = "$47,374";}
		break;
		case 8: {newSal = "$57,713";}
		break;
		case 9: {newSal = "$63,743";}
		break;
		case 10: {newSal = "$70,197";}
		break;
		case 11: {newSal = "$77,123";}
		break;
		case 12: {newSal = "$92,438";}
		break;
		case 13: {newSal = "$109,920";}
		break;
		case 14: {newSal = "$129,893";}
		break;
		case 15: {newSal = "$152,789";}
		break;
		default:
			System.out.println("Invalid");
		
		}
		switch(newStep) {
		case 1: {newSal = "$28,124";}
		break;
		case 2: {newSal = "$30,621";}
		break;
		case 3: {newSal = "$34,508";}
		break;
		case 4: {newSal = "$38,739";}
		break;
		case 5: {newSal = "$43,345";}
		break;
		case 6: {newSal = "$48,312";}
		break;
		case 7: {newSal = "$53,690";}
		break;
		case 8: {newSal = "$59,562";}
		break;
		case 9: {newSal = "$65,675";}
		break;
		case 10: {newSal = "$72,324";}
		break;
		case 11: {newSal = "$79,460";}
		break;
		case 12: {newSal = "$95,239";}
		break;
		case 13: {newSal = "$113,251";}
		break;
		case 14: {newSal = "$133,829";}
		break;
		case 15: {newSal = "$157,418";}
		break;
		default:
			System.out.println("Invalid");
		
		}
		switch(newStep) {
		case 1: {newSal = "$28,606";}
		break;
		case 2: {newSal = "$31,522";}
		break;
		case 3: {newSal = "$35,523";}
		break;
		case 4: {newSal = "$39,878";}
		break;
		case 5: {newSal = "$44,620";}
		break;
		case 6: {newSal = "$49,732";}
		break;
		case 7: {newSal = "$55,269";}
		break;
		case 8: {newSal = "$61,212";}
		break;
		case 9: {newSal = "$67,607";}
		break;
		case 10: {newSal = "$74,451";}
		break;
		case 11: {newSal = "$81,798";}
		break;
		case 12: {newSal = "$98,040";}
		break;
		case 13: {newSal = "$116,582";}
		break;
		case 14: {newSal = "$137,765";}
		break;
		case 15: {newSal = "$162,048";}
		break;
		default:
			System.out.println("Invalid");
		break; 
		
		}
		switch(newStep) {
		case 1: {newSal = "$29,421";}
		break;
		case 2: {newSal = "$32,423";}
		break;
		case 3: {newSal = "$36,538";}
		break;
		case 4: {newSal = "$41,017";}
		break;
		case 5: {newSal = "$45,895";}
		break;
		case 6: {newSal = "$51,153";}
		break;
		case 7: {newSal = "$56,848";}
		break;
		case 8: {newSal = "$62,961";}
		break;
		case 9: {newSal = "$69,539";}
		break;
		case 10: {newSal = "$76,579";}
		break;
		case 11: {newSal = "$84,135";}
		break;
		case 12: {newSal = "$100,842";}
		break;
		case 13: {newSal = "$119,913";}
		break;
		case 14: {newSal = "$141,702";}
		break;
		case 15: {newSal = "$164,200";}
		break;
		default:
			System.out.println("Invalid");
		break; 
		
		}
		switch(newStep) {
		case 1: {newSal = "$30,246";}
		break;
		case 2: {newSal = "$33,325";}
		break;
		case 3: {newSal = "$37,553";}
		break;
		case 4: {newSal = "$42,156";}
		break;
		case 5: {newSal = "$47,017";}
		break;
		case 6: {newSal = "$52,573";}
		break;
		case 7: {newSal = "$58,427";}
		break;
		case 8: {newSal = "$64,711";}
		break;
		case 9: {newSal = "$71,470";}
		break;
		case 10: {newSal = "$78,706";}
		break;
		case 11: {newSal = "$86,472";}
		break;
		case 12: {newSal = "$103,643";}
		break;
		case 13: {newSal = "$123,244";}
		break;
		case 14: {newSal = "$145,638";}
		break;
		case 15: {newSal = "$164,200";}
		break;
		default:
			System.out.println("Invalid");
		break;
		
		}
		switch(newStep) {
		case 1: {newSal = "30,278";}
		break;
		case 2: {newSal = "$34,226";}
		break;
		case 3: {newSal = "38,567";}
		break;
		case 4: {newSal = "$43,295";}
		break;
		case 5: {newSal = "$48,445";}
		break;
		case 6: {newSal = "$53,994";}
		break;
		case 7: {newSal = "$60,006";}
		break;
		case 8: {newSal = "$66,460";}
		break;
		case 9: {newSal = "$73,402";}
		break;
		case 10: {newSal = "$80,833";}
		break;
		case 11: {newSal = "$88,810";}
		break;
		case 12: {newSal = "$106,444";}
		break;
		case 13: {newSal = "$126,575";}
		break;
		case 14: {newSal = "$149,574";}
		break;
		case 15: {newSal = "$164,200";}
		break;
		default:
			System.out.println("Invalid");
		break;
		
		}
		switch(newStep) {
		case 1: {newSal = "$32,053";}
		break;
		case 2: {newSal = "$35,127";}
		break;
		case 3: {newSal = "$39,582";}
		break;
		case 4: {newSal = "$44,434";}
		break;
		case 5: {newSal = "$49,721";}
		break;
		case 6: {newSal = "$55,414";}
		break;
		case 7: {newSal = "$61,584";}
		break;
		case 8: {newSal = "$68,209";}
		break;
		case 9: {newSal = "$75,334";}
		break;
		case 10: {newSal = "$82,860";}
		break;
		case 11: {newSal = "$91,147";}
		break;
		case 12: {newSal = "$109,245";}
		break;
		case 13: {newSal = "$129,906";}
		break;
		case 14: {newSal = "$153,510";}
		break;
		case 15: {newSal = "$164,200";}
		break;
		default:
			System.out.println("Invalid");
		break;	
		
											
											
		
	}


		}
		
	
	
}

