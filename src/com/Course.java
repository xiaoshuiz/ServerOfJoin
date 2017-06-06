package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBOpenHelper;

public class Course {
	public String course_add(String coursename,String courseteacher, String coursedate, String coursetime, String courseplace) 
	{
		
		
		
		System.out.println(coursename+"/n"+courseteacher+"/n"+coursedate+"/n"+coursetime+"/n"+courseplace);
		Connection connection=new DBOpenHelper().connection_start();
		String sql1 = "INSERT INTO C##XIAOSHUI.COURSEMESSAGE VALUES (?,?,?,?,?,?)";
		String sql2="select * from C##XIAOSHUI.COURSEMESSAGE";
		
		PreparedStatement pst1=null;
		PreparedStatement pst2=null;
		
		ResultSet rs1=null;
		ResultSet rs2=null;
		
		try {
			pst2=connection.prepareStatement(sql2);
			rs2=pst2.executeQuery(sql2);
			int a=0;
			
			while(rs2.next())
			{
				a=rs2.getRow();
			}
			
			a++;
			
			pst1=connection.prepareStatement(sql1);
			
			
			
			
			pst1.setInt(1,a);
			pst1.setString(2, coursename);
			pst1.setString(3, courseteacher);
			pst1.setString(4, coursedate);
			pst1.setString(5, coursetime);
			pst1.setString(6, courseplace);
			
			pst1.executeUpdate();
			return "1";
			

			
			
			
		
	
			
			
		} 
		catch (Exception e)
		{
			return "2";
		}
		
		
		
		
		
		
		
	}

}
