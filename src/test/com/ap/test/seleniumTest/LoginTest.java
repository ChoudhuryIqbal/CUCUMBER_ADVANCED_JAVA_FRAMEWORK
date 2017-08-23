package test.com.ap.test.seleniumTest;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import  com.ap.framework.base.Base;
import com.ap.framework.base.Browsertype;
import com.ap.framework.base.DriverContext;
import com.ap.framework.base.FrameworkInitialize;
import com.ap.framework.utilities.DatabaseUtil;
import com.ap.framework.utilities.ExcelUtil;
import com.ap.framework.utilities.LogUtil;

import jxl.read.biff.BiffException;
import test.com.ap.test.pages.HomePage;
import test.com.ap.test.pages.LoginPage;

/**
 * 
 */

/**
 * @author choudhuryIqbal
 *
 */
public class LoginTest extends FrameworkInitialize{

	
	
	
	//@org.junit.Before
	public void Initialize() throws BiffException, IOException {
		/*LogUtil logUtil=new LogUtil();
		logUtil.createLogFile();
		logUtil.write("Framework initialize");
		*/
		/*String connectionUrl="jdbc:sqlserver://localhost:1433;databaseName=EmployeeDB;user"
		DatabaseUtil.open();
		DatabaseUtil.executeQuery("Select * From Employee");
		*/
		InitializeBrowser(Browsertype.Firefox);
		
		//DriverContext.driver.get("http://automationpractice.com/index.php");
		DriverContext.browser.GoToUrl("http://automationpractice.com/index.php");
		try {
		ExcelUtil util=new ExcelUtil("C:\\Users\\choudhuryIqbal\\eclipse-workspace\\ap-framework\\src\\ExcelFolder\\data.xls");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
	//	HomePage home=new HomePage();
		currentPage=GetInstance(HomePage.class);
		currentPage =currentPage.AS(HomePage.class).clickLogin();
	//	((LoginPage) currentPage).Login("ho@gmail.com", "password");
		//currentPage.AS(LoginPage.class).Login("ho@gmail.com","password");
		//DDT from Excel
		currentPage.AS(LoginPage.class).Login(ExcelUtil.ReadCell("UserName",1),ExcelUtil.ReadCell("Password",1));
	}
	
	@Test
	public void selectDbData() throws SQLException {
		String query="Select * from logininfo";
		DatabaseUtil dataBase=new DatabaseUtil();
		ResultSet data=dataBase.getData(query);
		System.out.println(data);
		while(data.next()) {
			System.out.println(data.getString(1)+" "+data.getString(2)+" "+data.getString(2));
		}
	}
	
	public void insertDbData() throws SQLException {
		String query="insert into login values ('sample1','pasword1')";
		DatabaseUtil db=new DatabaseUtil();
		db.insertData(query);
	}
	
	public void updateDbData() throws SQLException {
		String query="update login if needed ";
		DatabaseUtil db=new DatabaseUtil();
		db.updateData(query);
	}

}
