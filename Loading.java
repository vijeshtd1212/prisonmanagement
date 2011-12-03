/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prison2;

/**
 *
 * @author vijeshtd
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.plaf.FontUIResource;



class Loading extends Frame
{
	JWindow load=new JWindow();
	
	//String load_modules[]={"Loading DataBase","Loading Nominal_roll","Loading Project Data","Loading Case_register","Loading Mailer",
							//"Loading UI","Loading Configurations","Loading Parole_register","Loading User Options","Loading Images","Loading MiniProject"};
	
	JPanel img_panel = new JPanel(); 
	ImageIcon img = new ImageIcon("prison2.image/2.jpg"); 
	JLabel img_label = new JLabel(); 
	
	JPanel loading_panel=new JPanel();
	JProgressBar bar=new JProgressBar(0,100);
	JLabel progress_r = new JLabel(""); 
	JLabel progress_l = new JLabel("PRISON MANAGEMENT SYSTEM"); 
        JLabel p=new JLabel("PRISON MANAGEMENT SYSTEM");
        	
	Container c=load.getContentPane();
	

	
	Loading()
	{		
		
		//((Frame) load).setUndecorated(true);
		img_label.setIcon(img);
                //img_label.setSize(300, 300);
		img_panel.setSize(621, 451);
		img_panel.add(img_label);
		
		loading_panel.add(progress_l);
               
		loading_panel.add(bar);
		loading_panel.add(progress_r);
		 loading_panel.add(p);
		
		c.setLayout(new BorderLayout());
		c.add(img_panel,BorderLayout.CENTER);
		c.add(loading_panel,BorderLayout.SOUTH);
		
		load.setSize(600, 500);
		load.setLocation(450, 150);
		img_panel.setBackground(Color.BLUE);
		loading_panel.setBackground(Color.BLUE);
                Font f=new Font("BOLD",18, 12);
		progress_l.setForeground(Color.green);
                progress_l.setFont(f);
		progress_r.setForeground(Color.green);
                p.setForeground(Color.green);
                p.setFont(f);
                progress_r.setFont(f);
		bar.setForeground(Color.BLACK);
		load.show();
		
		int j;
		for(int i=0;i<=100;i++)
		{	
			j=i/10;
			//progress_r.setText(load_modules[j]+" ");
			//progress_l.setText(" "+i+" % ");
			bar.setValue(i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		load.setVisible(false);
                Login k=new Login();
	//	new cityplus();
		
	}
	
	public static void main(String s[])
	{	new Loading();
	
	}
}