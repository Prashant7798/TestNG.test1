package DemoTest.Test1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExpliciteWaitDemo {

	private static final Stopwatch StopWatch = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		//ExplicitWait
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		Stopwatch wat=null;
		try {
			wat = StopWatch.createStarted();
		//driver.findElement(By.linkText("START SELLING")).click();
		
			WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
			ele.click();
		}
		
		catch(Exception e)
		{
			wat.stop();
			System.out.println(e);
			System.out.println(wat.elapsed(TimeUnit.SECONDS));
		}
		
	}

}
