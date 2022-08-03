package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo
{
	@Test
	public void TestMethod()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		SoftAssert soft = new SoftAssert();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("verifying titel.....");
		String expectedTitle = "Automation Testing Practice1";
		String actualTitle = driver.getTitle();
	//	Assert.assertEquals(expectedTitle,actualTitle,"Title verify");
		soft.assertEquals(expectedTitle,actualTitle,"Title verify");
		
		System.out.println("verifying presence of wikipedia-icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
	//	Assert.assertTrue(icon.isDisplayed());
		soft.assertTrue(icon.isDisplayed());
		
		
		System.out.println("verifying presence of wikipedia search button");
		WebElement icon2 = driver.findElement(By.className("wikipedia-search-button"));
	//	Assert.assertTrue(icon2.isDisplayed());
		soft.assertTrue(icon2.isDisplayed());
		
		driver.close();
		
		//report all failure message	
		//soft.assertAll();
		
		
	}

}
