package SeleniumTesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "\"‪D:\\\\All jar\\\\chromedriver_win32\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		
		String wind=driver.getWindowHandle();
		System.out.println(wind);
		
		driver.findElement(By.id("terms-link")).click();
		driver.switchTo().window(wind);
		driver.findElement(By.id("privacy-link")).click();
		driver.switchTo().window(wind);
		
	Set<String> allwind=driver.getWindowHandles();	
	System.out.println("Total window is : "+allwind.size());
	System.out.println("Windows is : " + allwind.toString());
		
	}
}
