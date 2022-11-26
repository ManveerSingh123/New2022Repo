package com.launcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static String projectPath= System.getProperty("user.dir");
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	
	{
		// FileInputStream fis= new FileInputStream("D:\\JavaPrograms\\MySeleniumPratice\\src\\test\\resources\\data.properties");
	System.out.println(projectPath);
		 fis= new FileInputStream(projectPath+"\\src\\test\\resources\\data.properties");
	    p=new Properties();
		p.load(fis);
	//	String e= p.getProperty("chromebrowser");
	//	System.out.println(e);
		
  fis=new FileInputStream(projectPath+"\\src\\test\\resources\\environment.properties");
 mainProp= new Properties();
 mainProp.load(fis);
String e= mainProp.getProperty("env");
 System.out.println(e);
 
 fis=new FileInputStream(projectPath+"\\\\src\\\\test\\\\resources\\"+e+".properties");
 childProp=new Properties();
 childProp.load(fis);
 String url=childProp.getProperty("amazonurl");
 System.out.println(url);
	}
	
	public static void launch(String browser)
	
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\manveer.kumar\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
			option.addArguments("--disable-notification");
			option.addArguments("--start-maximized");
			driver=new ChromeDriver(option);
					
			
		}else if(p.getProperty(browser).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}else if(p.getProperty(browser).equals("ie"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new InternetExplorerDriver();
		}
			
	}

	public static void navigate(String url)
	{
		driver.get(childProp.getProperty(url));
	}
}
