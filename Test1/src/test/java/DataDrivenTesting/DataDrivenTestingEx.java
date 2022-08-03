package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTestingEx {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
		//XSSFRow Row;
		//XSSFCell Cell;
		
		//create an object of file class to open file
		
		File excelfile = new File("E:\\excel file 2.xlsx");
		FileInputStream input= null;
		//create object of file inputstread to read data from file
		try {
			 input = new FileInputStream(excelfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Excel --> workbook---> sheet --> row --> cell
		//crreate object XSSFwrokbook to handel xlsx file
	
			try {
				ExcelWBook = new XSSFWorkbook(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//to access work book sheet
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		
		//get total row count
		int tolrow = ExcelWSheet.getLastRowNum() + 1;
		
		//GET TOTAL NO OF CELLS IN ROW
		int ttlcells = ExcelWSheet.getRow(0).getLastCellNum() ;
		
		for(int currentrow=1; currentrow < tolrow; currentrow++)
		{
			
			//lanch browser
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			
			//for strign  format data ( toString Method)
			driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentrow).getCell(0).toString());
			
			//suppose numeric password and username how to get and which method
			//driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentrow).getCell(0).getNumericCellValue());
			
			//boolean value
			//getBooleanCellValue
			
			driver.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(currentrow).getCell(1).toString());
			
			driver.findElement(By.id("login-button")).click();
			
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			for(int currentcell =0; currentcell<ttlcells; currentcell++)
//			{
//				System.out.println(ExcelWSheet.getRow(currentrow).getCell(currentcell).toString());
//				System.out.println("\t");	
//			}
//			System.out.println();
			driver.quit();
		}
		
		
		
		//ExcelWBook.close();
		
		
		
		
	}

}
