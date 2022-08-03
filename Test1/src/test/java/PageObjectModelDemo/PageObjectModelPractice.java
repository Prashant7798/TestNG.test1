package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModelDemo.GoogelPage;
public class PageObjectModelPractice {

	
	private static final String GoogelPages = null;
	private static WebDriver driver=null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "E:\\WORKSPACE\\TestNG\\src\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in/");
		
		((WebElement) GoogelPage.textbox_search(driver)).sendKeys("ABCD");
		GoogelPage.buytton_search(driver).submit();
		
		
		
		
//		driver.findElement(By.name("q")).sendKeys("ABCD");
//		driver.findElement(By.name("btnK")).submit();

	}

}
