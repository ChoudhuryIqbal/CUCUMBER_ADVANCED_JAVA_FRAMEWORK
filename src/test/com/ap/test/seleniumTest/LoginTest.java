package test.com.ap.test.seleniumTest;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.Test;
import com.ap.framework.base.FrameworkInitialize;
import com.ap.framework.utilities.DatabaseUtil;
import com.ap.framework.utilities.ExcelUtil;
import test.com.ap.test.pages.HomePage;
import test.com.ap.test.pages.LoginPage;

/**
 * 
 */

/**
 * @author choudhuryIqbal
 *
 */
public class LoginTest extends TestInitialize {

	public static final Logger log = Logger.getLogger(LoginTest.class.getName());

	

	@Test
	public void Login() throws InterruptedException {
		log.info("starting test");
		Thread.sleep(2000);
		currentPage = GetInstance(HomePage.class);
		currentPage = currentPage.AS(HomePage.class).clickLogin();
		
		log.info("passign message");
		currentPage.AS(LoginPage.class).Login(ExcelUtil.ReadCell("UserName", 1), ExcelUtil.ReadCell("Password", 1));
	}

	/*
	 * 
	 * 
	 * source for writtting test public void selectDbData() throws SQLException {
	 * String query="Select * from login"; DatabaseUtil dataBase=new DatabaseUtil();
	 * ResultSet data=dataBase.getData(query); System.out.println(data);
	 * while(data.next()) {
	 * System.out.println(data.getString(1)+" "+data.getString(2)); }
	 * 
	 * 
	 * if (textData.contains(data.getString(1))){ }
	 * 
	 * }
	 * 
	 * public void insertDbData() throws SQLException { String
	 * query="insert into login values ('sample1','pasword1')"; DatabaseUtil db=new
	 * DatabaseUtil(); db.insertData(query); }
	 * 
	 * public void updateDbData() throws SQLException { String
	 * query="update login if needed "; DatabaseUtil db=new DatabaseUtil();
	 * db.updateData(query); }
	 */
	// @Test
	public void selectDbData() throws SQLException {
		String query = "Select * from login";
		DatabaseUtil dataBase = new DatabaseUtil();
		ResultSet data = dataBase.getData(query);
		System.out.println(data);
		while (data.next()) {
			System.out.println(data.getString(1) + " " + data.getString(2));
		}
		
	}

}
