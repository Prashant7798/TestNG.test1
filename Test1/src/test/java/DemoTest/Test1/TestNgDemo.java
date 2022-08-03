package DemoTest.Test1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNgDemo
{
	@Test
	public void verifyPageTitle() 
	{
		//launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open url
		driver.get("http://www.googel.com");
		
		String actualTitle = "Google";
		String expectedTitle = driver.getTitle();
		
		//verification method
		Assert.assertEquals("actualTitle", "expectedTitle");
		
		driver.quit();
		
		
	}
	

}
