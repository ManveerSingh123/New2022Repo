package com.launcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    public static FileInputStream fis;
	public static WebDriver driver;
	public static String projectPath= System.getProperty("user.dir");
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	
	public static void init() throws Exception
	{
		//FileInputStream fis=new FileInputStream("D:\\JavaPrograms\\DurgaMySelenium\\src\\test\\resources\\data.properties");
		
    fis=new FileInputStream(projectPath+"\\src\\test\\resources\\data.properties");
	System.out.println(projectPath);
	 p=	new Properties();
	p.load(fis);
//	String e=p.getProperty("browser");
//	System.out.println(e);
	
	fis = new FileInputStream(projectPath+"\\src\\test\\resources\\environment.properties");
	mainProp=new Properties();
	mainProp.load(fis);
	String e= mainProp.getProperty("env");
	System.out.println(e);
	
	fis = new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
	
	childProp=new Properties();
	childProp.load(fis);
	String url=childProp.getProperty("amazonurl");
	System.out.println(url);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	} 
		else if(p.getProperty(browser).equals("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile =	p.getProfile("ManveerProfile");
		
		FirefoxOptions option =new FirefoxOptions();
		option.setProfile(profile);
		
		//Disable browser notification
		profile.setPreference("dom.webnotifications.enabled", false);
		
		//Handling certificate error
		
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		
		//work with proxy settings 
		
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.socks", "192.168.10.1");
		profile.setPreference("network.proxy.socks_port", 1744);
		
		
	
		//profile.setPreference("dom.webnotifications.enabled", false);
		 driver =new FirefoxDriver(option);
			
			//driver=new FirefoxDriver();
		}
		else if(p.getProperty(browser).equals("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
	
}

  public static void navigate(String url)
  {
	 // driver.get(childProp.getProperty(url));
	  driver.navigate().to(childProp.getProperty(url));
  }
}