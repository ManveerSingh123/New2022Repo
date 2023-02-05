package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String args []) throws InterruptedException
	{
System.getProperty("webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	//	driver.findElement(By.linkText("Forgotten password?")).click();
	//	driver.findElement(By.partialLinkText(" password?")).click();
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement pl=driver.findElement(By.id("privacy-link"));
		boolean dp=pl.isDisplayed();
		System.out.println(dp);
		
		System.out.println(pl.isDisplayed());
		System.out.println(pl.isEnabled());
		System.out.println(pl.isSelected());
		
				pl.click();
				
		
		driver.close();
		
	}
}
