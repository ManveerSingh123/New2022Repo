package SeleniumTesting;

import java.util.Collection;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsByTagName {
	public static void main(String args [])
	{
System.getProperty("webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
     java.util.List<WebElement> allEle= driver.findElements(By.tagName("img"));
     java.util.List<WebElement> allEle1= driver.findElements(By.tagName("a"));
     
		 System.out.println(allEle.size());
		 System.out.println(allEle1.size());
		 
		 for(int e=0;e<allEle1.size();e++)
		 {
			 
			 System.out.println(allEle1.get(e).getText());
			// allEle1.get(e);
		 }
	}

}
