package org.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public String getProperty(String filepath, String string) {
		String value=null;
		try {
			FileInputStream input = new FileInputStream(new File(System.getProperty("user.dir"+filepath)));
			Properties property = new Properties();
			property.load(input);
			value =property.getProperty(string);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
}
