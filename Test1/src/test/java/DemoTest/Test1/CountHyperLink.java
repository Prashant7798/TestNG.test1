package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLink {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch browser
		driver.get("https://www.calculator.net/");
        //a=anchor tag
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("Total size "+link.size( ) );
		for(WebElement el:link)
		{
			System.out.println(el.getText());
		}
		driver.close();
		

	}

}
