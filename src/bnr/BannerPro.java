package bnr;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Toolkit;
import java.awt.event.*;
import java.text.NumberFormat.Style;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import javax.swing.*;
import javax.swing.JPopupMenu.Separator;

class BannerD extends JFrame implements ActionListener{
	
	JMenuBar mbar;
    JToolBar toolbar; 
	JMenu m1, m2,m3,m4,m5,m6,m7,m8,m9;
	JMenuItem i1, i2, i3, i4, i5, i6,i7,i8,i9,i10,i11,i12,i14,i15,i16,i18,i19,i20,i21,i22,i23,i13;
	JButton  b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	
	

	 BannerD() {
		// TODO Auto-generated constructor stub
		 setTitle("Banner Management System");
	     setSize(Toolkit.getDefaultToolkit().getScreenSize());
	     setLayout(new BorderLayout());
	     ImageIcon ibg= new  ImageIcon(new ImageIcon("1586366.jpg").getImage().getScaledInstance(1350, 700,Image.SCALE_DEFAULT));
	     JLabel bg=new JLabel();
	     bg.setIcon(ibg);
	     add(bg);
	     bg.setLayout(new FlowLayout());
	     Image icon = Toolkit.getDefaultToolkit().getImage("Vanamo_Logo.png");    
		 this.setIconImage(icon);
		
	     menubar();
         toolbar();
         bg.add(toolbar,BorderLayout.NORTH);
         
        i1.addActionListener(this);
 		i2.addActionListener(this);
 		i3.addActionListener(this);
 		i4.addActionListener(this);
 		i5.addActionListener(this);
 		i6.addActionListener(this);
 		i7.addActionListener(this);
 		i8.addActionListener(this);
 		i9.addActionListener(this);
 		i10.addActionListener(this);
 		i11.addActionListener(this);
 		i12.addActionListener(this);
 		i13.addActionListener(this);
 		i14.addActionListener(this);
 		i15.addActionListener(this);
 		i16.addActionListener(this);
 		i18.addActionListener(this);
 		i19.addActionListener(this);
 		i20.addActionListener(this);
 		i21.addActionListener(this);
 		i22.addActionListener(this);
 		i23.addActionListener(this);
 		b1.addActionListener(this);
 		b2.addActionListener(this);
 		b3.addActionListener(this);
 		b4.addActionListener(this);
 		b5.addActionListener(this);
 		b6.addActionListener(this);
 		b7.addActionListener(this);
 		b8.addActionListener(this);
 		b9.addActionListener(this);
 		b10.addActionListener(this);
 		b11.addActionListener(this);
 		b12.addActionListener(this);
 		
 		
 		this.addWindowListener(new WindowAdapter() {
			//====Inner Anonymous class=====
		  public void windowClosing(WindowEvent e) {
			  int r=JOptionPane.showConfirmDialog(getParent(),"Do you want to exit","Exit", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			  if(r==JOptionPane.YES_OPTION) {
			  System.exit(0);
			  }
			  else {
				  BannerD b=new BannerD();
				  b.setDefaultCloseOperation(b.DO_NOTHING_ON_CLOSE);
			  }
	    }
 			
	      });
		}
		
	 
	 public void menubar() {
		 mbar = new JMenuBar();
		 setJMenuBar(mbar);
		 
		    m1 = new JMenu("Contents");
		    
			i1 = new JMenuItem("Add");
			i1.setMnemonic(KeyEvent.VK_A);
			i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK ));
			i2 = new JMenuItem("Modify");
			i2.setMnemonic(KeyEvent.VK_M);
			i2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK ));
			i3 = new JMenuItem("Delete");	
			i3.setMnemonic(KeyEvent.VK_D);
			i3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK ));
			i4 = new JMenuItem("Banner List");
			i4.setMnemonic(KeyEvent.VK_L);
			i4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK ));
			i5 = new JMenuItem("Add");
			i5.setMnemonic(KeyEvent.VK_A);
			i5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK ));
			i6 = new JMenuItem("Modify");
			i6.setMnemonic(KeyEvent.VK_M);
			i6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.ALT_MASK ));
			i7 = new JMenuItem("Delete");	
			i7.setMnemonic(KeyEvent.VK_D);
			i7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.ALT_MASK ));
			i8=new JMenuItem("Customer List");
			i8.setMnemonic(KeyEvent.VK_L);
			i8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.ALT_MASK ));
			 
			i9 = new JMenuItem("Add");
			i9.setMnemonic(KeyEvent.VK_A);
			i9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.SHIFT_MASK ));
		
			i10 = new JMenuItem("Modify");
			i10.setMnemonic(KeyEvent.VK_M);
			i10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.SHIFT_MASK ));
			i11= new JMenuItem("Delete");
			i11.setMnemonic(KeyEvent.VK_D);
			i11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.SHIFT_MASK ));
			i12= new JMenuItem("Rent List");
			i12.setMnemonic(KeyEvent.VK_L);
			i12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.SHIFT_MASK ));
			
			i14 = new JMenuItem("Modify");
			i14.setMnemonic(KeyEvent.VK_M);			i14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK ));
			i15 = new JMenuItem("Delete");	
			i15.setMnemonic(KeyEvent.VK_D);
			i15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK ));
			i16 = new JMenuItem("List");
			i16.setMnemonic(KeyEvent.VK_L);
			i16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK ));
			
			i18 = new JMenuItem("Modify");
			i18.setMnemonic(KeyEvent.VK_M);
			i18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.ALT_MASK ));
			i19 = new JMenuItem("Delete");	
			i19.setMnemonic(KeyEvent.VK_D);
			i19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.ALT_MASK ));
			i20=new JMenuItem("List");
			i20.setMnemonic(KeyEvent.VK_L);
			i20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.ALT_MASK ));
			
			i21 = new JMenuItem("Modify");
			i21.setMnemonic(KeyEvent.VK_M);
			i21.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.SHIFT_MASK ));
			i22= new JMenuItem("Delete");
			i22.setMnemonic(KeyEvent.VK_D);
			i22.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.SHIFT_MASK ));
			i23= new JMenuItem("List");
			i23.setMnemonic(KeyEvent.VK_L);
			i23.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.SHIFT_MASK ));
			i13 = new JMenuItem("Close");
			
			m2 = new JMenu("Banner Info");
		    m3 = new JMenu("Customer");
		    m4 = new JMenu("Rent");
			
			m2.add(i1);
			m2.add(i14);
			m2.add(i15);
			m2.add(i16);
			
			
			m3.add(i5);
			m3.add(i18);
			m3.add(i19);
			m3.add(i20);
			
			m4.add(i9);
			m4.add(i21);
			m4.add(i22);
			m4.add(i23);
			
			m1.add(m2);
			m1.add(m3);
			m1.add(m4);
			m1.add(i13);
			
			mbar.add(m1);
			
			m5 = new JMenu("Edit");
			m6= new JMenu("Edit Banner");
			m7= new JMenu("Edit Customer");
			m8= new JMenu("Edit Rent");
			
			m6.add(i2);
			m6.add(i3);
	
			m7.add(i6);
			m7.add(i7);
			m8.add(i10);
			m8.add(i11);
			
			m5.add(m6);
			m5.add(m7);
			m5.add(m8);
			
			mbar.add(m5);
			
			m9 = new JMenu("List");
			
			m9.add(i4);
			m9.add(i8);
			m9.add(i12);
			
			mbar.add(m9);
			
	 }
	 public void toolbar() {
		    toolbar = new JToolBar();
			toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
			toolbar.setBorder(BorderFactory.createEtchedBorder());
			toolbar.setSize(Toolkit.getDefaultToolkit().getScreenSize());
			
		    ImageIcon i1= new  ImageIcon(new ImageIcon("ab.png").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b1 = new JButton("Add");
			b1.setIcon(i1);
			b1.setBorderPainted(true);
			b1.setToolTipText("Add Banner(Ctrl+A)");
			b1.setFocusPainted(true);
			
			b2 = new JButton("Modify");
			ImageIcon i2= new  ImageIcon(new ImageIcon("mb.jpg").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b2.setToolTipText("Modify Banner(Ctrl+M)");
			b2.setIcon(i2);
			
			b3 = new JButton(" ");
			ImageIcon i3= new  ImageIcon(new ImageIcon("bin2.png").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b3.setToolTipText("Delete Banner(Ctrl+D)");
			b3.setIcon(i3);
			
			b4 = new JButton("List");
			ImageIcon i4= new  ImageIcon(new ImageIcon("bl.png").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b4.setToolTipText("List of Banner(Ctrl+L)");
			b4.setIcon(i4);
			
			b5 = new JButton("+");
			ImageIcon i5= new  ImageIcon(new ImageIcon("ac.png").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b5.setToolTipText("Add Customer(Alt+A)");
			b5.setIcon(i5);
			
			
			b6 = new JButton("Modify");
			ImageIcon i6= new  ImageIcon(new ImageIcon("mc.png").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b6.setToolTipText("Modify Customer(Alt+M)");
			b6.setIcon(i6);
			
			
			b7 = new JButton(" ");
			b7.setToolTipText("Delete Customer(Alt+D)");
			ImageIcon i7= new  ImageIcon(new ImageIcon("dc.png").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b7.setIcon(i7);
			
			b8 = new JButton("List");
			ImageIcon i8= new  ImageIcon(new ImageIcon("lc.png").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b8.setToolTipText("Customer List(Alt+L)");
			b8.setIcon(i8);
			

			b9 = new JButton("Book");
			b9.setToolTipText("Book Banner for rent(Shift+A)");
			ImageIcon i9= new  ImageIcon(new ImageIcon("ar.jpg").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b9.setIcon(i9);
			
			b10 = new JButton("Modify");
			b10.setToolTipText("Modify Rent_Data(Shift+M)");
			ImageIcon i10= new  ImageIcon(new ImageIcon("mr.png").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b10.setIcon(i10);
			
			b11 = new JButton(" ");
			b11.setToolTipText("Delete(Shift+D)");
			ImageIcon i11= new  ImageIcon(new ImageIcon("rd.png").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b11.setIcon(i11);
			
			b12 = new JButton("List");
			b12.setToolTipText("List of Rented Banners(Shift+L)");
			ImageIcon i12= new  ImageIcon(new ImageIcon("rl.png").getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT));
			b12.setIcon(i12);
			
			toolbar.add(b1);
			toolbar.addSeparator();
			toolbar.add(b2);
			toolbar.addSeparator();
			toolbar.add(b3);
			toolbar.addSeparator();
			toolbar.add(b4);
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.add(b5);
			toolbar.addSeparator();
			toolbar.add(b6);
			toolbar.addSeparator();
			toolbar.add(b7);
			toolbar.addSeparator();
			toolbar.add(b8);
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.addSeparator();
			toolbar.add(b9);
			toolbar.addSeparator();
			toolbar.add(b10);
			toolbar.addSeparator();
			toolbar.add(b11);
			toolbar.addSeparator();
			toolbar.add(b12);	
			toolbar.addSeparator();
			toolbar.addSeparator();
	 }
	

	 public void actionPerformed(ActionEvent ae) {
		 if (ae.getSource() == i1 || ae.getSource() == b1) {
				AddB a1=new AddB();
				a1.setVisible(true);
				a1.setLocation(300,200);
			}
     if(ae.getSource() == i2 || ae.getSource() == b2|| ae.getSource() == i14)
     {
				ModifyB b1=new ModifyB();
				b1.setVisible(true);
				b1.setLocation(300,200);
				
			}
			if (ae.getSource() == i3 || ae.getSource() == b3|| ae.getSource() == i15) {
				DeleteB d1=new DeleteB();
				d1.setVisible(true);
				d1.setLocation(300,200);
			}
			if (ae.getSource() == i4 || ae.getSource() == b4|| ae.getSource() == i16) {
				DbService db  = new DbService();
				ArrayList al = db.BannerList();
				ListB l1 = new ListB(al);
				l1.setVisible(true);
				l1.setLocation(300,200);
				
			}
			if (ae.getSource() == i5 || ae.getSource() == b5) {
				AddC ac=new AddC();
				ac.setVisible(true);
				ac.setLocation(300,200);
			}
			if (ae.getSource() == i6 || ae.getSource() == b6|| ae.getSource() == i18) {
				ModifyC bc=new ModifyC();
				bc.setVisible(true);
				bc.setLocation(300,200);
			}
			if (ae.getSource() == i7 || ae.getSource() == b7|| ae.getSource() == i19) {
				DeleteC d2=new DeleteC();
				d2.setVisible(true);
				d2.setLocation(300,200);
			}
			if (ae.getSource() == i8 || ae.getSource() == b8|| ae.getSource() == i20) {
				DbService db  = new DbService();
				ArrayList al = db.CustomerList();
				ListC l1 = new ListC(al);
				l1.setVisible(true);
				l1.setLocation(300,200);
			}
			if (ae.getSource() == i9 || ae.getSource() == b9) {
				Book br=new Book();
				br.setVisible(true);
				br.setLocation(300,200);
			}
			if (ae.getSource() == i10 || ae.getSource() == b10|| ae.getSource() == i21) {
				ModifyR br=new ModifyR();
				br.setVisible(true);
				br.setLocation(300,200);
			}
			if (ae.getSource() == i11 || ae.getSource() == b11|| ae.getSource() == i22) {
				DeleteR dr=new DeleteR();
				dr.setVisible(true);
				dr.setLocation(300,200);
			}
			if (ae.getSource() == i12 || ae.getSource() == b12|| ae.getSource() == i23) {

				DbService db  = new DbService();
				 ArrayList al = db.RentList();
			    	ListR l1=new ListR(al);
					l1.setVisible(true);
				    l1.setLocation(300,200);
		}
			if(ae.getSource()==i13) {
				System.exit(0);
			}
	 
	 }
	
}
public class BannerPro{
	public static void main(String args[]) {
		BannerD bn=new BannerD();
		bn.setVisible(true);
		bn.setDefaultCloseOperation(bn.DO_NOTHING_ON_CLOSE);
		
	
	}
}



