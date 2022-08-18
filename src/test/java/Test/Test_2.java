package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.id("email"));
		txt_email.sendKeys("Test@email.com");
		
		WebElement txt_pwd=driver.findElement(By.id("pass"));
		txt_pwd.sendKeys("abcde@");
		
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
	}

}
