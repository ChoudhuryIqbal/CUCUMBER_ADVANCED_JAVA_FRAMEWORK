/**
 * 
 */
package com.ap.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author choudhuryIqbal
 *
 */
public abstract class BasePage {

	/**
	 * 
	 */
	public BasePage() {
		PageFactory.initElements(DriverContext.driver,this);
	}
	

}
