package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
        if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
        {
        	System.out.println("Test Pass");
        }
        else
        {
        	System.out.println("Test Fail");
        }
        driver.close();
	}

}
