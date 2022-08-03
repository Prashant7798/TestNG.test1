package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.w3c.dom.Document;

public class JavaScriptExecutor {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("http://www.uitestpractice.com/Students/Index");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//enter text in serch box
		js.executeScript("document.getElementById('Search_Data').value='Mahendra';");
		
		//clcik on find button
		WebElement element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/div/span/input[2]"));
		
//		js.executeScript("arguments[0].click();", element);
//		
//		//referch menthod
//		js.executeScript("history.go(0)");
//		
//		//get domain name
//		String domainName=  js.executeScript("return document.domain;").toString();
//		System.out.println("Domain:" + domainName);
//		
//		//title name
//		String titleText =  js.executeScript("return document.title;").toString();
//		System.out.println("title:" + titleText);
//		
//		//url webpage
//		String urll=  js.executeScript("return document.URL;").toString();
//		System.out.println("url:" + urll);
//		
//		//draw broder around web element
//		js.executeScript("arguments[0].style.border = '3px solid red';",element);
//		
//		//to zoom page
//		js.executeScript("document.body.style.zoom='50%'");
		
		//to get height or width of web page
//		System.out.println(js.executeScript("return window.innerHeight;").toString());
//		
//		
//		System.out.println(js.executeScript("return window.innerWidth;").toString());
//		
		//scroll vertical till end
//        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
//		js.executeScript("alert('This is my alert message.');");
		
		js.executeScript("window.location = 'http://www.googel.com'");
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
