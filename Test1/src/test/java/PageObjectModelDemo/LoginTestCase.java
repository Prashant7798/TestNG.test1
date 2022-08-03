package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//create object login page
		//without page factory
		LoginPage pg=new LoginPage(driver);
		
		//with page factory
		//LoginPage2 pg=new LoginPage2(driver);
		
		driver.get("http://www.saucedemo.com/");
		
		pg.enterusername("standard_user");
		pg.enterpassword("secret_sauce");
		pg.enterlogin(null);
		

	}

}
