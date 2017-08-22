package test.com.ap.test.seleniumTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import  com.ap.framework.base.Base;
import com.ap.framework.base.Browsertype;
import com.ap.framework.base.DriverContext;
import com.ap.framework.base.FrameworkInitialize;

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
	public void Initialize() {
		InitializeBrowser(Browsertype.Firefox);
		
		DriverContext.driver.get("http://automationpractice.com/index.php");
		
		
	}

	@Test
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
	//	HomePage home=new HomePage();
		currentPage=GetInstance(HomePage.class);
		currentPage =currentPage.AS(HomePage.class).clickLogin();
	//	((LoginPage) currentPage).Login("ho@gmail.com", "password");
		currentPage.AS(LoginPage.class).Login("ho@gmail.com","password");
	}

}
