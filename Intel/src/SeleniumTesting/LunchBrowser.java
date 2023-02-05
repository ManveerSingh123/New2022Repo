package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {
	
	public static void main (String args []) throws InterruptedException
	{
		System.getProperty("webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	/*	driver.get("https://www.google.com");
		driver.getCurrentUrl();
		driver.getTitle();
		
		WebElement sr=driver.findElement(By.name("q"));
		sr.sendKeys("java");
	//	sr.submit();
		sr.sendKeys(Keys.ENTER);
		*/
		driver.get("https://www.facebook.com");
		
		System.out.println("The url is : " + driver.getCurrentUrl());
		String title=driver.getTitle();
		System.out.println(title);
	//	System.out.println("The title is : "+ driver.getTitle()); Facebook – log in or sign up
		
		if(title.matches("Facebook – log in or sign up"))
				{
			System.out.println("Valid title");
			
		}
		else
		{
			System.out.println("Invalid title");
		}
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abc");
		WebElement pswd=driver.findElement(By.id("pass"));
		pswd.sendKeys("abc123");
		Thread.sleep(2000);
		
		pswd.clear();
		pswd.sendKeys("Hello");
		
		WebElement log=driver.findElement(By.name("login"));
				log.click();
		
		
		
		
		

	}

}
