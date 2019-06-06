package pack9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Project09 extends Frame implements ActionListener 
{
	String command = "";
	BinaryFile bFile;
	BinaryFile bFile2;
	String bFile3;

	TextFile  textFile;
	TextFile  textFile2;
	String textFile3;
	
	double product;
	int[] searchKeys;
	
	public static void main(String[] args)
	{
		Frame frame = new Project09();
		
			
		frame.setResizable(true);
		frame.setSize(1000,800);
		frame.setVisible(true);		
	}
	
	public Project09()
	{
		setTitle("Data Structures");
		
		// Create Menu
		   			
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		
		Menu fileMenu = new Menu("File");
		mb.add(fileMenu);
		
		MenuItem miAbout = new MenuItem("About");
		miAbout.addActionListener(this);
		fileMenu.add(miAbout);
		
		MenuItem miExit = new MenuItem("Exit");
		miExit.addActionListener(this);
		fileMenu.add(miExit);
		
		Menu actionMenu = new Menu("File Structures");
		mb.add(actionMenu);
		
		Menu bFileArrayMenu = new Menu("Binary Files");
		actionMenu.add(bFileArrayMenu);
		
		MenuItem miLoadbFile = new MenuItem("Load Binary File");
		miLoadbFile.addActionListener(this);
		bFileArrayMenu.add(miLoadbFile);
		
		MenuItem miMinimumbFile = new MenuItem("Minimum Binary File");
		miMinimumbFile.addActionListener(this);
		bFileArrayMenu.add(miMinimumbFile);
		
		MenuItem miMaximumbFile = new MenuItem("Maximum Binary File");
		miMaximumbFile.addActionListener(this);
		bFileArrayMenu.add(miMaximumbFile);
		
		MenuItem miAveragebFile = new MenuItem("Average Binary File");
		miAveragebFile.addActionListener(this);
		bFileArrayMenu.add(miAveragebFile);
		
		MenuItem miStdbFile = new MenuItem("Standard Deviation Binary File");
		miStdbFile.addActionListener(this);
		bFileArrayMenu.add(miStdbFile);
		
		MenuItem miAllbFile = new MenuItem("All Statistics Binary File");
		miAllbFile.addActionListener(this);
		bFileArrayMenu.add(miAllbFile);
		
		MenuItem miSort = new MenuItem("Sort Binary File");
		miSort.addActionListener(this);
		bFileArrayMenu.add(miSort);
		
		MenuItem miSearchbFile = new MenuItem("Search Binary File");
		miSearchbFile.addActionListener(this);
		bFileArrayMenu.add(miSearchbFile);
		
		MenuItem miMergebFile = new MenuItem("Merge Binary File");
		miMergebFile.addActionListener(this);
		bFileArrayMenu.add(miMergebFile);
		
		
		// Text File menus
		Menu TextFileMenu = new Menu("Text File");
		actionMenu.add(TextFileMenu);
		
		MenuItem miLoadFile = new MenuItem("Load Text File");
		miLoadFile.addActionListener(this);
		TextFileMenu.add(miLoadFile);
		
		MenuItem miMinimumFile = new MenuItem("Minimum Text File");
		miMinimumFile.addActionListener(this);
		TextFileMenu.add(miMinimumFile);
		
		MenuItem miMaximumFile = new MenuItem("Maximum Text File");
		miMaximumFile.addActionListener(this);
		TextFileMenu.add(miMaximumFile);
		
		MenuItem miAverageFile = new MenuItem("Average Text File");
		miAverageFile.addActionListener(this);
		TextFileMenu.add(miAverageFile);
		
		MenuItem miStdFile = new MenuItem("Standard Deviation Text File");
		miStdFile.addActionListener(this);
		TextFileMenu.add(miStdFile);
		
		MenuItem miAllFile = new MenuItem("All Statistics Text File");
		miAllFile.addActionListener(this);
		TextFileMenu.add(miAllFile);
		
		MenuItem miSortFile = new MenuItem("Sort Text File");
		miSortFile.addActionListener(this);
		TextFileMenu.add(miSortFile);
		
		MenuItem miSearchFile = new MenuItem("Search Text File");
		miSearchFile.addActionListener(this);
		TextFileMenu.add(miSearchFile);
		
		MenuItem miMergeFile = new MenuItem("Merge Text File");
		miMergeFile.addActionListener(this);
		TextFileMenu.add(miMergeFile);
		
		
		
		// End program when window is closed
		
		WindowListener l = new WindowAdapter()
		{
						
			public void windowClosing(WindowEvent ev)
			{
				System.exit(0);
			}
			
			public void windowActivated(WindowEvent ev)
			{
				repaint();
			}
			
			public void windowStateChanged(WindowEvent ev)
			{
				repaint();
			}
		
		};
		
		ComponentListener k = new ComponentAdapter()
		{
			public void componentResized(ComponentEvent e) 
			{
        		repaint();           
    		}
		};
		
		// register listeners
			
		this.addWindowListener(l);
		this.addComponentListener(k);

	}
	
//******************************************************************************
//  called by windows manager whenever the application window performs an action
//  (select a menu item, close, resize, ....
//******************************************************************************

	public void actionPerformed (ActionEvent ev)
		{
			// figure out which command was issued
			
			command = ev.getActionCommand();
			
			// take action accordingly
			if("About".equals(command))
			{
				repaint();
			}
			else
			if("Exit".equals(command))
			{
				System.exit(0);
			}
			else
			if("Load Binary File".equals(command))
			{
				bFile = new BinaryFile();
				bFile.loadFile();
				repaint();
			}
			else
			if("Load Text File".equals(command))
			{
				textFile = new TextFile();
				textFile.loadFile();
				repaint();	
			}
			else
			if("Minimum Binary File".equals(command)  || 
			   "Maximum Binary File".equals(command) ||
			   "Average Binary File".equals(command)  ||
			   "Standard Deviation Binary File".equals(command) ||
			   "All Statistics Binary File".equals(command) ||
			   "Minimum Text File".equals(command)  || 
			   "Maximum Text File".equals(command) ||
			   "Average Text File".equals(command)  ||
			   "Standard Deviation Text File".equals(command) ||
			   "All Statistics Text File".equals(command) )
				{
					
					repaint();
				}
			else
			if("Sort Binary File".equals(command))
			{
				bFile.sort();
				bFile.storeFile();
				repaint();
			}
			else
			if("Sort Text File".equals(command))
			{
				textFile.sort();
				textFile.storeFile();
				repaint();
				
			}
			else
			if("Search Binary File".equals(command))
			{
				bFile.search();
				searchKeys = bFile.getSearchKeys();
						
				repaint();
			}
			else
			if("Merge Binary File".equals(command))
			{
				bFile2 = new BinaryFile();
				bFile2.loadFile();
				
			}
			else
			if("Search Text File".equals(command))
			{
				textFile.search();
				searchKeys = textFile.getSearchKeys();
				
				repaint();
			}
			else
			if("Merge Text File".equals(command))
			{
				textFile2 = new TextFile();
				textFile2.loadFile();
				
			
					
				repaint();
			}
			
		}
//********************************************************
// called by repaint() to redraw the screen
//********************************************************
		
		public void paint(Graphics g)
		{
			
			// Check Command issued, take action accordingly
			int ww = this.getWidth();
			int wh = this.getHeight();
			Font f1 = new Font("SansSerif",Font.BOLD,16);
			Font f = new Font("SansSerif",Font.BOLD,12);
			g.setFont(f);
			if("Load Binary File".equals(command))
			{
				int x=100;
				int y = 100;
				g.setColor(Color.RED);
				g.setFont(f1);
				g.drawString("Original Array", ww/2-40, 80);
				g.setColor(Color.black);
				g.setFont(f);
				
				
				int[]  temp = bFile.getArray();
				for(int i = 0; i<temp.length;i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
			}
			
			else
			if("Maximum Binary File".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = bFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Maximum = "+Integer.toString(bFile.getMaximum()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);	
			}
			
			else
			if("Minimum Binary File".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = bFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Minimum = "+Integer.toString(bFile.getMinimum()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
			}
			
			else
			if("Average Binary File".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = bFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Average = "+Double.toString(bFile.getAverage()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
			}
			
			else
			if("Standard Deviation Binary File".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = bFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Standard Deviation = "+Double.toString(bFile.getStandardDeviation()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
			}
			
			else
			if("All Statistics Binary File".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = bFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				y= y + 50;
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Minimum = ", ww/2-140, y+20);
				g.drawString(Integer.toString(bFile.getMinimum()), ww/2+50, y+20);
				g.drawString("Maximum = ", ww/2-140, y+40);
				g.drawString(Double.toString(bFile.getMaximum()), ww/2+50, y+40);
				g.drawString("Average = ", ww/2-140, y+60);
				g.drawString(Double.toString(bFile.getAverage()), ww/2+50, y+60);
				g.drawString("Standard Deviation = ", ww/2-140, y+80);
				g.drawString(Double.toString(  Math.round(bFile.getStandardDeviation() ) ), ww/2+50, y+80);
				g.setFont(f);
				g.setColor(Color.BLACK);	
			}
			
			else
			if("Sort Binary File".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Sorted Array",ww/2-50, 75);
				g.setFont(f);
				g.setColor(Color.black);
				
				int[] temp = bFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
			}
			
			else
			if("Search Binary File".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Original Array",ww/2-50, 75);
				g.setFont(f);
				g.setColor(Color.black);
				
				int[] temp = bFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Search Keys", ww/2-50, y+30);
				g.setFont(f);
				g.setColor(Color.black);
				
				int[] keys = bFile.getSearchKeys();
				for(int i=0; i<keys.length; i++)
				{
					g.drawString(Integer.toString(keys[i]), x, y+50);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Number of Keys Found =  "+bFile.getSuccessCount(), ww/2-50, y+70);
				g.setFont(f1);				
				g.drawString("Number of Keys Not Found = "+bFile.getFailureCount(), ww/2-50, y+90);
				g.setFont(f1);
				g.setColor(Color.black);
			}
			else
			if("Merge Binary File".equals(command))
			{
				int x=100;
				int y = 100;
						
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("First File",ww/2-50, 75);
				g.setFont(f);
				g.setColor(Color.black);
					
				int[] temp = bFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
					g.setFont(f1);
					g.setColor(Color.red);
					g.drawString("Second File",ww/2-50, y+30);
					g.setFont(f);
					g.setColor(Color.black);
					
					int[] temp2 = bFile2.getArray();
					for (int i=0; i<temp2.length;i++)
					{
						g.drawString(Integer.toString(temp2[i]), x, y+50);
						x = x + 35;
						if (x>(ww-100))
						{
							x = 100;
							y = y + 15;
						}
					}
					g.setFont(f1);
					g.setColor(Color.red);
					g.drawString("Merged Binary File", ww/2-50, y+70);
					g.setFont(f);				
					g.setColor(Color.black);
					
					int[] temp3 = new int[temp.length+temp2.length];
					System.arraycopy(temp, 0, temp3, 0, temp.length);
					System.arraycopy(temp2, 0, temp3, temp.length, temp2.length);
					
					try 
					{
						FileWriter fstream = new FileWriter((bFile.dataFilePath + "-Merged.data"), false);
						BufferedWriter out = new BufferedWriter(fstream);
						bFile3 = Arrays.toString(temp3);
						
						out.write(bFile3);
						out.close();
						
					}
					catch (Exception e) {
						System.out.println("error" + e);
					}
					
					for (int i = 0; i<temp3.length;i++)
					{
						g.drawString(Integer.toString(temp3[i]), x, y+90);
						x = x + 35;
						if (x>(ww-100))
						{
							x = 100;
							y = y + 15;
						}

						
					}
			}

			
			else
			if("Load Text File".equals(command))
			{
				int x=100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Oriagnal Text File",ww/2-40, 80);
				g.setFont(f);
				g.setColor(Color.black);
				
				int[] temp = textFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				
			}
			
			else
			if("Maximum Text File".equals(command))
			{
				int x = 100;
				int y = 100;
					
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
					
				int[] temp = textFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
					
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Maximum = "+Integer.toString(textFile.getMaximum()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);	
				
			}
			
			else
			if("Minimum Text File".equals(command))
			{
				int x = 100;
				int y = 100;
					
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
					
				int[] temp = textFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
					
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Maximum = "+Integer.toString(textFile.getMinimum()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
			}
			
			else
			if("Average Text File".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = textFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Average = "+Double.toString(textFile.getAverage()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
			}
			
			else
			if("Standard Deviation Text File".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = textFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Standard Deviation = "+Double.toString(textFile.getStandardDeviation()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
			}
				
			else
			if("All Statistics Text File".equals(command))
			{
				int x = 100;
				int y = 100;
					
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
					
				int[] temp = textFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				y= y + 50;
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Minimum = ", ww/2-140, y+20);
				g.drawString(Integer.toString(textFile.getMinimum()), ww/2+50, y+20);
				g.drawString("Maximum = ", ww/2-140, y+40);
				g.drawString(Double.toString(textFile.getMaximum()), ww/2+50, y+40);
				g.drawString("Average = ", ww/2-140, y+60);
				g.drawString(Double.toString(textFile.getAverage()), ww/2+50, y+60);
				g.drawString("Standard Deviation = ", ww/2-140, y+80);
				g.drawString(Double.toString(  Math.round(textFile.getStandardDeviation() ) ), ww/2+50, y+80);
				g.setFont(f);
				g.setColor(Color.BLACK);	
			}
				
			else
			if("Sort Text File".equals(command))
			{
				int x=100;
				int y = 100;
					
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Sorted Array",ww/2-50, 75);
				g.setFont(f);
				g.setColor(Color.black);
					
				int[] temp = textFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				
			}
			
			else
			if("Search Text File".equals(command))
			{
				int x=100;
				int y = 100;
					
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Original Array",ww/2-50, 75);
				g.setFont(f);
				g.setColor(Color.black);
				
				int[] temp = textFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Search Keys",ww/2-50, y+30);
				g.setFont(f);
				g.setColor(Color.black);
				
				int[] keys = textFile.getSearchKeys();
				for (int i=0; i<keys.length;i++)
				{
					g.drawString(Integer.toString(keys[i]), x, y+50);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Number of Keys Found =  "+textFile.getSuccessCount(), ww/2-50, y+70);
				g.setFont(f1);				
				g.drawString("Number of Keys Not Found = "+textFile.getFailureCount(), ww/2-50, y+90);
				g.setFont(f1);
				g.setColor(Color.black);
				
			}
			else
			if("Merge Text File".equals(command))
			{
				int x=100;
				int y = 100;
						
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("First File",ww/2-50, 75);
				g.setFont(f);
				g.setColor(Color.black);
					
				int[] temp = textFile.getArray();
				for (int i=0; i<temp.length; i++)
				{
					g.drawString(Integer.toString(temp[i]), x, y);
					x = x + 35;
					if (x>(ww-100))
					{
						x = 100;
						y = y + 15;
					}
				}
					g.setFont(f1);
					g.setColor(Color.red);
					g.drawString("Second File",ww/2-50, y+30);
					g.setFont(f);
					g.setColor(Color.black);
					
					int[] temp2 = textFile2.getArray();
					for (int i=0; i<temp2.length;i++)
					{
						g.drawString(Integer.toString(temp2[i]), x, y+50);
						x = x + 35;
						if (x>(ww-100))
						{
							x = 100;
							y = y + 15;
						}
					}
					g.setFont(f1);
					g.setColor(Color.red);
					g.drawString("Merged Text File", ww/2-50, y+70);
					g.setFont(f);				
					g.setColor(Color.black);
					
					
					
					int[] temp3 = new int[temp.length + temp2.length];
					System.arraycopy(temp, 0, temp3, 0, temp.length);
					System.arraycopy(temp2, 0, temp3, temp.length, temp2.length);
					
					try 
					{
						FileWriter fstream = new FileWriter((textFile.dataFilePath + "-Merged.txt"), false);
						BufferedWriter out = new BufferedWriter(fstream);
						textFile3 = Arrays.toString(temp3);
						//System.out.println(textFile3);
						out.write(textFile3);
						out.close();
						//System.out.println("wrote text file to same location");
					}
					catch (Exception e) {
						System.out.println("error" + e);
					}
					
					
					for (int i=0; i<temp3.length;i++)
					{
						g.drawString(Integer.toString(temp3[i]), x, y+90);
						x = x + 35;
						if (x>(ww-100))
						{
							x = 100;
							y = y + 15;
						}
						
					}
					g.setFont(f1);
					g.setColor(Color.red);
					g.drawString("Merged Text File Sent To Same File Location", ww/2-60, y+110);
					
					
				}
			
			
			
			
		}

}
