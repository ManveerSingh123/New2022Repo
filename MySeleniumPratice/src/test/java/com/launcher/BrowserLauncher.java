package com.launcher;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauncher {
	
	public static void main(String args [])
	{
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "D:\\MySelenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("https://www.bestbuy.com");
		
	}

}
