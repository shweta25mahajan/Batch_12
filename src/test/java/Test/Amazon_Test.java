package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Test {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txt_Search=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		txt_Search.sendKeys("Mobile");
 
		WebElement product=driver.findElement(By.xpath("//*[@id='productTitle']"));
		product.click();
		

	}

}
