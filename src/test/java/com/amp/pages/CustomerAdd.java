package com.amp.pages;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.amp.common.NKConstants;
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
	By successMsg=By.className("successmsg");
	By custCreateReqErrorMsg=By.className("errormsg");
	By custCreateCancel=By.xpath("//input[contains(@value,'Cancel')]");
	
//	By custRadios=By.xpath("//tbody[tr[td[input[@id='active_customers_action']]]]//input");
	
	
	/*********************Variables***************/
	String actCustSuccessMsg;
	public static String createCustAndListProj;
	
	
	public Customer_Projects createCustAndListProj() throws Exception
	{
		try
		{
		Reporter.log("Create customer and display list of project and customers");
		createCustAndListProj="cust"+System.nanoTime();
		uiDriver.findElement(custName).sendKeys(createCustAndListProj);
		uiDriver.findElement(custDescip).sendKeys("Customer Description...");
		uiDriver.findElement(custCreateBtn).click();
		return new Customer_Projects(uiDriver);
		}
		catch(Exception e)
		{
			throw new Exception("unable to create customer and display list of project and customers.."+e.getLocalizedMessage());
		}
		
	}
	
	public ProjectAdd createCustAndCreateProject()
	{
		uiDriver.findElement(custName).sendKeys("cust"+System.nanoTime());
		uiDriver.findElement(custDescip).sendKeys("Customer Description...");
		uiDriver.findElement(createProjCheckBox).click();
		uiDriver.findElement(custCreateBtn).click();
		return new ProjectAdd(uiDriver);
		
	}
	
	
	public CustomerAdd createCustAndAddMoreCust()
	{
		uiDriver.findElement(custName).sendKeys("cust"+System.nanoTime());
		uiDriver.findElement(custDescip).sendKeys("Customer Description...");
		uiDriver.findElement(createMoreCustCheckBox).click();
		uiDriver.findElement(custCreateBtn).click();
		return new CustomerAdd(uiDriver);
		
	}
	
	public CustomerAdd createCustomerReqError() throws Exception
	{
		try
		{
//			List<WebElement> radios = uiDriver.findElements(custRadios);
			for(int i=1;i<=3;i++)
			{
			uiDriver.findElement(By.xpath("(//tbody[tr[td[input[@id='active_customers_action']]]]//input)["+i+"]")).click();
			uiDriver.findElement(custCreateBtn).click();
			verifyTextPresent(NKConstants.custCreateMandatoryMsg,custCreateReqErrorMsg);
			keyBoardAction(Keys.F5);
			}
			return new CustomerAdd(uiDriver);
		}
		catch(Exception e)
		{
			throw new Exception("Issue in verifying the mandatorty fields...  "+e.getLocalizedMessage());
		}
		
	}
	
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
	
	 
	 
	 public void createCustomerCancelButton()
	 {
		 
		uiDriver.findElement(custName).sendKeys("cust"+System.nanoTime()); 
		uiDriver.findElement(custCreateCancel).click();
	 }
	  
}
