package db;

import java.io.Console;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;





public class DBOpenHelper {
	
	public static Connection connection_start() {
		String driver = "oracle.jdbc.OracleDriver";//����
        String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
        String user = "c##xiaoshui";
        String pwd = "977484";
        
        try {
            //��һ������������
            Class.forName(driver);// -->����
           
            
            Connection conn = DriverManager.getConnection(url,user,pwd);
            
//            System.out.print(conn.toString());
            return conn;
            
        }  catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return null;
    }
		
	}
	
	
	
	
	
	
	
	


