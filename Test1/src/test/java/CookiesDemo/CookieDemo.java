package CookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieDemo 
{

	public static void main(String[] args) 
	 {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		
		Set<Cookie>CookiesList=driver.manage().getCookies();
		
		System.out.println( CookiesList.size());
		
		for(Cookie ck:CookiesList)
		{
			System.out.println(ck.getName() + " " + ck.getValue());
		}
		
		driver.quit();
		
	}

}
