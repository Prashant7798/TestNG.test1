package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CrossBrowserTestinDemo2 
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launchbrowser(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
		     WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
		     
		     break;
		     
		case "msedge":
			WebDriverManager.edgedriver().setup();
		     driver=new EdgeDriver();
		     
		    break;
		     
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			
			break;
			
			default:
			driver=null;
			
			break;
	
		}
	}
			
			public void verifyTitel()
			{
				//open url
				driver.get("https://www.google.co.in/");
				String expectedTitel = "Google";
				String actualTitel = driver.getTitle();

				Assert.assertEquals(expectedTitel, actualTitel);
			}
			@AfterMethod
			public void closeBrowser()
			{
				driver.quit();

			}
					
	}


