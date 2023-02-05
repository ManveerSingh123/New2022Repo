package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String args [])
	{
		System.setProperty("Webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://ksrtc.in/oprs-web/");
		 
		 driver.findElement(By.id("txtJourneyDate")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'31')]")).click();
		 
		 
	}
}
