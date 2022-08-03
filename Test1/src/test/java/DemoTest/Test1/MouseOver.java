package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		

	}

}
