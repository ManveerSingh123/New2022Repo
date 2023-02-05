package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static void main(String args [])
	{
		System.setProperty("Webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		Actions action=new Actions(driver);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
	WebElement ele1=driver.findElement(By.id("draggable"));
	WebElement ele2=driver.findElement(By.id("droppable"));
		
  action.dragAndDrop(ele1, ele2).perform();
  if(ele2.getText().matches("Dropped!")) {
	  
	  System.out.println("Valid drop");
  }
  else {
	  System.out.println("Invalid drop");
  }
}
}