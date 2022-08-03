package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureIamgeSource {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo_8ilh img']"));
		
		//capture src attribute value
		
		System.out.println("SRC attribute value" + logo.getAttribute("src"));
		
		driver.quit();
		

	}

}
