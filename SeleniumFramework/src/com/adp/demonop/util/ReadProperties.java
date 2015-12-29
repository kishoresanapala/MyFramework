package com.adp.demonop.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public static String readProp(String manoj) throws IOException{
		Properties prop= new Properties();
		FileInputStream fs= new FileInputStream("E:\\JarFiles\\GIT\\SeleniumFramework\\src\\framework.properties");
		prop.load(fs);
		String url=prop.getProperty(manoj);
		return url;
	}
}
