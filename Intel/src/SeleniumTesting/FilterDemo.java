package SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterDemo {
	public static void main(String args []) throws InterruptedException
	{
		// //div[@id='brandsRefinements']/ul/li[2]
		System.setProperty("Webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		WebElement sr=driver.findElement(By.id("twotabsearchtextbox"));
		sr.sendKeys("phone");
	//	sr.submit();
		sr.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
// WebElement ph=driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/li[last-2]/child :: span"));		
	WebElement ph=driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/li[2]/child :: span"));
	ph.click();
//	WebElement ph=driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/li[2]/descendant :: a"));
   List<WebElement> ph1=driver.findElements(By.xpath("//div[@id='brandsRefinements']/ul/li[2]/preceding-sibling::*"));
	System.out.println(ph1.size());
	}

}
