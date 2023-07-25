package bnr;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddC extends JFrame implements ActionListener{
	
 	JLabel l1,l2,l3,l4;
 	JTextField t1,t2,t3,t4;
 	JButton b1,b2;
 	public AddC(){
 	 setTitle("Customer Info");
 	 setSize(240,200);
 	 setLayout(new FlowLayout());
 	 Image icon = Toolkit.getDefaultToolkit().getImage("Vanamo_Logo.png");    
	 this.setIconImage(icon);
 	
 		 l1=new JLabel("Customer Id");
 		 l2=new JLabel("Customer Name");
 		 l3=new JLabel("Contact N0");
 		 l4=new JLabel("Address");
 		 
 		 t1=new JTextField(10);
 		 t2=new JTextField(10);
 		 t3=new JTextField(10);
 		 t4=new JTextField(10);
 		 
 		 b1=new JButton("Add Customer");
 		 b2=new JButton("Close");
 		 
 		 
 		 add(l1);
 		 add(t1);
 		 add(l2);
 		 add(t2);
 		 add(l3);
 		 add(t3);
 		 add(l4);
 		 add(t4);
 		 add(b1);
 		 add(b2);
 		 
 		 b1.addActionListener(this);
 		 b2.addActionListener(this);
 		 
 	 }
 	public void actionPerformed(ActionEvent ae) {
 		BannerData bn1 = new BannerData();
		try 
		{
			bn1.setCid(Integer.parseInt(t1.getText()));	
		}
		catch (NumberFormatException e) 
		{
			t1.setText("Invalid Input");
		}
		bn1.setCname(t2.getText());
		try 
		{
			bn1.setCno(Integer.parseInt(t3.getText()));	
		}
		catch (NumberFormatException e) 
		{
			t3.setText("Invalid Input");
		}
		bn1.setAd(t4.getText());
		
		DbService db  = new DbService();
		int x=0;
		if(ae.getSource()==b1)
		{
			x = db.addCustomer(bn1);
			if(x>=1)
			{
				t2.setText("Record Inserted");
			}
			else
			{
				t2.setText("Record Not Inserted");
			}
		}
 		if (ae.getSource() == b2) {
			setVisible(false);
			dispose();
		}
 	}
 
	public static void main(String[] args) {
		AddC a1=new AddC();
		a1.setVisible(true);

	}

}
