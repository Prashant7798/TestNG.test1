package HeadListBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlUnitDriverExample {

	public static void main(String[] args) {
	
      //html unit driver browser
        HtmlUnitDriver driver = new HtmlUnitDriver();


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
