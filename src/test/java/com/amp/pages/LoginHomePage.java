package com.amp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amp.util.BasePageObject;

public class LoginHomePage extends BasePageObject 
{
	public LoginHomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	/******************UI Elements*************************************/
	By projectsAndCustomers=By.linkText("Projects & Customers");
	
	
	public Customer_Projects clickOnProjectAndCustomer()
	{
		uiDriver.findElement(projectsAndCustomers).click();
		return new Customer_Projects(uiDriver);
	}

	
}
