package SeleniumTesting;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitHandles {
 public static void main(String args [])
 { System.getProperty("webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(4));
			
			WebElement email=driver.findElement(By.id("email"));
			email.sendKeys("abc");
			WebElement pswd=driver.findElement(By.id("pass"));
			pswd.sendKeys("abc123");
			
			
			pswd.clear();
			pswd.sendKeys("Hello");
			
			WebElement log=driver.findElement(By.name("login"));
					log.click();
 }
}
