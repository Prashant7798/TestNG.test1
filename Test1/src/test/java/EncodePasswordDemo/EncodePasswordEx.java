package EncodePasswordDemo;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodePasswordEx 
{

	public static void main(String[] args) 
	{
		
//		//encode password
//		String password = "admin123";
//		
//		byte[] encodedpassowrd = Base64.encodeBase64(password.getBytes());
//	
//	System.out.println(new String(encodedpassowrd));
//		
		
		//launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//password decode
		byte[] decodedpassowrd = Base64.decodeBase64("YWRtaW4xMjM=");
		
		
		//enter passsword
		driver.findElement(By.id("txtPassword")).sendKeys(new String(decodedpassowrd));
		
		driver.findElement(By.id("btnLogin")).click();
	
		

	}

}
