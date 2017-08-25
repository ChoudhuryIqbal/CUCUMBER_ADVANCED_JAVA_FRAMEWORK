/**
 * 
 */
package test.com.ap.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ap.framework.base.BasePage;

/**
 * @author choudhuryIqbal
 *
 */
public class AccountPage extends BasePage {

	@FindBy(linkText = "Cart")
	public WebElement txtCart;

}
