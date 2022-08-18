package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Perform {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement drop_selenium=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(drop_selenium).click(drop_selenium).build().perform();
		
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='right click me']"));
		act.contextClick(rightclick).click(rightclick).build().perform();
		
		WebElement double_click=driver.findElement(By.xpath("//button[@ondblclick='Double-Click Me To See Alert']"));
		act.doubleClick(double_click).click(double_click).build().perform();
	}

}
