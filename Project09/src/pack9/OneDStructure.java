package pack9;

public abstract class OneDStructure 
{
	protected String dataFilePath;
	protected String dataFileName;
	protected int[] array;
	protected byte[] array2;
	protected int[] searchKeys;
	protected int size;
	protected int low;
	protected int high;
	protected int successCount;
	protected int failureCount;
// ******************************************************* Abstract Methods **************************************	
	public abstract void loadFile();
	public abstract void storeFile();
// ***************************************************************************************************************	
	
	public int getMaximum()
	{
		int max = array[0];
		
		return max;
	}
	public int getMinimum()
	{
		int min = array[0];
		
		return min;
	}
	public double getAverage()
	{
		double average = 0;
		
		return average/size;
	}
	public double getStandardDeviation()
	{
		double std = 0.0;
		
		return std;
	}
	public void search()
	{
		successCount = 0;
		failureCount = 0;
		searchKeys = new int[size/5];
		
	}
	
	public void sort()
	{
		java.util.Arrays.sort(array);
	}
	public  int getSuccessCount()
	{
		return successCount;
	}
	public int getFailureCount()
	
	{
		return failureCount;
	}
	public int[] getArray()
	{
		return array;
	}
	public byte[] getArray2()
	{
		return array2;
	}
	public int[] getSearchKeys()
	{
		return searchKeys;
	}

}
