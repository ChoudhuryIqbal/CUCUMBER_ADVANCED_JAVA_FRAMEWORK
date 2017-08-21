/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ap.framework.base.BasePage;

/**
 * @author choudhuryIqbal
 *
 */
public class LoginPage extends BasePage{

	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	@FindBy(id="email")
	public WebElement textEmail;
	
	@FindBy(id="passwd")
	public WebElement textPassword;
	
	@FindBy(id="SubmitLogin")
	public WebElement btnSubmit;
	
	
	public void Login(String userName,String passwd) {
		textEmail.sendKeys(userName);
		textPassword.sendKeys(passwd);
		btnSubmit.click();
	}
	
	

}
