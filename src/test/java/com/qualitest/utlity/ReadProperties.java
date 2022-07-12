package com.qualitest.utlity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	protected static Properties properties = new Properties();

	public static String getFromPropertyFile(String key) {
		String value = null;
		try {
			properties.load(new FileInputStream("src//test//resources//Config//env.properties"));
			value = properties.getProperty(key);
		} catch (IOException e) {
			throw new RuntimeException("Please review your properties file");
		}
		return value;
	}

}
