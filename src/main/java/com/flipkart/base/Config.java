package com.flipkart.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * this class has methods to read all the properties avilable
 * in config.properties file
 */
public class Config {
	
	public  static String getBrowserName() {
		String base = System.getProperty("user.dir");
		String filePath=base+"/src/main/resources/Application.properties";
    	FileInputStream fis = null;
		try {
			fis = new  FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

		Properties prop= new Properties();
		String value = null;
		
        try {	
        	prop.load(fis);
        	value= prop.getProperty("browser_name");

		} catch (IOException e) {
			
			e.printStackTrace();
		}
        return value;
	}
	
	public static String getAppUrl(String env) {
		String base= System.getProperty("user.dir");
		String filePath= base+"/src/main/resources/Application.properties";
		
		
		FileInputStream fis = null;
		try {
			fis = new  FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Properties prop= new Properties();
		String value = null;
		
        try {	
        	prop.load(fis);
        	value= prop.getProperty("app."+env+".url");

		} catch (IOException e) {
			
			e.printStackTrace();
		}

		return value;
		
		
		
	}

}
