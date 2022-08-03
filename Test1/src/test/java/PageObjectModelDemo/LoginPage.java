package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//WithOutPageFactory

public class LoginPage 
{
	WebDriver driver;
	
	//constructor 
	LoginPage(WebDriver d)
	{
		driver = d;
	}
	
	By username = By.id("user-name");
	
	By password = By.id("password");
	
	By loginbutton = By.id("login-button");
	
	public void enterusername(String uname)
	{
		driver.findElement(username).sendKeys("standard_user");
	}
	
	public void enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys("secret_sauce");
	}
	
	
	public void enterlogin(By login)
	{
		driver.findElement(loginbutton).click();
	}
	
	
	
	
	

}
