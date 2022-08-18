package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Class_Handling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentWindowAdd=driver.getWindowHandle();
		System.out.println(parentWindowAdd);
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> alladdress=driver.getWindowHandles();
		System.out.println(alladdress);
		
		   Iterator<String> it=alladdress.iterator();
	        
	         while(it.hasNext()) {
	        	 
	        	 String childwindowAdd=it.next();
	        	 
	        	 if(!parentWindowAdd.equals(childwindowAdd)) {
	        		 
	        		 driver.switchTo().window(childwindowAdd);
	        		 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@gmail.com");
	        		 driver.close();
	        		 
	        	 }	 
	        }
		
		
	}
	

}
