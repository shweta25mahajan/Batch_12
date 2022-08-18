package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		
		WebElement btn_src=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
        WebElement destn=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
       
        WebElement rs=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement amt1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li")); 
        
        WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
        WebElement acc=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
        
        WebElement rs1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement amt2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
        
        
        Actions act1= new Actions(driver);
        act1.dragAndDrop(btn_src, destn).build().perform();
        act1.dragAndDrop(sales, acc).build().perform();
        act1.dragAndDrop(rs, amt1).build().perform();
        act1.dragAndDrop(rs1, amt2).build().perform(); 
        
        controlHandleDragDrop(driver,btn_src,destn);
        controlHandleDragDrop(driver,sales,acc);
        controlHandleDragDrop(driver,rs,acc);
        controlHandleDragDrop(driver,rs1,amt2);
        
      }
	
	public static void controlHandleDragDrop(WebDriver driver,WebElement src,WebElement destn) {
		Actions act=new Actions(driver);
		
		act.dragAndDrop(src, destn).build().perform();
			
	}

}
