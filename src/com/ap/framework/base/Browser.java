/**
 * 
 */
package com.ap.framework.base;

import org.openqa.selenium.WebDriver;

/**
 * @author choudhuryIqbal
 *
 */
public class Browser extends Base {

	public Browsertype Type;
	private WebDriver driver;

	/**
	 * 
	 */
	public Browser(WebDriver driver) {
		this.driver = driver;
	}

	public void GoToUrl(String url) {
		driver.get(url);

	}

	public void Maximize() {
		driver.manage().window().maximize();
	}

}
