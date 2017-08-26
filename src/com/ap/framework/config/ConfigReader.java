/**
 * 
 */
package com.ap.framework.config;

import java.io.IOException;
import java.util.Properties;

import com.ap.framework.base.Browsertype;

/**
 * @author choudhuryIqbal
 *
 */
public class ConfigReader {
	
	
	public static void populateSettting() throws IOException {
		ConfigReader reader=new ConfigReader();
		reader.ReadProperty();
	}
	
	private void ReadProperty() throws IOException {
		Properties p=new Properties();
		p.load(getClass().getResourceAsStream("GlobalConfig.properties"));
		Settings.aUTConnectionString=p.getProperty("AUTConnectionString");
		Settings.driverString=p.getProperty("DriverString");
		Settings.excelSheetPath=p.getProperty("ExcelSheetPath");
		
		Settings.browserType=Browsertype.valueOf(p.getProperty("BrowserType"));
		Settings.aUT=p.getProperty("AUT");
	}

}
