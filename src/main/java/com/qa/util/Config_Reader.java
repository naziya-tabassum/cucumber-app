package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
	private Properties prop;
	
	public Properties  int_prop() {
		
			
		try {
			prop = new Properties();
			FileInputStream IO= new FileInputStream("C:\\Users\\naziy\\.eclipse\\Practice_Cucumber\\src\\test\\resource\\com\\qa\\config\\Config_Properties");
			prop.load(IO);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e) {
		
				e.printStackTrace();
		}
          return prop;
}}
