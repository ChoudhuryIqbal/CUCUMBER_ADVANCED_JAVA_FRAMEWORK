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
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

}