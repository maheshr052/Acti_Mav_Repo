package com.amp.pages;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.amp.util.BasePageObject;

public class CustomerAdd extends BasePageObject
{

	CustomerAdd(WebDriver driver)
	{
		super(driver);
	}
	
	/***************UI Elements********************/
	
	By custName=By.name("name");
	By custDescip=By.name("description");
	By custCreateBtn=By.name("createCustomerSubmit");
	By createProjCheckBox=By.id("add_project_action");
	By createMoreCustCheckBox=By.id("add_more_customers_action");
	By custCreateSuccessMsg=By.className("successmsg");
	
	
	/*********************Variables***************/
	String actCustSuccessMsg;
	
	
	public Customer_Projects createCustAndListProj()
	{
		
		uiDriver.findElement(custName).sendKeys("custReg11234");
		uiDriver.findElement(custDescip).sendKeys("Customer Description...");
		uiDriver.findElement(custCreateBtn).click();
		return new Customer_Projects(uiDriver);
		
	}
	
	public ProjectAdd createCustAndCreateProject()
	{
		uiDriver.findElement(custName).sendKeys("custReg1213415");
		uiDriver.findElement(custDescip).sendKeys("Customer Description...");
		uiDriver.findElement(createProjCheckBox).click();
		uiDriver.findElement(custCreateBtn).click();
		return new ProjectAdd(uiDriver);
		
	}
	
	
	public CustomerAdd createCustAndAddMoreCust()
	{
		uiDriver.findElement(custName).sendKeys("custRegr123451");
		uiDriver.findElement(custDescip).sendKeys("Customer Description...");
		uiDriver.findElement(createMoreCustCheckBox).click();
		uiDriver.findElement(custCreateBtn).click();
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
