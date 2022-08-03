package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) 
	{
		String expecteddate="04";
		String expectedmonthyear="September2022";
		//String expectedyear="2022";
		
		//*[@id="ui-datepicker-div"]/div/div/span[1]
		//*[@id="ui-datepicker-div"]/div/div/span[2]
		
			
			System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
			//swithch to frame
			
			//find date picker webelement to perform click action
			WebElement date=driver.findElement(By.id("datepicker"));
			date.click();
			
			while(true)
			{
				String calmonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
				//String caly=driver.findElement(By.xpath("	//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
				if(calmonth.equals(expectedmonthyear) & calmonth.equals(expectedmonthyear))
				{
					
					driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[3]/td[4]")).click();
					break;
				}
				else
				{
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]")).click();	
				}
			}
			


	}

}
