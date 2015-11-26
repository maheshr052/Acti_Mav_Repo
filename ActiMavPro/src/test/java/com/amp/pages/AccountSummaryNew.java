package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.util.BasePageObject;



public class AccountSummaryNew extends BasePageObject
{

	public  AccountSummaryNew(WebDriver driver)
	{
		super(driver);
	}
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	By DashBoardMessage= By.id("ctl00_ContentPlaceHolder1_lblAccSumHeadTxt");
	By LoginMessage=By.id("ctl00_lblPatientName");
	By SignOutButton= By.id("ctl00_SignOutButton");
	
	/* Variables*/
	
	String PageTitle=null;
	boolean flag=false;
	String Parent_window=null;
	String Child_window=null;
	String actual_Result=null;
	String expected_Result=null;
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean verifyDashBoardMessage() throws Exception
	{
		Log.info("Verifying the DashBoard Message box is displyed on the Page");
		try 
		{
			flag=isElementPresent(DashBoardMessage);
			Assert.assertTrue(flag, "DashBoardmessage Element Is Missing on the sreen");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE DASHBOARD MESSAGE LABEL " + " \nverifyDashBoardMessage "+ e.getLocalizedMessage() );
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyWelcomeMessage() throws Exception
	{
		Log.info("Verification of Welcome Message");
		try 
		{
			flag=isElementPresent(LoginMessage);
			Assert.assertTrue(flag, "Welcome Message is not  displayed");
			return flag;
		} 
		catch (Exception e)
		{
		throw new Exception("FAILED WHILE VERIFYING THE WELCOME MESSAGE"+ "\n verifyWelcomeMessage"+e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	
	public boolean verifySignOutButton() throws Exception
	{
		Log.info("Verification of Signout button");
		try 
		{
			flag=isElementPresent(SignOutButton);
			Assert.assertTrue(flag, "Signout Button is not displayed");
			return flag;
		} 
		catch (Exception e) 
		{
		throw new Exception("FAILED VERIFYING THE SIGNOUT ELEMENT" + "\n verifySignOutButton" + e.getLocalizedMessage());
		}
		
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	
	public SurveyOptInPage clickOnSignOutButton() throws Exception
	{
		Log.info("Clicking on Signout button");
		try
		{
			uiDriver.findElement(SignOutButton).click();
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING SIGN OUT BUTTON" +"\n clickOnSignOutButton " +e.getLocalizedMessage());
		}
		return new SurveyOptInPage(uiDriver);
		
	}
	
}
