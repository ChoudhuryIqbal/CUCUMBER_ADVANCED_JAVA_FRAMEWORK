/**
 * 
 */
package com.ap.framework.base;

import org.openqa.selenium.support.PageFactory;

/**
 * @author choudhuryIqbal
 *
 */
public class Base {
	public static BasePage currentPage;

	public <TPage extends BasePage> TPage GetInstance(Class<TPage> page) {
		Object obj = PageFactory.initElements(DriverContext.driver, page);
		return page.cast(obj);

	}
	
	public <TPage extends BasePage> TPage AS (Class <TPage> pageInstance) {
		try {
			return (TPage)this;
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return null;
		
	}
}
