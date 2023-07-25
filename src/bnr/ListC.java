package bnr;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ListC extends JDialog implements ActionListener
{
	
	JTable jt;
	DefaultTableModel model;
	JButton b2;
	public ListC(ArrayList al) {
	
		super(new Frame(),"Customer List");
		setSize(400,250);
		setLayout(new BorderLayout());
		Image icon = Toolkit.getDefaultToolkit().getImage("Vanamo_Logo.png");    
		 this.setIconImage(icon);
		
		
		Vector v = new Vector();
        v.addElement("Customer id");
        v.addElement("Customer Name");
        v.addElement("Contact No");
        v.addElement("Address");
        
		 model = new DefaultTableModel(new Vector(),v);
		
		 jt = new JTable(model);
		 b2=new JButton("Close");
	 
          for (int i = 0; i <al.size(); i++) {
          BannerData b = (BannerData)al.get(i);
          Vector v1 = new Vector();
          v1.addElement(b.getCid());
          v1.addElement(b.getCname());
          v1.addElement(b.getCno());
          v1.addElement(b.getAd());
          model.addRow(v1);     
		}
	 JPanel aPanel1=new JPanel();
     aPanel1.setBorder(BorderFactory.createTitledBorder("BMS"));
     JScrollPane aScrollPane=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     aPanel1.add(aScrollPane);
     aPanel1.add(b2);
    
    jt.setPreferredScrollableViewportSize(new Dimension(350,120));
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
			 ArrayList al = db.CustomerList();
		    	ListC l1=new ListC(al);
				l1.setVisible(true);

		}
}