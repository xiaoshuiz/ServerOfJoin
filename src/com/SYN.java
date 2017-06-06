package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.NEW;

import db.DBOpenHelper;

public class SYN {
	public String syn_course(String i) 
	{
	
//		if(sec.equals("977484"))
//		{
	
		System.out.println(i);
		System.out.println(i);
		Connection connection=new DBOpenHelper().connection_start();
		

		String sql="select * from C##XIAOSHUI.COURSEMESSAGE where COURSENUMBER="+i;
		
		PreparedStatement pst=null;
		ResultSet rs;
		try {
			pst=connection.prepareStatement(sql);
			rs=pst.executeQuery(sql);
		
			String coursemessage;
			System.out.println("222");
			if(rs.next())
			{
				System.out.println("333");
				coursemessage=rs.getString("COURSENAME")+" "+rs.getString("COURSETEACHER")+" "+rs.getString("COURSEPLACE")+" "+rs.getString("COURSEDATE")+" "+rs.getString("COURSETIME");
				System.out.println("444");
				String a=Integer.toString(rs.getRow());
				System.out.println(a);
				return coursemessage;
			}
			
			else return "2";
			
		
			
		} catch (Exception e) {
			System.out.println("11");
			return "2";
			
			// TODO: handle exception
		}
		
		
		
		
		
		
//		}
//		System.out.println("22");
//		return null;
	
	}

}
