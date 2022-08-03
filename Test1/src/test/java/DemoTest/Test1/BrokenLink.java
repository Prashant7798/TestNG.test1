package DemoTest.Test1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	    driver.get("http://deadlinkcity.com/");
	    List<WebElement> link=driver.findElements(By.tagName("a"));
	    
	    int resCode = 200; //validlink
	    int brokenlinkcnt=0;
	    
	    System.out.println("total link on page:" + link.size());
	    for(WebElement ele:link)
	    {
	    	String u=ele.getAttribute("herf");
	    	try
	    	{
	    	URL url=new URL(u);
	    	HttpsURLConnection huc=(HttpsURLConnection) url.openConnection();
	    	huc.setRequestMethod("HEAD");
	    	huc.connect();
	    	resCode =- huc.getResponseCode();
	    	
	    	if(resCode<=400)
	    	{
	    		System.out.println(url+ "Broken link");
	    		brokenlinkcnt++;
	    		
	    	}
	    	
	    	}
	    	catch(MalformedURLException e)
	    	{
	    		
	    	}
	    	catch(Exception e)
	    	{
	    		
	    	}
	    }
	    System.out.println("Total broken link count " +brokenlinkcnt );
	    
	    
		

	}

}
