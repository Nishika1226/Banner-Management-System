package bnr;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ListB extends JDialog implements ActionListener
{
	
	JTable jt;
	DefaultTableModel model;
	JButton b2;
	public ListB(ArrayList al) {
	
		super(new Frame(),"Banner List");
		setSize(300,250);
		setLayout(new BorderLayout());
		Image icon = Toolkit.getDefaultToolkit().getImage("Vanamo_Logo.png");    
		 this.setIconImage(icon);
		
		
		Vector v = new Vector();
        v.addElement("banner id");
        v.addElement("location");
        v.addElement("width");
        v.addElement("height");
        
		 model = new DefaultTableModel(new Vector(),v);
		
		 jt = new JTable(model);
		 b2=new JButton("Close");
	 
          for (int i = 0; i <al.size(); i++) {
          BannerData b = (BannerData)al.get(i);
          Vector v1 = new Vector();
          v1.addElement(b.getBid());
          v1.addElement(b.getLcn());
          v1.addElement(b.getWid());
          v1.addElement(b.getLen());
          model.addRow(v1);     
		}
	 JPanel aPanel1=new JPanel();
     aPanel1.setBorder(BorderFactory.createTitledBorder("BMS"));
     JScrollPane aScrollPane=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     aPanel1.add(aScrollPane);
     aPanel1.add(b2);
    
    jt.setPreferredScrollableViewportSize(new Dimension(250,120));
    add(aPanel1,BorderLayout.CENTER);
   
    b2.addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent ae) 
	{
		
		if (ae.getSource() == b2) {
			setVisible(false);
			dispose();

		}
						
	}
	 public static void main(String[] args) {


			DbService db  = new DbService();
			 ArrayList al = db.BannerList();
		    	ListB a1=new ListB(al);
				a1.setVisible(true);

		}
}