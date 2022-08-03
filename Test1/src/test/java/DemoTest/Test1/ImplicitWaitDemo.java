package DemoTest.Test1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWaitDemo {

	private static final Stopwatch StopWatch = null;

	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://sellglobal.ebay.in/seller-center/");
	
	//implicit wait apply
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Stopwatch wat=null;
	try {
		wat = StopWatch.createStarted();
	driver.findElement(By.linkText("START SELLING")).click();
	}
	catch(Exception e)
	{
		wat.stop();
		System.out.println(e);
		System.out.println(wat.elapsed(TimeUnit.SECONDS));
	}
	
	
}

}
