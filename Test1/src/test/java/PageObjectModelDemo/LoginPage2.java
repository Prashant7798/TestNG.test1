package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;

//using page factory
public class LoginPage2 {
	
	WebDriver driver;
	
	
	//consructor
	LoginPage2(WebDriver d)
	{
		driver = d;
		
		//this method will create web element
		PageFactory.initElements(driver, this);
	}
	
	//identify web element
	//identify user name
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	public void enterusername(String uname)
	{
		username.sendKeys("standard_user");
	}
	
	public void enterpassword(String pwd)
	{
		password.sendKeys("secret_sauce");
	}
	
	
	public void enterlogin(By login)
	{
		loginbtn.click();
	}
	
	
	
		
	
	
	

}
