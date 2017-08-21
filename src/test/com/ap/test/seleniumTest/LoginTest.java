package test.com.ap.test.seleniumTest;

import org.junit.Test;
import org.openqa.selenium.By;
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
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("ho@gmail.com");
		LoginPage page=new LoginPage(driver);
		page.Login("ho@gmail.com", "password");
		
	}

}
