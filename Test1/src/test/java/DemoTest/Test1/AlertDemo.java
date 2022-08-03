package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Switchto");
		//driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
		driver.switchTo().alert().sendKeys("prashant");
		driver.switchTo().alert().accept();
		
		//switch to alert window and accept the alert
	//	driver.switchTo().alert().accept();
		//cancel
		driver.switchTo().alert().dismiss();
		
		
		
				
		

	}

}
