package CookiesDemo;

import java.util.Set;

import org.apache.http.cookie.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesExample {

	public static void main(String[] args) {
		//LAUNCH BROWSER
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.meesho.com/");
		
		//capture all cookies
	     Set<org.openqa.selenium.Cookie> CookiesList = driver.manage().getCookies();
		
		//print no of cookies
		System.out.println("Before adding size" + CookiesList.size());
		
		//name nad value
		for(org.openqa.selenium.Cookie ck:CookiesList)
		{
			System.out.println(ck.getName()+ "" + ck.getValue());
		
		}
		
//		//get spcofic cookies according to name
//	//	System.out.println(driver.manage().getCookieNamed("_pxff_ddtc1"));
//		
//		//create cookie 
//		org.openqa.selenium.Cookie cook= new org.openqa.selenium.Cookie("testCookie" , "www.flipkart.com/");
//		
//		//add cookie to browser
//		driver.manage().addCookie((org.openqa.selenium.Cookie) cook);
//		
//		for (org.openqa.selenium.Cookie ck:CookiesList)
//		{
//			Set<org.openqa.selenium.Cookie> CookiesList1 = driver.manage().getCookies();
//		}
//		

		driver.quit();
	}

}
