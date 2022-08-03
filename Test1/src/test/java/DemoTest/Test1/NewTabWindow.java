package DemoTest.Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabWindow {

	private static final String WindowType = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		System.out.println("Frist page" + driver.getTitle());
		
     //   driver.switchTo().new.NewTabWindow.WindowType.w
        
        driver.get("http://www.facebook.com/");
        System.out.println("second tab " + driver.getTitle());
        
        //get window handle
       Set<String> window = driver.getWindowHandles();
       List<String> handle=new ArrayList<String>();
       
       handle.addAll(window);
       
       driver.close();
       driver.switchTo().window(handle.get(0));
       System.out.println("Frist page" + driver.getTitle());
       
		

	}

}
