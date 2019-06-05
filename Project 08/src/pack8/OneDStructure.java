package pack8;

public abstract class OneDStructure 
{
	protected int[] array;
	
    protected int[] searchKeys;

    protected int size;

    protected int low;

    protected int high;

    protected int successCount;

    protected int failureCount;


    public abstract void create();

    public abstract int  getSize();

    public abstract int  getMinimum();

    public abstract int  getMaximum();

    public abstract double  getAverage();

    public abstract double  getStandardDeviation();
    public abstract void sort();
    public abstract void search();
    public abstract int getSuccessCount();
    public abstract int getFailureCount();

}
