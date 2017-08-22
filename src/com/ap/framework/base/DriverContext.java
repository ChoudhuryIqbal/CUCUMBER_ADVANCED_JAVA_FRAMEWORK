/**
 * 
 */
package com.ap.framework.base;

import org.openqa.selenium.WebDriver;

/**
 * @author choudhuryIqbal
 *
 */
public class DriverContext {
	
	public static WebDriver driver;
	public static Browser browser;
	/**
	 * @return the driver
	 */

	/**
	 * @param driver the driver to set
	 */
	public static void setDriver(WebDriver driver) {
		DriverContext.driver = driver;
	}
	
	

}
