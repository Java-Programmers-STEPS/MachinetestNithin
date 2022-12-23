package insertrecord;
import java.sql.*;

import jdbc_connection.Database_Connection;

public class Retrive_Record {
public static void main(String[] args) {
	Retrive_Record d= new Retrive_Record();
	d.getConnection();
}
void getConnection() {
	try {
		Class.forName(Database_Connection.driver);
		Connection con=DriverManager.getConnection(Database_Connection.user,Database_Connection.password);
		Statement smt=con.getConnection(Database_Connection);
		ResultSet res=smt.executeQuery("SELECT * FROM user");
		while(res.next()) {
			System.out.println(res+"USER_ID"+getInt(1)+res+"Full_Name"+getString(2)+res+"DOB"+getString(3)+res+"Email_Id"+getString(4));
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
}
