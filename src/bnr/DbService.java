package bnr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DbService {
	  
	Connection con=null;
	
	public DbService(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bannerproject?user=root&password=puchu123");
		}
		catch(Exception e) {
			System.out.println("error in class");
			e.printStackTrace();
		}
	}
		
		public int addBanner(BannerData b) {
		
			int x=0;
		
		try {

			PreparedStatement ps = con.prepareStatement("insert into banner values(?,?,?,?)");
			ps.setInt(1,b.getBid());
			ps.setString(2,b.getLcn());
			ps.setInt(3,b.getWid());
			ps.setInt(4,b.getLen());
			x = ps.executeUpdate();
			
			} 
		  catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in sql query");
			e.printStackTrace();
		}
        return x;
	
	}

		public int modifyBanner(BannerData b) {
		
			int x=0;
		
		try {

			PreparedStatement ps = con.prepareStatement("update banner set Location=?,width=?,height=? where Bid=?");
			
			ps.setString(1,b.getLcn());
			ps.setInt(2,b.getWid());
			ps.setInt(3,b.getLen());
			ps.setInt(4,b.getBid());
			x = ps.executeUpdate();
			
			} 
		  catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in sql query");
			e.printStackTrace();
		}
        return x;
	
	}
		public int deleteBanner(BannerData b) {
			
			int x=0;
		
		try {

			PreparedStatement ps = con.prepareStatement("delete from banner where Bid=?");
			ps.setInt(1,b.getBid());
			x = ps.executeUpdate();
			
			} 
		  catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in sql query");
			e.printStackTrace();
		}
        return x;
	
	}
		public ArrayList BannerList()
		{
			ArrayList al = new ArrayList();
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("select * from banner");
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					BannerData bnr=new BannerData();
					bnr.setBid(rs.getInt("Bid"));
					bnr.setLcn(rs.getString("location"));
					bnr.setWid(rs.getInt("Width"));
					bnr.setLen(rs.getInt("Height"));
					al.add(bnr);
					
				}
				
			} 
			catch (Exception e) 
			{
			System.out.println("Error in sql statement");
			}
			return al;
		}

		public int addCustomer(BannerData b) {
		
			int x=0;
		
		try {

			PreparedStatement ps = con.prepareStatement("insert into Customer values(?,?,?,?)");
			ps.setInt(1,b.getCid());
			ps.setString(2,b.getCname());
			ps.setInt(3,b.getCno());
			ps.setString(4,b.getAd());

			x = ps.executeUpdate();
			
			} 
		  catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in sql query");
			e.printStackTrace();
		}
        return x;
	
	}

		public int modifyCustomer(BannerData b) {
		
			int x=0;
		
		try {

			PreparedStatement ps = con.prepareStatement("update Customer set cname=?,cno=?,address=? where cid=?");
			
			ps.setString(1,b.getCname());
			ps.setInt(2,b.getCno());
			ps.setString(3,b.getAd());
			ps.setInt(4,b.getCid());
			x = ps.executeUpdate();
			
			} 
		  catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in sql query");
			e.printStackTrace();
		}
        return x;
	
	}
		public int deleteCustomer(BannerData b) {
			
			int x=0;
		
		try {

			PreparedStatement ps = con.prepareStatement("delete from Customer where Cid=?");
			ps.setInt(1,b.getCid());
			x = ps.executeUpdate();
			
			} 
		  catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in sql query");
			e.printStackTrace();
		}
        return x;
	
	}
		public ArrayList CustomerList()
		{
			ArrayList al = new ArrayList();
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("select * from Customer");
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					BannerData bnr=new BannerData();
					bnr.setCid(rs.getInt("Cid"));
					bnr.setCname(rs.getString("Cname"));
					bnr.setCno(rs.getInt("Cno"));
					bnr.setAd(rs.getString("Address"));
					al.add(bnr);
					
				}
				
			} 
			catch (Exception e) 
			{
			System.out.println("Error in sql statement");
			e.printStackTrace();
			}
			return al;
		}

		public int addRent(BannerData b) {
		
			int x=0;
		
		try {

			PreparedStatement ps = con.prepareStatement("insert into rent values(?,?,?,?)");
			ps.setInt(1,b.getBid());
			ps.setInt(2,b.getCid());
			ps.setString(3,b.getTime());
			ps.setInt(4,b.getRent());
			
			x = ps.executeUpdate();
			
			} 
		  catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in sql query");
			e.printStackTrace();
		}
        return x;
	
	}

		public int modifyRent(BannerData b) {
		
			int x=0;
		
		try {

			PreparedStatement ps = con.prepareStatement("update rent set time=?,rent=? where Cid=? and Bid=?");
			
			ps.setString(1,b.getTime());
			ps.setInt(2,b.getRent());
			ps.setInt(3,b.getCid());
			ps.setInt(4,b.getBid());
			x = ps.executeUpdate();
			
			} 
		  catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in sql query");
			e.printStackTrace();
		}
        return x;
	
	}
		public int deleteRent(BannerData b) {
			
			int x=0;
		
		try {

			PreparedStatement ps = con.prepareStatement("delete from rent where Bid=? and Cid=?");
			ps.setInt(1,b.getBid());
			ps.setInt(2,b.getCid());
			x = ps.executeUpdate();
			
			} 
		  catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in sql query");
			e.printStackTrace();
		}
        return x;
	
	}
		public ArrayList RentList()
		{
			ArrayList al = new ArrayList();
			
			try 
			{
				PreparedStatement //ps=con.prepareStatement("alter table rent add Size numeric");
				ps = con.prepareStatement("select * from rent");
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					BannerData bnr=new BannerData();
					bnr.setBid(rs.getInt("Bid"));
					bnr.setCid(rs.getInt("Cid"));
					//bnr.setSize(rs.getInt("Size"));
					bnr.setRent(rs.getInt("Rent"));
					bnr.setTime(rs.getString("Time"));
					al.add(bnr);
					
				}
				
			} 
			catch (Exception e) 
			{
			System.out.println("Error in sql statement");
			e.printStackTrace();
			}
			return al;
		}
	}



