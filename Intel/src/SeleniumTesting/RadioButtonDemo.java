package SeleniumTesting;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {
	  
	static WebDriver driver;
	public void getMale()
	{
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}
	public void getFemale()
	{
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}
	
	public void allRadio() throws InterruptedException
	{
	//	driver.findElement(By.xpath("//input[@class='_8esa']"));
	//	java.util.List<WebElement> elist=driver.findElements(By.xpath("//input[@class='_8esa']"));
		java.util.List<WebElement> elist=driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("The number of radio button is : " + elist.size());
		
	/*	for(int e=0;e<elist.size();e++)
		{
			elist.get(e).click();
			Thread.sleep(1000);  
		}
		
		*/
		for(WebElement e:elist)
		{ 
			System.out.println(e.getText());
			if(e.getText().matches("Male"))
			{
				e.click();
			//	break;
			}
			
		}
	}
	 
	public static void main(String args []) throws InterruptedException
	{
		
		System.setProperty("Webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
	
      driver=new ChromeDriver();
 
          driver.get("https://www.facebook.com");
          
          driver.findElement(By.xpath("//a[text()='Create new account']")).click();
          Thread.sleep(1000);
          
          RadioButtonDemo r=new RadioButtonDemo();
          r.getMale();
          r.getFemale();
          r.allRadio();
      
	
	}

}
