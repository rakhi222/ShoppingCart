package utility;

import java.sql.*;

public class DBUtil {

	public ResultSet initializeDB() {

		ResultSet rs = null;
		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			Statement st = con.createStatement();
			rs = st.executeQuery("select * from Catalog");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return rs;

	}
}
