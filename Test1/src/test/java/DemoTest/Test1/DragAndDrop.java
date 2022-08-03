package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\MyGitRepository\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//fine sources and target web element
		WebElement sou=driver.findElement(By.id("box6"));
		Thread.sleep(3000);
		WebElement tar=driver.findElement(By.id("box106"));
		Actions act=new Actions(driver);
		act.dragAndDrop(sou, tar).perform();
		driver.close();
		
		
		

	}

}
