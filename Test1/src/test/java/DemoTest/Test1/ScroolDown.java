package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolDown {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      
      driver.manage().window().maximize();
      
      driver.get("https://www.album.alexflueras.ro/index.php");
      
      JavascriptExecutor js=(JavascriptExecutor)driver;
      
      Thread.sleep(3000);
      
      //scroll by vertical down
//      js.executeScript("window.scrollBy(0,500)");
      
      //scroll till visibility ofwebelement
      
     // WebElement element= driver.findElement(By.linkText("BMI Calculator"));
      
    //  js.executeScript("arguments[0].scrollIntoView();",element);
      
      //to scroll down the web page the bpttom of the page
    //  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      
      //to scroll vertical position
      WebElement Element = driver.findElement(By.id("a7"));
      js.executeScript("arguments[0].scrollIntoView();",Element);
	}
	

}
