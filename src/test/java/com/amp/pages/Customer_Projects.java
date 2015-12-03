package com.amp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.amp.util.BasePageObject;

public class Customer_Projects extends BasePageObject
{
	
	Customer_Projects(WebDriver driver)
	{
		super(driver);
	}
	
	/**************UI Elements************************/
	By addCustomerBtn=By.xpath("//input[@value='Add New Customer']");
	By custCreateSuccessMsg=By.className("successmsg");
	
	
	
	/***************Variables*************************/
	String actCustSuccessMsg;
	
	
	
	public CustomerAdd clickAddCustomer()
	{
		uiDriver.findElement(addCustomerBtn).click();
		
		return new CustomerAdd(uiDriver);
	}

	
	public String verifyCustSuccessMsg(String expCustSuccessMsg) throws Exception
	{
		try
		{
		actCustSuccessMsg=uiDriver.findElement(custCreateSuccessMsg).getText();
		Assert.assertEquals(actCustSuccessMsg, expCustSuccessMsg);
		return actCustSuccessMsg;
		}
		catch(Exception e)
		{
			throw new Exception("Success message is not displayed/matching with actual"+e.getLocalizedMessage());
		}
	}
}
