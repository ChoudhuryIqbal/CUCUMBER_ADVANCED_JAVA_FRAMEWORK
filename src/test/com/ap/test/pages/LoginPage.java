/**
 * 
 */
package test.com.ap.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.framework.base.BasePage;

/**
 * @author choudhuryIqbal
 *
 */
public class LoginPage extends BasePage {

	/**
	 * @param driver
	 */

	@FindBy(id = "email")
	public WebElement textEmail;

	@FindBy(id = "passwd")
	public WebElement textPassword;

	@FindBy(id = "SubmitLogin")
	public WebElement btnSubmit;

	public BasePage Login(String userName, String passwd) {
		textEmail.sendKeys(userName);
		textPassword.sendKeys(passwd);
		btnSubmit.click();
		// return new HomePage();
		return GetInstance(HomePage.class);

	}

}
