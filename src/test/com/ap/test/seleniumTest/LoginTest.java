package test.com.ap.test.seleniumTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.com.ap.test.pages.LoginPage;

/**
 * 
 */

/**
 * @author choudhuryIqbal
 *
 */
public class LoginTest {

	private WebDriver driver = null;

	@org.junit.Before
	public void Initialize() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\choudhuryIqbal\\eclipse-workspace\\ap-framework\\src\\com\\ap\\framework\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

	}

	@Test
	public void Login() {
		LoginPage page=new LoginPage(driver);
		page.Login("ho@gmail.com", "password");
		
	}

}
