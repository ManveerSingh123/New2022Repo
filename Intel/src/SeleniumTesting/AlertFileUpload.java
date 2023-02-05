package SeleniumTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFileUpload {
	public static void main(String args []) throws InterruptedException, AWTException
	{
		System.setProperty("Webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
		
		Robot r=new Robot();
		
		StringSelection s=new StringSelection("C:\\Users\\manveer.kumar\\Downloads\\Summary of Bills_2022-23.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
