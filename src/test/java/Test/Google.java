package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/reg/");
	driver.manage().window().maximize();
	
	WebElement first_name=driver.findElement(By.name("firstname"));
	first_name.sendKeys("Test");
	
	WebElement surname=driver.findElement(By.name("lastname"));
	surname.sendKeys("Creation");
	
	WebElement email=driver.findElement(By.name("reg_email__"));
	email.sendKeys("abced@tr");
	
	WebElement pwd=driver.findElement(By.name("reg_passwd__"));
	pwd.sendKeys("Abced@12");
	
	List<WebElement> list = driver.findElements(By.name("birthday_wrapper"));
	
	
	
	
	
	
	

	}



}
