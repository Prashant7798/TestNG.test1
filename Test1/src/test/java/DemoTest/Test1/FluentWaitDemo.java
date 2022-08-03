package DemoTest.Test1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class FluentWaitDemo {

	private static final Stopwatch StopWatch = null;

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		//fluentWait
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver);
				withTimeout(10,TimeUnit.SECONDS);
		        pollingEvery(2,TimeUnit.SECONDS);
		        ingnoring(NoSuchElementException.class);
		        WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
				ele.click();
			
		
//		Stopwatch wat=null;
//		try {
//			wat = StopWatch.createStarted();
//		
//			WebElement elee=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
//			elee.click();
//		}
//		
//		catch(Exception e)
//		{
//			wat.stop();
//			System.out.println(e);
//			System.out.println(wat.elapsed(TimeUnit.SECONDS));
//		}

	}

	private static void ingnoring(Class<NoSuchElementException> class1) {
		// TODO Auto-generated method stub
		
	}

	private static void withTimeout(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

	private static void pollingEvery(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

}
