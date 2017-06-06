 package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.util.Sorting;

import db.DBOpenHelper;


public class Register {
	
	public String join_register(String sname,String password, String sno, String school, String telnumber) 
	{
		System.out.println(sname);

		Connection connection=new DBOpenHelper().connection_start();
		
		

		
		

		
		String sql1 = "select PASSWORD from C##XIAOSHUI.STUDENTMESSAGE where SNAME= "+sname;
		String sql2="select * from C##XIAOSHUI.STUDENTMESSAGE";
		
		
		
//		String sql = "INSERT INTO 'C##XIAOSHUI'.'STUDENTMESSAGE' (CNUMBER, SNAME, PASSWORD, SNO, SCHOOL, TELNUMBER) VALUES ('"+cnumber+"', '"+sname+"', '"+password+"', '"+sno+"', '"+school+"', '"+telnumber+"')";
		String sql3 = "INSERT INTO C##XIAOSHUI.STUDENTMESSAGE VALUES (?,?,?,?,?,?)";
		
		//		cnumber++;
		PreparedStatement pst1=null;
		PreparedStatement pst2=null;
		PreparedStatement pst3=null;
		
		ResultSet rs1=null;
		ResultSet rs2=null;
		try 
		{
			pst1=connection.prepareStatement(sql1);
			rs1=pst1.executeQuery(sql1);
			
			int i=0;
		
			
			while(rs1.next()){
				
				i=rs1.getRow();
			};
			
		
			if(i>=1)
			{
				System.out.println("111");
				return "2";
			}
			
			else
			{
				pst2=connection.prepareStatement(sql2);
				rs2=pst2.executeQuery(sql2);
				int a=0;
				
				while(rs2.next())
				{
					a=rs2.getRow();
				}
				
				a++;
		
			
				
				    
				pst3=connection.prepareStatement(sql3);
			
			
			
			
				pst3.setInt(1,a);
				pst3.setString(2, sname);
				pst3.setString(3, password);
				pst3.setString(4, sno);
				pst3.setString(5, school);
				pst3.setString(6, telnumber);
				
				pst3.executeUpdate();
			
				return "1";
			
			
			
			}
		
			
			
			
//			pst.setString(1, "2");
//			pst.setString(2, sname);
//			pst.setString(3, password);
//			pst.setString(4, sno);
//			pst.setString(5, school);
//			pst.setString(6, telnumber);
//			pst.executeUpdate();
//			
//			
//			return "1";
			
			
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
		System.out.println(e.toString());
		return "2";
		}
	}

}
