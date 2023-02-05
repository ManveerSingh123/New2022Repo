package SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String args []) throws InterruptedException
	{
System.setProperty("Webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.facebook.com");
	 
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(1000);
	 
	 
	 WebElement day=driver.findElement(By.id("day"));
	 Select s=new Select(day);
	 
		
//	 s.selectByIndex(2);
//	 Thread.sleep(1000);
//	 
//	 s.selectByValue("9");
//	 Thread.sleep(1000);
//	 
//	 s.selectByVisibleText("30");
//	 Thread.sleep(1000);
	 List<WebElement> elist=s.getOptions();
	    System.out.println("Total Day is : "+s.getOptions().size());
	    
	    for(WebElement e:elist)
		{ 
			System.out.println(e.getText());
			if(e.getText().matches("15"))
			{
				System.out.println();
				e.click();
			//	break;
				Thread.sleep(1000);
			}
		}
		WebElement month=driver.findElement(By.id("month"));
		Select m=new Select(month);
		
		List<WebElement> elist1=m.getOptions();
		System.out.println("Total Month is : "+m.getOptions().size());
		
		for (WebElement ms : elist1)
		{
			System.out.println(ms.getText());
			if(ms.getText().matches("May"))
			{
				System.out.println();
				ms.click();
				Thread.sleep(1000);
			}
		}	
		WebElement year=driver.findElement(By.id("year"));
		Select y=new Select(year);
		
		List<WebElement> elist2=y.getOptions();
		System.out.println("Total Year is : "+y.getOptions().size());
		
		for (WebElement ys : elist2)
		{
			System.out.println(ys.getText());
			if(ys.getText().matches("2016"))
			{
				System.out.println();
				ys.click();
				Thread.sleep(1000);
			}
		}
	}
}
