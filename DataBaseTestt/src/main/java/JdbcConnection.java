import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host="localhost";
		String port="3306";
		String databasename="testt";
		
		
		Connection con= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+databasename,"root","admin");

		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from empinfo where id=2");
		
		
		

		while(rs.next()) {
		
		
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("age"));
		System.out.println(rs.getString("location"));
		}
	}

}

