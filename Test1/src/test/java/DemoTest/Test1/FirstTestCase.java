package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase 
{

	public static void main(String[] args) throws IllegalStateException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		//launch browser
        WebDriver driver = new ChromeDriver();
        //open web page syece
        driver.get("http://www.saucedemo.com");
        
        //loacte username tag and id combination
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        
        //locate password
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
        
        //login button tag and class name
        driver.findElement(By.cssSelector("input.submit-button")).click();
        
        //switch to product page
        String currWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currWindowHandle);
        
        //tag.value oc class 
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
        
	}

}
