package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FavebookTooltIP {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String act=driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[1]/a")).getAttribute("titel");
		String act1="Sign up for Facebook";
		
		if(act.equals(act1))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		

	}

}
