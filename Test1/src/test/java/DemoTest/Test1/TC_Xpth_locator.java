package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Xpth_locator
{

	public static void main(String[] args) throws IllegalStateException, Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        
        //website
        driver.get("https://www.saucedemo.com/");
        
        //username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        Thread.sleep(1000);
        //password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        
        //login button
        driver.findElement(By.className("submit-button")).click();
        
        //switch to product page
        String currWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currWindowHandle);
        
        //locate sauce labs bolt T-shirt
       List<WebElement> element= driver.findElements(By.partialLinkText( "Sauce"));
       System.out.println("element size:"+ element.size());
       
        
	}

}
