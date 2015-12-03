package com.amp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.amp.util.BaseTestObject;

public class LoginText 
{
	@Test
	public void test()
	{
		WebDriver driv=new FirefoxDriver();
		driv.get("http://qsih-00268:8085/login.do");
		String text1=driv.findElement(By.xpath("//table[@class='tooltip in']//td[2]")).getText();
		System.out.println(text1);
		
//		String text2=driv.findElement(By.xpath("//table[@class='tooltip in']//center")).getText();
//		System.out.println(text2);
		
		
		
		
	}

}
