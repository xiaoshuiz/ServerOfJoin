package db;

import java.io.Serializable;

public class courseMessage implements Serializable {
	public String cname;
	public String teacher;
	public String place;
	public String date;
	public String time;


	
	public void set_cname(String cname)
	{
		this.cname=cname;
	}
	public String get_cname() 
	{
		return cname;
	}
	
	public void set_teacher(String teacher)
	{
		this.teacher=teacher;
	}
	public String get_teacher() 
	{
		return teacher;
	}
	
	public void set_place(String place)
	{
		this.place=place;
	}
	public String get_place() 
	{
		return place;
	}
	
	public void set_date(String date)
	{
		this.date=date;
	}
	public String get_date() 
	{
		return date;
	}
	
	public void set_time(String time)
	{
		this.time=time;
	}
	public String get_time() 
	{
		return time;
	}
	
	

}
	


