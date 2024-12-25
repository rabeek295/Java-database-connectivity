package Jdbc_Connection;

// 1. import the package
// 2. Load and Register the driver
// 3. Establish the connection with DataBase
// 4. Create a Statement
// 5. Execute the Query
// 6. Process the result
// 7. Close the connections

// Execute methods
//if DDL use-> execute() -> Return type = boolean
//if DML use-> executeUpdate() -> Return type = ResultSet
//if DQL use-> executeQuery() -> Return type = ClassType
//These all are the important execute methods

//1
import java.sql.*;

public class JDBC_PRACTICE {

	public static void main(String[] args) throws Exception {

		// 2
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 3
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alvin", "root", "root");
		
		// 4
		PreparedStatement statement = connection.prepareStatement("insert into rabeek values(2, 'monstor')");
		
		// 5
		boolean result = statement.execute();
		
		// 6
		System.out.println(result);
		
		// 7
		connection.close();

	}
}
