package SeleniumTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFileDownload {

	public static void main(String args []) throws InterruptedException, AWTException
	{
		// //div[@id='brandsRefinements']/ul/li[2]
		System.setProperty("Webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//div[@class='card-body']/p[contains(text(),'Latest stable version')]/a")).click();
// driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/p[1]")).click();

          Robot r=new Robot();
          
          r.keyPress(KeyEvent.VK_TAB);
          r.keyPress(KeyEvent.VK_TAB);
          r.keyPress(KeyEvent.VK_TAB);
          
          r.keyRelease(KeyEvent.VK_TAB);
          
          r.keyPress(KeyEvent.VK_ENTER);
          r.keyRelease(KeyEvent.VK_ENTER);
          
	}
}
