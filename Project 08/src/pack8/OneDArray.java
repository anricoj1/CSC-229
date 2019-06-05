package pack8;

import javax.swing.JOptionPane;

public class OneDArray extends OneDStructure
{
	public OneDArray(int s, int l, int h)
	{
		array = new int[s];
		for (int i=0; i<s; i++)
	    array[i] = l + (int)((h-l+1)*Math.random());
		low = l;
		high = h;
	}
	public OneDArray()
	{
		size = 100;
		low = 1;
		high = 100;
		array = new int[size];
		for (int i=0; i<size; i++)
	    	array[i] = low + (int)((high-low+1)*Math.random());
	}
	public void create()
	{
		String input = JOptionPane.showInputDialog(null,"Please enter an integer < 1000:",
				"Size of One-Dimensional Array",JOptionPane.QUESTION_MESSAGE);
	    size=Integer.parseInt(input);
	    array = new int[size];
	    input = JOptionPane.showInputDialog(null,"Please enter an integer > 0:",
				"Lowest Value in the Array",JOptionPane.QUESTION_MESSAGE);
	    low = Integer.parseInt(input);
	    input = JOptionPane.showInputDialog(null,"Please enter an integer < 1000:",
				"Highest Value in the Array",JOptionPane.QUESTION_MESSAGE);
	    high = Integer.parseInt(input);
	    for (int i=0; i<size; i++)
	    	array[i] = low + (int)((high-low+1)*Math.random());
	}
	public int getSize()
	{
		return size;
	}
	public int[] getArray()
	{
		return array;
	}
	public int getMaximum()
	{
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
	
		return max;
	}
	public int getMinimum()
	{
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}
	public double getAverage()
	{
		double total = 0;
		
		for(int i = 0; i < array.length; i++) {
			total = total + array[i];
			
			
		}
		
		double average = total / array.length;
		
		
		
		// find average
		return average;
	}
	public double getStandardDeviation()
	{
		double sd = 0;
		double average = getAverage();
		for(int i = 0; i < array.length;i++)
		{
			sd += ((array[i] - average)*(array[i] - average)) / (array.length - 1);
		}
		
		double std = Math.sqrt(sd);
		
		// calculate standard deviation
		
		return std;
	}
	public void search()
	{
		successCount = 0;
		failureCount = 0;
		searchKeys = new int[size/5];
		for (int i=0; i<searchKeys.length; i++)
			searchKeys[i] = low + (int)((high-low+1)*Math.random());
		// search for keys
		}
	
	public  int getSuccessCount()
	{
		return successCount;
	}
	public int getFailureCount()
	{
		return failureCount;
	}
	public void sort()
	{
		java.util.Arrays.sort(array);
	}
	public int[] getSearchKeys()
	{
		return searchKeys;
	}

}
