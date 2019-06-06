package pack9;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileSystems;

public class BinaryFile extends OneDStructure 
{
	JFileChooser chooser;

	public BinaryFile()
	{
		dataFilePath = null;
		dataFileName = null;
		
	}
	public BinaryFile(String fileName, int fileSize)
	{
		dataFileName = fileName;
		size = fileSize;
		array2 = new byte[size];
	}
	
	public void loadFile()
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
		
		FileInputStream fstream = new FileInputStream(this.dataFilePath);
		DataInputStream inputFile = new DataInputStream(fstream);
		
		size = inputFile.readInt();
		array = new int[size];
			
		for( int i = 0; i < size; i++)
		{
			array[i] = inputFile.readInt();
		}
		inputFile.close();
	}
		

	public void  storeFile() 
	{
		try
		{
			
			createOutputFile();
		}
		catch (IOException e)
		{
			System.exit(2);
		}
		
	}
	public void createOutputFile() throws IOException
	{
		    String outFileName = this.dataFilePath+"-Sorted.data";
			DataOutputStream  out = new DataOutputStream (new BufferedOutputStream(
		              new FileOutputStream(outFileName)));
 
		    out.close();
		   
	}	
	public BinaryFile mergeFiles(BinaryFile second)
	{
		
		BinaryFile t = new BinaryFile();
		
		
		return t;
	}
	public int getSize()
	{
		return size;
	}
	public byte[] getArray2()
	{
		return array2;
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
	public void search()  
	{
		successCount = 0;
		failureCount = 0;  
		searchKeys = new int[size/5];
		int mid = low + (high - low) / 2;
		int low = this.getMinimum();
		int high = this.getMaximum();
		for (int i=0; i<searchKeys.length; i++)
			searchKeys[i] = low + (int)((high-low+1)*Math.random());
		
		int oneD_Array[] = array.clone();
		Arrays.sort(oneD_Array);
		
		for (int x = 0; x < searchKeys.length;x++) {
			int index = Arrays.binarySearch(oneD_Array, searchKeys[x]);
			if(index > 0) {
				successCount+=1;
				
			}else {
				failureCount+=1;
			}
		}
		
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
