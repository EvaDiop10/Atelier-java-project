package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Database {

	private static Connection connection;
    static {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/jeetest"
                            ,"root",
                            "");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static Connection getConnection() {
        return connection;
    }
//	public static Connection getCon() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
