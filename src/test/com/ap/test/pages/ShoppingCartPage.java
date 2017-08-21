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
public class ShoppingCartPage  extends BasePage{
	
	
	@FindBy(id="cart_title")
	public WebElement txtCartTitle;
	/**
	 * @param driver
	 */
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
