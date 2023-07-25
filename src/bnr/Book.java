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

public class Book extends JFrame implements ActionListener{

	
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	public Book(){
	 setTitle("Booking");
	 setSize(220,200);
	 setLayout(new FlowLayout());
	 Image icon = Toolkit.getDefaultToolkit().getImage("Vanamo_Logo.png");    
	 this.setIconImage(icon);
	
		 l1=new JLabel("Banner Id");
		 l2=new JLabel("Customer Id");
		 l3=new JLabel("Time");
		 l4=new JLabel("Rent");
		 
		 t1=new JTextField(10);
		 t2=new JTextField(10);
		 t3=new JTextField(12);
		 t4=new JTextField(12);
		 
		 b1=new JButton("Add");
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
			bn1.setBid(Integer.parseInt(t1.getText()));	
		}
		catch (NumberFormatException e) 
		{
			t1.setText("Invalid Input");
		}
		try 
		{
			bn1.setCid(Integer.parseInt(t2.getText()));	
		}
		catch (NumberFormatException e) 
		{
			t2.setText("Invalid Input");
		}
		bn1.setTime(t3.getText());
		try 
		{
			bn1.setRent(Integer.parseInt(t4.getText()));	
		}
		catch (NumberFormatException e) 
		{
			t4.setText("Invalid Input");
		}
		
		DbService db  = new DbService();
		int x=0;
		if(ae.getSource()==b1)
		{
			x = db.addRent(bn1);
			if(x>=1)
			{
				t3.setText("Record Inserted");
			}
			else
			{
				t3.setText("Record Not Inserted");
			}
		}
		if (ae.getSource() == b2) {
			setVisible(false);
			dispose();

		}
	}
	public static void main(String args[]) {
		Book a1=new Book();
		a1.setVisible(true);
	}

}