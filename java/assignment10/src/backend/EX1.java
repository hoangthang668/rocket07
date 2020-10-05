package backend;

import java.awt.Container;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class EX1 {
	private Connection cont;
	private Properties properties;
	//question1
	public void connectionDatabase() throws FileNotFoundException, IOException, SQLException{
		
		 properties = new Properties();
		properties.load(new FileInputStream("C:\\Users\\hoangthang\\workspace\\assignment9\\src\\configDatabase.properties"));
		
		String dbUrl = properties.getProperty("dbUrl");// duong dan toi database
		String user =properties.getProperty("user");
		String password = properties.getProperty("password");
		 cont = DriverManager.getConnection(dbUrl, user, password);
		System.out.println("Connect success");
	}
	
	//question2
	public void printPosition() throws SQLException{
		Statement statement = cont.createStatement();
		String sql= "select * from position";
		ResultSet result = statement.executeQuery(sql);
		
		while(result.next()){
			System.out.println(result.getInt("PositionId"));
			System.out.println(result.getString("PositionName" ));
			
		}
		
	}
	//question3:
	public void createPosition(String name) throws SQLException{
		String sql ="insert into Position (PositionName)"
				+"value 				  ( ? )";
		PreparedStatement prepared = cont.prepareStatement(sql);
		prepared.setString(1,name);
		
		int dem = prepared.executeUpdate();
		if (dem ==1){
			System.out.println(properties.getProperty("position.insert.complete"));
			
		}else{
			System.out.println(properties.getProperty("position.insert.false"));
		}
		
		
	}
	//question4
	public void updatePositionName() throws SQLException{
		Statement statement = cont.createStatement();
		
		String sql= " update Position set PositionName = 'Dev' where PositionId=5";
		int dem = statement.executeUpdate(sql);
		
		if (dem == 1) {
			System.out.println(properties.getProperty("position.update.complete"));
		} else {
			System.out.println(properties.getProperty("position.update.false"));
		}

	}
	
	
	//question5
public void  deleteDepartment(int id) throws SQLException{
		
	String sql= " deleete form postion where positionId=?";
	PreparedStatement statement = cont.prepareStatement(sql);
	
	statement.setInt(1, id);
	
	int dem = statement.executeUpdate();
	
	if (dem > 0) {
		System.out.println(properties.getProperty("position.delete.complete"));
	} else {
		System.out.println(properties.getProperty("position.delete.false"));
	}
  }
public void closeConnection() throws SQLException {
	cont.close();
}


}
	
	
	


