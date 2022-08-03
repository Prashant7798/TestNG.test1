package DemoTest.Test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver.", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.uitestpractice.com/");
		
		WebElement sect=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/button"));
		
		//screen shot capture
		//step1--convert web driver obj to takes screen shot interface
		TakesScreenshot scr=((TakesScreenshot)driver);
		//step2--call getscreenshot method to image file
		
		File fr=scr.getScreenshotAs(OutputType.FILE);
		
		File des=new File("E:\\WORKSPACE\\Test1\\ScreenShot\\dubleclick.png");
		
		//step 3 copy image to destination
		FileUtils.copyFile(fr, des);
		
		

	}

}
