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

public class DeleteC extends JFrame implements ActionListener{

	
	JLabel l1;
	JTextField t1;
	JButton b1,b2;
	 DeleteC(){
	 setTitle("Delete Customer");
	 setSize(280,140);
	 setLayout(new FlowLayout());
	 Image icon = Toolkit.getDefaultToolkit().getImage("Vanamo_Logo.png");    
	 this.setIconImage(icon);
	
		 l1=new JLabel("Customer Id");
		 t1=new JTextField(10);
		 b1=new JButton("Delete");
		 b2=new JButton("Close");
		  
		 add(l1);
		 add(t1);
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
		
		DbService db  = new DbService();
		int x=0;
		if(ae.getSource()==b1)
		{
			x = db.deleteCustomer(bn1);
			if(x>=1)
			{
				t1.setText("Record Deleted");
			}
			else
			{
				t1.setText("Record Not Deleted");
			}
		}
		if (ae.getSource() == b2) {
			setVisible(false);
			dispose();

		}
	}
    public static void main(String[] args) {
    	DeleteC a1=new DeleteC();
		a1.setVisible(true);
	}

}
