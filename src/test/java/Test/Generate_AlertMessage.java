package Test;

import java.io.FileInputStream;

import org.apache.poi.xssf.streaming.DeferredSXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generate_AlertMessage {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		 String path="C:\\Users\\HP\\eclipse-workspace\\Batch_12\\src\\test\\java\\Test Data\\Book1.xlsx";
	     FileInputStream fis=new FileInputStream(path);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     
	   WebElement first_name=driver.findElement(By.xpath("//input[@name='firstName']"));
	   //first_name.sendKeys("shweta");
	   
	   WebElement last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
	  // last_name.sendKeys("mahajan");
	   
	   WebElement phone_no=driver.findElement(By.xpath("//input[@name='phone']"));
	   //phone_no.sendKeys("1234566789");
	   
	   WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
	  // email.sendKeys("test@email.com");
	   
	   WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
	   //address.sendKeys("near bus stand,1st line,latur");
	
	   WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
	  // city.sendKeys("Latur");
	   
	   WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
	  // state.sendKeys("Maharashtra");
	   
	   WebElement post_code=driver.findElement(By.xpath("//input[@name='postalCode']"));
      // post_code.sendKeys("413512");
       
   	WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
	
	Select sel=new Select(drp_country);
	System.out.println(sel.getFirstSelectedOption().getText());

	//selectbyindex
	sel.selectByIndex(4);
	Thread.sleep(5000);
	
	sel.selectByValue("BANGLADESH");
	Thread.sleep(5000);
       
     WebElement user_name=driver.findElement(By.xpath("//*[@id='email']"));  
     user_name.sendKeys("test@email.com");
     
     WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
     pwd.sendKeys("1234@23");
     
     WebElement pwd1=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
     pwd1.sendKeys("1234@23");
     
    
     
     String data_1=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
     System.out.println(data_1);
      first_name.sendKeys(data_1);
     
     String data_2=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
     System.out.println(data_2);
     last_name.sendKeys(data_2);
     
     String data_3=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
     System.out.println(data_3);
     phone_no.sendKeys(data_3);
     
     String data_4=wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
     System.out.println(data_4);
     email.sendKeys(data_4);
     
     String data_5=wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
     System.out.println(data_5);
     address.sendKeys(data_5);
     
     String data_6=wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
     System.out.println(data_6);
     city.sendKeys(data_6);
     
     String data_7=wb.getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
     System.out.println(data_7);
     state.sendKeys(data_7);
     
     String data_8=wb.getSheet("Sheet1").getRow(1).getCell(7).getStringCellValue();
     System.out.println(data_8);
     post_code.sendKeys(data_8);
     
     
     WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
     btn_submit.click();
       
     driver.getTitle();  
     
     driver.navigate().to("https://demo.guru99.com/test/newtours/login.php");
      WebElement name1=driver.findElement(By.xpath("//input[@name='userName']"));
      String data_9=wb.getSheet("Sheet1").getRow(1).getCell(8).getStringCellValue();
      System.out.println(data_9);
      name1.sendKeys(data_9);
      
      WebElement pwd3=driver.findElement(By.xpath("//input[@name='password']"));
      String data_10=wb.getSheet("Sheet1").getRow(1).getCell(9).getStringCellValue();
      System.out.println(data_10);
       pwd3.sendKeys(data_10);
      
      WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
      submit.click();
      
       
       
	}

}
