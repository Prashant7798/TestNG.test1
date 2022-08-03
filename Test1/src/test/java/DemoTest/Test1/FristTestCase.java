package DemoTest.Test1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FristTestCase 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//launch googel
	//	driver.get("http:\\www.googel.com");
		//or
		driver.navigate().to("http:\\www.googel.com");
		
		//capture title of webpage and print
		String title= driver.getTitle();
		
		System.out.println("Page Title : "+ title);
		
		//capture the url webpage
		driver.getCurrentUrl();
	    System.out.println("URL: "+ driver.getCurrentUrl());
	    
	    //capture page sources
	 //   System.out.println("page source:" +driver.getPageSource());
	    
	    driver.close();

	}   

}
