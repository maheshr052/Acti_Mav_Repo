package com.amp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amp.util.BasePageObject;

public class ProjectAdd extends BasePageObject
{
	 ProjectAdd(WebDriver driver) 
	 {
		 super(driver);
	}
	 
	 /*******************UIElements********************/
	 By custCreateSuccessMsg=By.className("successmsg");
	 
	
	 /**********************Variables**********************/
	 String actCustSuccessMsg;
	 
	 
	 
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
