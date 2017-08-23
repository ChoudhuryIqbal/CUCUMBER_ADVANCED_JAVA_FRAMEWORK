/**
 * 
 */
package com.ap.framework.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author choudhuryIqbal
 *
 */
public class LogUtil {
	//file format for the log name
	
	ZonedDateTime  date=ZonedDateTime.now();
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("ddMMyyyyHHMMSS");
	String fileNameFormat=date.format(formatter);
	private BufferedWriter bufferedWriter=null;
	public void createLogFile() {
		try {
			
			File dir =new File ("C:/Logs/");
			if(!dir.exists()) {
				dir.mkdir();
				
				
				//create file 
				File logFile=new File(dir+"/"+fileNameFormat+".log");
				FileWriter fileWriter=new FileWriter(logFile.getAbsolutePath());
				bufferedWriter=new BufferedWriter(fileWriter);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//crearte Log File
	//write some message within the log file
	public void write(String message) {
		try {
			bufferedWriter.write(message);
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
