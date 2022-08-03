package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		List<WebElement> link=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total no of radio button "+ link.size());
		driver.close();

	}

}
