package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel=new Select(drp_country);
		System.out.println(sel.getFirstSelectedOption().getText());
	
		//selectbyindex
		sel.selectByIndex(4);
		Thread.sleep(5000);
		
		sel.selectByValue("BANGLADESH");
		Thread.sleep(5000);
		
		sel.selectByVisibleText("BRAZIL");
		Thread.sleep(5000);
		  
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			String text=list.get(i).getText();
			System.out.println(text);
			
			if(text.equals("BANGLADESH")) {
				sel.selectByVisibleText("BANGLADESH");
				}
		      }
	     	}
	
	public static void HnadleDropDown(WebElement element,String text) 
	{
		
		Select sel1=new Select(element);
		sel1.selectByVisibleText(text);
		
	}

}
