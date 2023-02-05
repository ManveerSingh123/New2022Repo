package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {
	
	public static void main(String args [])
	{
		System.setProperty("Webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Actions action=new Actions(driver);
		
//	WebElement ele1=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	WebElement ele1=driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"));
	WebElement ele2=driver.findElement(By.xpath("//spain[text()='Watchlist']"));
	
	action.moveToElement(ele1).moveToElement(ele2).doubleClick().build().perform();	
		
		
	}

}
