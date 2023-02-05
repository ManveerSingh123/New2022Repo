package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDemo {
	
	public static void main(String args [])
	{
		System.setProperty("Webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Actions action=new Actions(driver);
		
	WebElement ele=	driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
	//	action.moveToElement(ele).contextClick().build().perform();
	
	int x=ele.getLocation().getX();
	int y=ele.getLocation().getY();
	
	 // action.moveByOffset(x, y).contextClick().build().perform();
	action.moveToElement(ele, x, y).contextClick().build().perform();
	}
}
