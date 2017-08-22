package test.com.ap.test.seleniumTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ap.framework.base.DriverContext;

import test.com.ap.test.pages.HomePage;
import test.com.ap.test.pages.LoginPage;

/**
 * 
 */

/**
 * @author choudhuryIqbal
 *
 */
public class LoginTest {

	

	@org.junit.Before
	public void Initialize() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\choudhuryIqbal\\eclipse-workspace\\ap-framework\\src\\com\\ap\\framework\\drivers\\geckodriver.exe");
		DriverContext.driver = new FirefoxDriver();
		DriverContext.driver.get("http://automationpractice.com/index.php");
		
		
	}

	@Test
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
		HomePage home=new HomePage();
		LoginPage loginPage=home.clickLogin();
		
		loginPage.Login("ho@gmail.com", "password");
		
	}

}
