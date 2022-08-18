package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {
	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();	
		
		String str=driver.getTitle();
		System.out.println(str);
		
		 String url=driver.getCurrentUrl();	
		 System.out.println(url);
		 
		 driver.navigate().to("https://www.instagram.com/");
		 Thread.sleep(1000);
		 
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 
		 driver.navigate().refresh();
		 driver.close();
	}

}
