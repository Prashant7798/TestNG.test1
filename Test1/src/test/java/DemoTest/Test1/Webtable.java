package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Shree/Desktop/sampletableofhtml3.html");
        String text=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
        System.out.println(text);
       
        //find total rows in webpage
        List<WebElement> list= driver.findElements(By.xpath("//table//tbody//tr"));
        System.out.println("rowa:" + list.size());
        
        //find total; column in webpage
        List<WebElement> list1= driver.findElements(By.xpath("//table//tbody//tr[1]//th"));
        System.out.println("size: "+ list1.size());
        
        for(int i=2; i<=list.size(); i++)
        {
        	for(int j=1; j<=list1.size(); j++)
        	{
        	WebElement dat =driver.findElement(By.xpath("//table//tbody//tr[" +i+ "]/td[" +j+ "]"));
        	System.out.println(dat);
        			
        	}
        }
        
	}

}
