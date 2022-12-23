package insertrecord;
import java.sql.*;

import com.mysql.jdbc.Statement;

import jdbc_connection.Database_Connection;
public class Insert_Record {
	public static void main(String[] args) {
		Insert_Record d=new Insert_Record();
		d.getConnection();
	}
void getConnection() {
	try {
		Class.forName(Database_Connection.driver);
		Connection con=DriverManager.getConnection(Database_Connection.user,Database_Connection.password);
		Statement smt=getConnection(Database_Connection);
		ResultSet res=smt.executeQuery("Insert into user");
		smt.getInt(1);
		System.out.println("101");
		smt.getString(2);
		System.out.println("sam");
		smt.getInt(3);
		System.out.println("12-10-2022");
		smt.getString(4);
		System.out.println(sam@gmail.com);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
	

}
