package test.com.ap.test.seleniumTest;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import  com.ap.framework.base.Base;
import com.ap.framework.base.Browsertype;
import com.ap.framework.base.DriverContext;
import com.ap.framework.base.FrameworkInitialize;
import com.ap.framework.utilities.ExcelUtil;

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

	

	@org.junit.Before
	public void Initialize() throws BiffException, IOException {
		InitializeBrowser(Browsertype.Firefox);
		
		//DriverContext.driver.get("http://automationpractice.com/index.php");
		DriverContext.browser.GoToUrl("http://automationpractice.com/index.php");
		try {
		ExcelUtil util=new ExcelUtil("C:\\Users\\choudhuryIqbal\\eclipse-workspace\\ap-framework\\src\\ExcelFolder\\data.xls");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
	//	HomePage home=new HomePage();
		currentPage=GetInstance(HomePage.class);
		currentPage =currentPage.AS(HomePage.class).clickLogin();
	//	((LoginPage) currentPage).Login("ho@gmail.com", "password");
		//currentPage.AS(LoginPage.class).Login("ho@gmail.com","password");
		//DDT from Excel
		currentPage.AS(LoginPage.class).Login(ExcelUtil.ReadCell(0,1),ExcelUtil.ReadCell(1,1));
	}

}
