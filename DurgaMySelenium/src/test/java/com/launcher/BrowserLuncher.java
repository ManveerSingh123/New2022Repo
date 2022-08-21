package com.launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLuncher {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver obj=new ChromeDriver();
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        
        
        WebDriverManager.firefoxdriver().setup();
      //  System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//FirefoxDriver obj1=new FirefoxDriver();
     //   obj1.get("https://www.amazon.com");
        driver =new FirefoxDriver();
        driver.get("https://www.bestbuy.com");
	}

}
