package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
		
          WebDriverManager.chromedriver().setup();
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.facebook.com/login/");
          driver.manage().window().maximize();
          
          
          WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
          email.sendKeys("Test@gmail.com");
          
          WebElement pwd=driver.findElement(By.xpath("//*[@id='pass']"));
          pwd.sendKeys("1234567");
          
          WebElement btn_login=driver.findElement(By.xpath("//*[@id='loginbutton']"));
          btn_login.click();
          
          String path="C:\\Users\\HP\\eclipse-workspace\\Batch_12\\src\\test\\java\\ScreenShot";     
          
          String str=RandomString.make(3);
          
          TakesScreenshot ts=(TakesScreenshot)driver;
          File scr=ts.getScreenshotAs(OutputType.FILE);
          File destn=new File(path+"\\test.png");
          FileUtils.copyFile(scr,destn);
          
          
      }

}
