package com.amp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.amp.common.NKConstants;
import com.amp.util.BasePageObject;

public class Customer_Projects extends BasePageObject
{
	
	Customer_Projects(WebDriver driver)
	{
		super(driver);
	}
	
	/**************UI Elements************************/
	By addCustomerBtn=By.xpath("//input[@value='Add New Customer']");
	By successMsg=By.className("successmsg");
	By addProjectBtn=By.xpath("//input[@value='Add New Project']");
	By custSelectInCustomerProjects=By.name("selectedCustomer");
	By showBtnCustomerProjects=By.xpath("//input[contains(@value,'Show')]");
	By searchValCustomer=By.xpath("//tbody[tr[th[contains(text(),'Customer / Project')]]]/tr[2]/td[1]/a[2]");
	By searchValProject=By.xpath("//tbody[tr[th[contains(text(),'Customer / Project')]]]/tr[3]/td[1]/div/a");
	
	
	
	
	/***************Variables*************************/
	String actCustSuccessMsg;
	String actCustSearchResult;
	String actProjSearchResult;
	
	
	
	public CustomerAdd clickAddCustomer() throws Exception
	{
		try
		{
		uiDriver.findElement(addCustomerBtn).click();
		
		return new CustomerAdd(uiDriver);
		}
		catch(Exception e)
		{
			throw new Exception("unable to click on AddCustomer button.."+e.getLocalizedMessage());
		}
	}
	
	public ProjectAdd clickAddProject() throws Exception
	{
		try
		{
		uiDriver.findElement(addProjectBtn).click();
		
		return new ProjectAdd(uiDriver);
		}
		catch(Exception e)
		{
			throw new Exception("unable to click on AddCustomer button.."+e.getLocalizedMessage());
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
	
	
	public void searchProjectsAndCustomers() throws Exception
	{
		try
		{
		
		selectDropDown(custSelectInCustomerProjects, CustomerAdd.createCustAndListProj);
		uiDriver.findElement(showBtnCustomerProjects).click();
		verifyTextPresent(CustomerAdd.createCustAndListProj, searchValCustomer);
		verifyTextPresent(ProjectAdd.projnameAndDisplayList, searchValProject);
		}
		catch(Exception e)
		{
			throw new Exception("Unable to search customer and Projects..."+e.getLocalizedMessage());
		}
		
	}
	

}
