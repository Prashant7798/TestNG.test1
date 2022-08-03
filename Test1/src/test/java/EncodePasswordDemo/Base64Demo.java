 package EncodePasswordDemo;

import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base64Demo {

	public static void main(String[] args) {

		
//		String password ="secret_sauce";
//		
//		byte[] encodedpassword = Base64.encodeBase64(password.getBytes());
//		System.out.println(new String(encodedpassword));
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		byte[] decodedpassword = Base64.decode("c2VjcmV0X3NhdWNl");
		
		driver.findElement(By.id("password")).sendKeys(new String(decodedpassword));
		
		driver.findElement(By.id("login-button")).click();
	}

}
