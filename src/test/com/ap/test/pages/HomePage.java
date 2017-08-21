/**
 * 
 */
package test.com.ap.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.ap.framework.base.BasePage;

/**
 * @author choudhuryIqbal
 *
 */
public class HomePage extends BasePage{
	
	
	@FindBy(className ="login")
	public WebElement btnLogin;

	/**
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	
	}
	
	
	public void clickLogin() {
		btnLogin.click();
	}

}
