package com.launcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static String projectPath= System.getProperty("user.dir");
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	public static Properties orProp;
//	public static WebDriverWait wait;
	
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
 
 fis=new FileInputStream(projectPath+"\\src\\test\\resources\\or.properties");
orProp= new Properties();
orProp.load(fis);
 
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
		//	option.addArguments("--proxy-server=https://192.168.10.1:9090");
		//	option.addArguments("--ignore-certificate-erros-spki-list");
			
			
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
		//	driver.manage().window().maximize();
	}

	public static void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
	}
	
	public static void clickElement(String locatorkey) {
		
	//	driver.findElement(By.xpath(orProp.getProperty(locatorkey))).click();
		getElement(locatorkey).click();
	}


	public static void typeText(String locatorkey, String text) {
		
	//	driver.findElement(By.name(locator)).sendKeys(text);
	//	driver.findElement(By.name(orProp.getProperty(locatorkey))).sendKeys(text);
		getElement(locatorkey).sendKeys(text);
	}

	public static void selectOption(String locatorkey, String option) {
	//	driver.findElement(By.id(orProp.getProperty(locatorkey))).sendKeys(option);
		getElement(locatorkey).sendKeys(option);
		
	}
public static WebElement getElement(String locatorkey) {
		 
	WebElement element=null;
	
	//check for Element present 
	if(!isElementPresent(locatorkey))
		//report is failure
		System.out.println("Element is not present : " + locatorkey);
	
	driver.findElement(getLocator(locatorkey));
	
	/*	if(locatorkey.endsWith("_id")) {
		element =driver.findElement(By.id(orProp.getProperty(locatorkey)));
	}
	else if(locatorkey.endsWith("_name")) {
		driver.findElement(By.name(orProp.getProperty(locatorkey)));
		
	}
	
	else if(locatorkey.endsWith("_classname")) {
		driver.findElement(By.className(orProp.getProperty(locatorkey)));
		
	}
	else if(locatorkey.endsWith("_xpath")) {
		driver.findElement(By.xpath(orProp.getProperty(locatorkey)));
		
	}
	else if(locatorkey.endsWith("_cssselector")) {
		driver.findElement(By.cssSelector(orProp.getProperty(locatorkey)));
		
	}
	else if(locatorkey.endsWith("_linktext")) {
		driver.findElement(By.linkText(orProp.getProperty(locatorkey)));
		
	}
	else if(locatorkey.endsWith("_partiallinktext")) {
		driver.findElement(By.partialLinkText(orProp.getProperty(locatorkey)));
		
	} */
	return element;
		
	}

@SuppressWarnings("deprecation")
public static boolean isElementPresent(String locatorkey) {
	System.out.println("Checking for Element present : " + locatorkey);
	

	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorkey)));
	
/*	if(locatorkey.endsWith("_id"))
	{
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orProp.getProperty(locatorkey))));
	}else if(locatorkey.endsWith("_name")) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orProp.getProperty(locatorkey))));
	}
	
	else if(locatorkey.endsWith("_cass")) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(orProp.getProperty(locatorkey))));
	}
	else if(locatorkey.endsWith("_classname")) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orProp.getProperty(locatorkey))));
	}
	else if(locatorkey.endsWith("_xpath")) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orProp.getProperty(locatorkey))));
	}
	else if(locatorkey.endsWith("_linktext")) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orProp.getProperty(locatorkey))));
	}
	else if(locatorkey.endsWith("_partiallinktext")) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(orProp.getProperty(locatorkey))));
	}
	*/
	return false;
}

 public static By getLocator(String locatorkey) {
	 By by=null;
	 
	 if(locatorkey.endsWith("_id")) {
		 by=By.id(orProp.getProperty(locatorkey));
	 }else if(locatorkey.endsWith("_name")) {
		 by=By.name(orProp.getProperty(locatorkey));
	 }
	 else if(locatorkey.endsWith("_classname")) {
		 by=By.className(orProp.getProperty(locatorkey));
	 }
	 else if(locatorkey.endsWith("_xpath")) {
		 by=By.xpath(orProp.getProperty(locatorkey));
	 }
	 else if(locatorkey.endsWith("_css")) {
		 by=By.cssSelector(orProp.getProperty(locatorkey));
	 }
	 else if(locatorkey.endsWith("_linktext")) {
		 by=By.linkText(orProp.getProperty(locatorkey));
	 }
	 else if(locatorkey.endsWith("_partiallinktext")) {
		 by=By.partialLinkText(orProp.getProperty(locatorkey));
	 }
	 
	 return by;
 }
}
