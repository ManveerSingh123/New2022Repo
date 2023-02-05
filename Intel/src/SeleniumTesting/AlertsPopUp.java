package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopUp {
	public static void main(String args []) throws InterruptedException
	{
		// //div[@id='brandsRefinements']/ul/li[2]
		System.setProperty("Webdriver.chrome.driver", "‪D:\\All jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://ksrtc.in/oprs-web/");
        driver.findElement(By.id("corover-close-btn")).click();
        Thread.sleep(1000);
      driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
      Thread.sleep(1000);
     //   driver.findElement(By.className("btn btn-primary btn-lg btn-block btn-booking")).click();
   String   txt=  driver.switchTo().alert().getText();
    System.out.println(txt);
    if(txt.matches("Please select start place.")) {
    	
    	driver.switchTo().alert().accept();
    	
    }
    else {
    	driver.switchTo().alert().dismiss();
    }
	}
	
}
