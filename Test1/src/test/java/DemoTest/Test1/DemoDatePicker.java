package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDatePicker {

	public static void main(String[] args) 
	{
		//27-04-1994;
		String expecteddate="04";
	String expectedmonth="September";
	String expectedyear="2022";
	
	//*[@id="ui-datepicker-div"]/div/div/span[1]
	//*[@id="ui-datepicker-div"]/div/div/span[2]
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		//swithch to frame
		driver.switchTo().frame(0);
		
		//find date picker webelement to perform click action
		WebElement date=driver.findElement(By.id("datepicker"));
		date.click();
		
		while(true)
		{
			String cal=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			String caly=driver.findElement(By.xpath("	//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			if(cal.equals(expectedmonth) & caly.equals(expectedyear))
			{
				List <WebElement> day=driver.findElements(By.xpath("//table/tbody/tr/td"));
				for(WebElement e:day)
				{
					String cday=e.getText();
					if(cday.equals(expecteddate))
					{
						e.click();
						break;
					}
				}
				break;
			}
			else
			{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a")).click();	
			}
		}
		

	}

}
