package HeadListBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadListBrowserTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		//headlist method
		ChromeOptions obj = new ChromeOptions();
		obj.setHeadless(true);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in/");
		//print titel web page
		
		System.out.println("before search:" + driver.getTitle());
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		//enter search keyword
		
		searchbox.sendKeys("India Gate");
		searchbox.sendKeys(Keys.ENTER);
		
		System.out.println("After search:" + driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.quit();
		
	

	}

}
