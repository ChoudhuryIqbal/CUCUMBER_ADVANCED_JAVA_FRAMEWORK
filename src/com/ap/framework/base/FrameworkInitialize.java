/**
 * 
 */
package com.ap.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author choudhuryIqbal
 *
 */
public class FrameworkInitialize extends Base {

	public void InitializeBrowser(Browsertype browserType) {

		WebDriver driver = null;

		switch (browserType) {
		case Chrome:
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\choudhuryIqbal\\eclipse-workspace\\ap-framework\\src\\com\\ap\\framework\\drivers\\chromedriver.exe");
			/* DriverContext.driver = new ChromeDriver(); */
			driver = new ChromeDriver();
			// DriverContext.setDriver(driver);
			break;

		case Firefox:
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\choudhuryIqbal\\eclipse-workspace\\ap-framework\\src\\com\\ap\\framework\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			// DriverContext.setDriver(driver);
			break;
		case IE:
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\choudhuryIqbal\\eclipse-workspace\\ap-framework\\src\\com\\ap\\framework\\drivers\\IEdriver.exe");
			driver = new InternetExplorerDriver();
			// DriverContext.setDriver(driver);
			break;
		default:
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\choudhuryIqbal\\eclipse-workspace\\ap-framework\\src\\com\\ap\\framework\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			// DriverContext.setDriver(driver);
			break;

		}

		DriverContext.setDriver(driver);

		// broser
		DriverContext.browser = new Browser(driver);

	}

}
