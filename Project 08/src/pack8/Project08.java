package pack8;

// add in window resizing and searching for specific keys

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;  // use for searching keys 

public class Project08 extends Frame implements ActionListener
{
	String command = "";
	OneDArray oneD;

	TextFile  textFile;
	double product;
	int[] searchKeys;
	
	public static void main(String[] args)
	{
		Frame frame = new Project08();
		
			
		frame.setResizable(true);
		frame.setSize(1000,800);
		frame.setVisible(true);		
	}
	
	public Project08()
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
		
		Menu actionMenu = new Menu("One Dimensional Structures");
		mb.add(actionMenu);
		
		Menu oneDArrayMenu = new Menu("1D Array");
		actionMenu.add(oneDArrayMenu);
		
		MenuItem miCreate1D = new MenuItem("Create 1D Array");
		miCreate1D.addActionListener(this);
		oneDArrayMenu.add(miCreate1D);
		
		MenuItem miMinimum1D = new MenuItem("Minimum 1D");
		miMinimum1D.addActionListener(this);
		oneDArrayMenu.add(miMinimum1D);
		
		MenuItem miMaximum1D = new MenuItem("Maximum 1D");
		miMaximum1D.addActionListener(this);
		oneDArrayMenu.add(miMaximum1D);
		
		MenuItem miAverage1D = new MenuItem("Average 1D");
		miAverage1D.addActionListener(this);
		oneDArrayMenu.add(miAverage1D);
		
		MenuItem miStd1D = new MenuItem("Standard Deviation 1D");
		miStd1D.addActionListener(this);
		oneDArrayMenu.add(miStd1D);
		
		MenuItem miAll1D = new MenuItem("All Statistics 1D");
		miAll1D.addActionListener(this);
		oneDArrayMenu.add(miAll1D);
		
		MenuItem miSort = new MenuItem("Sort 1D");
		miSort.addActionListener(this);
		oneDArrayMenu.add(miSort);
		
		MenuItem miSearch1D = new MenuItem("Search 1D");
		miSearch1D.addActionListener(this);
		oneDArrayMenu.add(miSearch1D);
		
		
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
			if("Create 1D Array".equals(command))
			{
				oneD = new OneDArray();
				oneD.create();
				repaint();
			}
			else
			if("Load Text File".equals(command))
			{
				textFile = new TextFile();
				textFile.create();
				repaint();	
			}
			else
			if("Minimum 1D".equals(command)  || 
			   "Maximum 1D".equals(command) ||
			   "Average 1D".equals(command)  ||
			   "Standard Deviation 1D".equals(command) ||
			   "All Statistics 1D".equals(command) ||
			   "Minimum Text File".equals(command)  || 
			   "Maximum Text File".equals(command) ||
			   "Average Text File".equals(command)  ||
			   "Standard Deviation Text File".equals(command) ||
			   "All Statistics Text File".equals(command) )
				{
					
					repaint();
				}
			else
			if("Sort 1D".equals(command))
			{
				oneD.sort();
				repaint();
			}
			else
			if("Sort Text File".equals(command))
			{
				textFile.sort();
				repaint();
				
			}
			else
			if("Search 1D".equals(command))
			{
				oneD.search();
				searchKeys = oneD.getSearchKeys();
						
				repaint();
			}
			else
			if("Search Text File".equals(command))
			{
				textFile.search();
				searchKeys = textFile.getSearchKeys();
				
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
			g.setFont(f);;
			if("Create 1D Array".equals(command))
			{
				int x=100;
				int y = 100;
				g.setColor(Color.RED);
				g.setFont(f1);
				g.drawString("Original Array", ww/2-40, 80);
				g.setColor(Color.black);
				g.setFont(f);
				
				int[] temp = oneD.getArray();
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
			if("Maximum 1D".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = oneD.getArray();
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
				g.drawString("Maximum = "+Integer.toString(oneD.getMaximum()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);	
			}
			
			else
			if("Minimum 1D".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = oneD.getArray();
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
				g.drawString("Minimum = "+Integer.toString(oneD.getMinimum()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
			}
			
			else
			if("Average 1D".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = oneD.getArray();
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
				g.drawString("Average = "+Double.toString(oneD.getAverage()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
			}
			
			else
			if("Standard Deviation 1D".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = oneD.getArray();
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
				g.drawString("Standard Deviation = "+Double.toString(oneD.getStandardDeviation()), ww/2-40, y+30);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
			}
			
			else
			if("All Statistics 1D".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Array Content", ww/2-30, 80);
				g.setFont(f);
				g.setColor(Color.BLACK);
				
				int[] temp = oneD.getArray();
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
				g.drawString(Integer.toString(oneD.getMinimum()), ww/2+50, y+20);
				g.drawString("Maximum = ", ww/2-140, y+40);
				g.drawString(Double.toString(oneD.getMaximum()), ww/2+50, y+40);
				g.drawString("Average = ", ww/2-140, y+60);
				g.drawString(Double.toString(oneD.getAverage()), ww/2+50, y+60);
				g.drawString("Standard Deviation = ", ww/2-140, y+80);
				g.drawString(Double.toString(  Math.round(oneD.getStandardDeviation() ) ), ww/2+50, y+80);
				g.setFont(f);
				g.setColor(Color.BLACK);	
			}
			
			else
			if("Sort 1D".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Sorted Array",ww/2-50, 75);
				g.setFont(f);
				g.setColor(Color.black);
				
				int[] temp = oneD.getArray();
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
			if("Search 1D".equals(command))
			{
				int x = 100;
				int y = 100;
				
				g.setFont(f1);
				g.setColor(Color.red);
				g.drawString("Original Array",ww/2-50, 75);
				g.setFont(f);
				g.setColor(Color.black);
				
				int[] temp = oneD.getArray();
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
				
				int[] keys = oneD.getSearchKeys();
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
				g.drawString("Number of Keys Found =  "+oneD.getSuccessCount(), ww/2-50, y+70);
				g.setFont(f1);				
				g.drawString("Number of Keys Not Found = "+oneD.getFailureCount(), ww/2-50, y+90);
				g.setFont(f1);
				g.setColor(Color.black);
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
			
			
			
			
		}
	

}
