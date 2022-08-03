package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipArea {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		String str=driver.findElement(By.xpath("//*[@id=\"age\"]")).getAttribute("title");
		((JavascriptExecutor)driver).executeAsyncScript("arguments[0].scrollIntoView(true);",str);
		Thread.sleep(3000);
	//	Actions act=new Actions(driver);
		
		
		String st="We ask for your age only for statistical purposes.";
		
		//Thread.sleep(3000);
		
		if(str.equals(st))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		

	}

}
