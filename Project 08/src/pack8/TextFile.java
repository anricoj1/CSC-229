package pack8;

import javax.swing.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter; 
import java.io.IOException;
import java.util.Scanner;

public class TextFile extends OneDStructure
{
	String dataFilePath;
	String dataFileName;
	JFileChooser chooser;

	
	public TextFile()
	{
		dataFilePath = null;
		dataFileName = null;
		
	}
	public TextFile(String fileName, int fileSize)
	{
		dataFileName = fileName;
		size = fileSize;
		array = new int[size];
	}
	
	public void create()
	{
		dataFilePath = null;
		dataFileName = null;
	
	
		chooser = new JFileChooser();
		chooser.setDialogType(JFileChooser.OPEN_DIALOG );
		chooser.setDialogTitle("Open Data File");
	
		int returnVal = chooser.showOpenDialog(null);
		if( returnVal == JFileChooser.APPROVE_OPTION) 
		{
			dataFilePath = chooser.getSelectedFile().getPath();
			dataFileName = chooser.getSelectedFile().getName();
		}
		try
		{
			readFileIntoArray();
		}
		catch (IOException ioe)
		{
			System.exit(0); 
		}
	
	}
	public void readFileIntoArray() throws IOException
	{
		if (dataFilePath != null)
		{
			Scanner integerTextFile = new Scanner(new File(dataFilePath));
			
			size = integerTextFile.nextInt();
			array = new int[size];
			int index = 0;
			
			while (integerTextFile.hasNextInt())
			{
				// read the next integer
				array[index] = integerTextFile.nextInt();
				System.out.println("Index = "+index+" --- " +array[index]);
				index++;
			}
			//  end of file detected
			integerTextFile.close();
		}
		else
			size = 0;
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
		for(int i = 1;i < array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
	public int getMinimum()
	{
		int min = array[0];
		for(int i = 1; i < array.length;i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}
	public double getAverage()
	{
		double total = 0.0;
		for(int i = 0; i < array.length; i++) {
			total = total + array[i];
			
		}
		
		double average = total / array.length;
		
		
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
		
		
		
		return std;
	}
	public void search()  // binary search method....if key == success, successCount + 1
	{
		successCount = 0;
		failureCount = 0;  // if key != success, failureCount + 1
		searchKeys = new int[size/5];
		int mid = low + (high - low) / 2;
		int low = this.getMinimum();
		int high = this.getMaximum();
		for (int i=0; i<searchKeys.length; i++)
			searchKeys[i] = low + (int)((high-low+1)*Math.random());
		
		
		// search for the keys 
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
