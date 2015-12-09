package com.amp.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContextClickTest
{
	
	WebDriver uidriver;
	
	By linkele=By.partialLinkText("Resources");
//	@Test
//	public void RightClick()
//	{
//		WebDriver driv=new FirefoxDriver();
//		driv.manage().window().maximize();
//		driv.get("https://www.google.co.in/?gfe_rd=cr&ei=cyhhVvm5EOPK8gePt4igAQ&gws_rd=ssl");
//		WebElement linkele = driv.findElement(By.partialLinkText("Resources"));
//		Actions act=new Actions(driv);
//		act.contextClick(linkele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//		
//	}
	
	
	@BeforeTest
	 public void setup()
	 {
	  uidriver= new FirefoxDriver();
	  uidriver.get("http://google.com");
	  uidriver.manage().window().maximize();
	  uidriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	 
	 @AfterTest
	 public void teardown()
	 {
		 
//	  uidriver.quit();
	 }
	 
	 @Test
	 public void googleaboutRightClick() throws Exception
	 {
	  
	  WebElement aboutlink= uidriver.findElement(linkele);
	  
	  Actions actresource= new Actions(uidriver);
	  actresource.moveToElement(aboutlink).build();
	  actresource.contextClick(aboutlink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//	  Thread.sleep(8000);
	  uidriver.get(uidriver.getCurrentUrl());
//	  uidriver.get(uidriver.navigate().to(arg0););
//	  actresource.sendKeys(Keys.F5)
	  
	 
	  }
	 

}
