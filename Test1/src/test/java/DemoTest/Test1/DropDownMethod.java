package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement el=driver.findElement(By.id("input-country"));
		Select drop=new Select(el);
	//	drop.selectByVisibleText("India");
		
		//value select
	//	drop.selectByValue("78");
		
		drop.selectByIndex(26);
		
		//multiple method
		if(drop.isMultiple()==true)
		{
			System.out.println("Drop down is multiplee");
		}
		else
		{
			System.out.println("Dropdown is not multiple");
		}
		List<WebElement> all=drop.getOptions();
		System.out.println("Total option:"+all.size());
		for(WebElement el1:all)
		{
		System.out.println(el1.getText());	
		}
	

	}

}
