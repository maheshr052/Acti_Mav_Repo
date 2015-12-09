package com.amp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownLoad1 
	{
		public static void main(String[] args) 
		{
			FirefoxProfile profobj=new FirefoxProfile();
			profobj.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv");
			//profobj.setPreference("browser.download.folderList", 0);
			
			profobj.setPreference("browser.download.folderList", 2);
			profobj.setPreference("browser.download.dir", "D:\\FileDown");
			
			
			WebDriver driv=new FirefoxDriver(profobj);
			driv.manage().window().maximize();
			driv.get("http://qsih-00268:8085/login.do");
			WebElement ele =driv.findElement(By.name("username"));
			ele.sendKeys("admin");
			driv.findElement(By.name("pwd")).sendKeys("manager");
			
			driv.findElement(By.xpath("//input[@type='submit']")).click();
			
			driv.findElement(By.linkText("Reports")).click();
			driv.findElement(By.name("genCSV")).click();
			
		}

	}


