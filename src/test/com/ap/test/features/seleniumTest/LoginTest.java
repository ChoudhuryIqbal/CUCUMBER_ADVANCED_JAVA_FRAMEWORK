package seleniumTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		// open ther brwoser
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\choudhuryIqbal\\eclipse-workspace\\ap-framework\\src\\com\\ap\\framework\\drivers\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\choudhuryIqbal\\eclipse-workspace\\ap-framework\\src\\com\\ap\\framework\\drivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");

	}

	@Test
	public void Login() {
		driver.findElement(By.className("login")).sendKeys("hi@hi.com");
		
	}

}
