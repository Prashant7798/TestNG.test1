package HeadListBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxHeadListBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();

		//headlist method
		FirefoxOptions obj = new FirefoxOptions();
		obj.setHeadless(true);

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in/");
		//print titel web page

		System.out.println("before search:" + driver.getTitle());

		WebElement searchbox = driver.findElement(By.name("q"));

		//enter search keyword

		searchbox.sendKeys("India Gate");
		searchbox.sendKeys(Keys.ENTER);

		System.out.println("After search:" + driver.getTitle());

		//Thread.sleep(3000);

		driver.quit();


	}

}
