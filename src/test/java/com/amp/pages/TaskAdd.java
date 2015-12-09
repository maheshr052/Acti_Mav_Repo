package com.amp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.amp.util.BasePageObject;

public class TaskAdd extends BasePageObject
{
	TaskAdd(WebDriver driver)
	{
		super(driver);
	}
	/***********************UI Elements***************************************/
	By successMsg=By.className("successmsg");
	
	/************************Variables*****************************************/
	String actCustSuccessMsg;
	
	
	
	
	public String verifySuccessMsg(String expCustSuccessMsg) throws Exception
	{
		try
		{
		actCustSuccessMsg=uiDriver.findElement(successMsg).getText();
		Assert.assertEquals(actCustSuccessMsg, expCustSuccessMsg);
		return actCustSuccessMsg;
		}
		catch(Exception e)
		{
			throw new Exception("Success message is not displayed/matching with actual"+e.getLocalizedMessage());
		}
	}
	

}
