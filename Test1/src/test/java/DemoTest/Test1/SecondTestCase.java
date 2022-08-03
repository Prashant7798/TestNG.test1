package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		//launch browser
        WebDriver driver = new ChromeDriver();
        //open web page sauce
        driver.get("http://www.saucedemo.com");
        
        //using single elemnet
       // driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        //or by get xpath is manually
        driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
        
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        
        String currWindHandle =driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	}

}
