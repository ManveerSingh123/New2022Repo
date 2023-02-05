package SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictilyWait {
	 public static void main(String args [])
	 { System.getProperty("webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com");
		//	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(4));
		//	WebDriverWait w=new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
			
			WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
					
				WebElement email=driver.findElement(By.id("email"));
				email.sendKeys("abc");
				WebElement pswd=driver.findElement(By.id("pass"));
				pswd.sendKeys("abc123");
				
				
				pswd.clear();
				pswd.sendKeys("Hello");
				w.until(ExpectedConditions.presenceOfElementLocated(By.name("login")));
				WebElement log=driver.findElement(By.name("login"));
						log.click();
	 }

}
