package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	public static String loginData(String key) throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("/com.crm.vtiger/src/test/resources/ConfigureFile/vtiger.properties");
	prop.load(fis);
	
	String data= prop.getProperty(key); 
	return data;
	
	
}
}