/**
 * 
 */
package com.ap.framework.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.CloseableThreadContext.Instance;

import com.ap.framework.config.ConfigReader;
import com.ap.framework.config.Settings;

/**
 * @author choudhuryIqbal
 *
 */
public class DatabaseUtil {

	public Connection con;
	public Statement stmt;
	

	public Statement getStatement() {
		try {
			ConfigReader.populateSettting();
			/*String driver = "com.mysql.cj.jdbc.Driver";
			String connection = "jdbc:mysql://localhost:3306/logininfo";*/
			String driver=Settings.driverString;
			String connection=Settings.aUTConnectionString;
			String userName = "root";
			String password = "root";
			Class.forName(driver);
			con = DriverManager.getConnection(connection, userName, password);
			stmt = con.createStatement();
			return stmt;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}

	public void insertData(String query) throws SQLException {
		Statement sta = getStatement();
		sta.executeUpdate(query);

	}

	public ResultSet getData(String query) throws SQLException {

		ResultSet data = getStatement().executeQuery(query);
		return data;
	}

	public void updateData(String query) throws SQLException {
		getStatement().executeUpdate(query);

	}
	/*
	 * public static void open(String connnectionString) throws
	 * InstantiationException, IllegalAccessException, ClassNotFoundException,
	 * SQLException { Class.forName("com.mysql.jdbc.Driver").newInstance();
	 * DriverManager.getConnection(connnectionString);
	 * 
	 * }
	 * 
	 * public void executeQuery(String query, Connection con) throws SQLException {
	 * Statement stmt = con.createStatement(); ResultSet resutltSet =
	 * stmt.executeQuery(query); }
	 */

}
