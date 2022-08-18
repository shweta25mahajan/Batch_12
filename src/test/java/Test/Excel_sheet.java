package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_sheet {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		//email.sendKeys("Test");
		
		WebElement pwd=driver.findElement(By.xpath("//*[@id='pass']"));
		//pwd.sendKeys("12345");
		
		String path="C:\\Users\\HP\\eclipse-workspace\\Batch_12\\src\\test\\java\\Test Data\\Data.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        
        String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(data_1);
        
        email.sendKeys(data_1);
        
        String data_2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
        System.out.println(data_2);
        
        
        
        pwd.sendKeys(data_2);
        
      
	}

}
