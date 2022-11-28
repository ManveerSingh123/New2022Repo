package com.launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC__003 extends BaseTest {

	public static void main(String[] args) throws Exception {
		
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		//Static
//		selectOption("searchDropdownBox","Books");
	//	typeText("field-keywords","Harry Potter");
//		typeText("twotabsearchtextbox","Harry Potter");
//		clickElement("//*[@id=\"nav-search-submit-button\"]");
		
		//Dynamic
		
		selectOption("amazonsearchboc_id","Books");
	//	typeText("amazonsearchtextbox_id","Harry Potter");
		typeText("amazonsearchtextbox_id","Harry Potter");
		clickElement("amazonsearchbutton_xpath");
				driver.close();

		
	
	//	WebElement loc=driver.findElement(By.id("searchDropdownBox"));
	//	loc.sendKeys("Books");
		
	//	driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	//	driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
	//	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		

	}

/*	private static void clickElement(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void typeText(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private static void selectOption(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

   */  
       
     
	
	
		
	}


