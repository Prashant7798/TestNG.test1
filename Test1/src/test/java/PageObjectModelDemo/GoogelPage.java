package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogelPage 
{
	
	//public static WebElement textbox_search(WebDriver driver)
	{
		By driver = null;
		WebElement element = driver.findElement((SearchContext) By.name("q"));
		
	}
	
	public static WebElement buytton_search(WebDriver driver)
	{
		WebElement element = driver.findElement(By.name("btnK"));
		return element;
	}

	public static Object textbox_search(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}


}
