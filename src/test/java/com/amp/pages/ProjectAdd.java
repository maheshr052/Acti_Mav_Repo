package com.amp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amp.common.NKConstants;
import com.amp.util.BasePageObject;

public class ProjectAdd extends BasePageObject
{
	 ProjectAdd(WebDriver driver) 
	 {
		 super(driver);
	}
	 
	 /*******************UIElements********************/
	 By successMsg=By.className("successmsg");
	 By errMessage=By.className("errormsg");
	 By custSelect=By.name("customerId");
	 By projName=By.name("name");
	 By radio_activeProjectsCustomer=By.id("active_projects_action");
	 By radio_add_tasks_action=By.id("add_tasks_action");
	 By radio_add_more_projects=By.id("add_more_projects");
	 By createProjectBtn=By.name("createProjectSubmit");
	 
	 
	 
	
	 /**********************Variables**********************/
	 String actCustSuccessMsg;
	 public static String projnameAndDisplayList;
//	 String projCreateReqErrorMsg=null;
	 
	 
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
	 
	 
	 public String verifyErrorMessage(String expErrorMessage) throws Exception
		{
			try
			{
			actCustSuccessMsg=uiDriver.findElement(errMessage).getText();
			Assert.assertEquals(actCustSuccessMsg, expErrorMessage);
			return actCustSuccessMsg;
			}
			catch(Exception e)
			{
				throw new Exception("Success message is not displayed/matching with actual"+e.getLocalizedMessage());
			}
		}
	 
	 public Customer_Projects addProjectAndListProjectsCustomers() throws Exception
	 {
		 
		 try
		 {
			 projnameAndDisplayList="proj"+System.nanoTime();
			 selectDropDown(custSelect,CustomerAdd.createCustAndListProj);
			 uiDriver.findElement(projName).sendKeys(projnameAndDisplayList);
			 uiDriver.findElement(radio_activeProjectsCustomer).click();
			 uiDriver.findElement(createProjectBtn).click();
			 return new Customer_Projects(uiDriver);
			 
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Unable add the project on selected customer and display active projects and customers "+e.getLocalizedMessage());
		 }
		
	 }
	 
	 public TaskAdd addProjectAndAddTasks() throws Exception
	 {
		 try
		 {
			 selectDropDown(custSelect, CustomerAdd.createCustAndListProj);
			 uiDriver.findElement(projName).sendKeys("proj"+System.nanoTime());
			 uiDriver.findElement(radio_add_tasks_action).click();
			 uiDriver.findElement(createProjectBtn).click();
			 return new TaskAdd(uiDriver);
		 }
		 catch(Exception e)
		 {
			 throw new Exception("unable to add project and display Tasks page "+e.getLocalizedMessage());
		 }
	 }
	 
	 public ProjectAdd addProjectAndAddMoreProj() throws Exception
	 {
		 try
		 {
			 selectDropDown(custSelect, CustomerAdd.createCustAndListProj);
			 uiDriver.findElement(projName).sendKeys("proj"+System.nanoTime());
			 uiDriver.findElement(radio_add_more_projects).click();
			 uiDriver.findElement(createProjectBtn).click();
			 return new ProjectAdd(uiDriver);
		 }
		 catch(Exception e)
		 {
			 throw new Exception("unable to add projects and display add projects page "+e.getLocalizedMessage());
		 }
	 }
	 
	 
	 
		public CustomerAdd createProjectReqError() throws Exception
		{
			try
			{
//				List<WebElement> radios = uiDriver.findElements(custRadios);
				for(int i=1;i<=3;i++)
				{
				uiDriver.findElement(By.xpath("((//input[@type='radio'])["+i+"]")).click();
				uiDriver.findElement(createProjectBtn).click();
//				projCreateReqErrorMsg=uiDriver.findElement(errMessage).getText();
				verifyTextPresent(NKConstants.custCreateMandatoryMsg,errMessage);
				keyBoardAction(Keys.F5);
				}
				return new CustomerAdd(uiDriver);
			}
			catch(Exception e)
			{
				throw new Exception("Issue in verifying the mandatorty fields...  "+e.getLocalizedMessage());
			}
			
		}
	 
	 
}
