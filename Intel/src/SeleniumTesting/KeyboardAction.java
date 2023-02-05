package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	
	public static void main(String args [])
	{
		System.setProperty("Webdriver.chrome.driver", "\"‪D:\\\\All jar\\\\chromedriver_win32\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Actions action=new Actions(driver);
		
		WebElement mail=driver.findElement(By.id("email"));
		mail.sendKeys("ABC");
		
		action.click(mail).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL)
		.click(driver.findElement(By.name("pass"))).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
		.click(driver.findElement(By.name("login"))).build().perform();
		
		
		
		
	}

}
