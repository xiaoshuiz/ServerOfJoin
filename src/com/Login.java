package com;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBOpenHelper;

public class Login {
	public String join_login(String username,String userpassword)
	{
		Connection connection=new DBOpenHelper().connection_start();
//		String sql = "select 'PASSWORD' from C##XIAOSHUI.STUDENTMESSAGE where SNAME=  "+username;
		
		
		String sql = "select PASSWORD from C##XIAOSHUI.STUDENTMESSAGE where SNAME= "+username;
//		String sql = "INSERT INTO C##XIAOSHUI.STUDENTMESSAGE (CNUMBER, SNAME, PASSWORD, SNO, SCHOOL, TELNUMBER) VALUES ('"+m+"', '"+username+"', '"+userpassword+"', '"+username+"', '"+username+"', '"+userpassword+"')";
//		String sql = "INSERT INTO C##XIAOSHUI.STUDENTMESSAGE (CNUMBER, SNAME, PASSWORD, SNO, SCHOOL, TELNUMBER) VALUES (?,?,?,?,?,?)";
//		String sql = "INSERT INTO C##XIAOSHUI.STUDENTMESSAGE VALUES (?,?,?,?,?,?)";
		
		PreparedStatement pst=null;
		ResultSet rs= null;

	
		try 
		{
	    	pst=connection.prepareStatement(sql);
	    
	
			
//			pst.setString(1, "2");
//			pst.setString(2, username);
//			pst.setString(3, userpassword);
//			pst.setString(4, username);
//			pst.setString(5, username);
//			pst.setString(6, userpassword);
//			System.out.println("hhhh3");
			
			rs=pst.executeQuery(sql);
			String psd;
			while(rs.next())
			{
				psd = rs.getString("PASSWORD");
			    System.out.println(psd);
			 
			    if (psd.equals(userpassword)) {
			    	return "1";
			    	
					
				}
			    
			
			
			
			}

			return "2";
		
//			
//			int row = rs.getRow();
//			System.out.println(row);
//			String rss=rs.getString(1);
//			System.out.println("hhhh5");
//
//			System.out.print(rss);
			
//			if (psd.equals(userpassword)) {
//				return "1";
//				
//			}else {
//				return "0";
//			}
						
		} catch (Exception e) {
			System.out.print(e.toString());
			// TODO Auto-generated catch block
			return "2";
		}
		
//		if(username.equals("123456789"))
//		{
//			if (userpassword.equals("987654321"))
//			{
//				return "1";
//			}
//			else 
//			{
//				return "2";
//			}
//		}
//			
//		else 
//		{
//			return "2";
//		}
	}
	

}
