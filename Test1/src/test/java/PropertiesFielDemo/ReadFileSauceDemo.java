package PropertiesFielDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileSauceDemo {
	Properties property;
	String path="E:\\WORKSPACE\\Test1\\src\\test\\java\\PropertiesFielDemo\\ConfigPropertySauceDemo";
	

	ReadFileSauceDemo()
	{
		property = new Properties();
		try {
			FileInputStream file = new FileInputStream(path);
			try {
				property.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String geturl()
	{
		String url = property.getProperty("url");
		if(url!=null)
			return url;
		else
			throw new RuntimeException("url is not specified in congig");
	}
	
	public String getusername()
	{
		String username = property.getProperty("username");
		if(username!=null)
			return username;
		else
			throw new RuntimeException("username is not specified in congig");
	}
	
	public String getpassword()
	{
		String password = property.getProperty("password");
		if(password!=null)
			return password;
		else
			throw new RuntimeException("password is not specified in congig");
	}
	
	
	
}
