/**
 * 
 */
package test.com.ap.test.seleniumTest;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.ap.framework.base.DriverContext;
import com.ap.framework.base.FrameworkInitialize;
import com.ap.framework.config.ConfigReader;
import com.ap.framework.config.Settings;
import com.ap.framework.utilities.ExcelUtil;

import jxl.read.biff.BiffException;

/**
 * @author choudhuryIqbal
 *
 */
public class TestInitialize extends FrameworkInitialize{
	public static final Logger log = Logger.getLogger(LoginTest.class.getName());

	@org.junit.Before
	public void Initialize() throws BiffException, IOException {
		ConfigReader.populateSettting();
		log.info("starting browser");
		/*
		 * LogUtil logUtil=new LogUtil(); logUtil.createLogFile();
		 * logUtil.write("Framework initialize");
		 */
		/*
		 * String
		 * connectionUrl="jdbc:sqlserver://localhost:1433;databaseName=EmployeeDB;user"
		 * DatabaseUtil.open(); DatabaseUtil.executeQuery("Select * From Employee");
		 */
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		// InitializeBrowser(Browsertype.Firefox);
		log.info("enter browsertype");
		InitializeBrowser(Settings.browserType);
		// DriverContext.driver.get("http://automationpractice.com/index.php");
		// DriverContext.browser.GoToUrl("http://automationpractice.com/index.php");
		log.info("entering Url");
		DriverContext.browser.GoToUrl(Settings.aUT);
		try {
			log.info("proivdeing excel path");
			ExcelUtil util = new ExcelUtil(Settings.excelSheetPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
