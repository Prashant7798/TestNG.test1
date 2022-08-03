package PropertiesFielDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFile {

	public static void main(String[] args) 
	{
		//launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		ReadConfigFile config = new  ReadConfigFile();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get(config.getUrl());
		
		driver.findElement(By.id("textUsername")).sendKeys("Admin ");
		//driver.get(config.getusername());
		
		driver.findElement(By.id("textPassword")).sendKeys("admin123");
		//driver.get(config.getpassword());
		
		driver.findElement(By.id("btnLogin")).click();
	

	}

}
