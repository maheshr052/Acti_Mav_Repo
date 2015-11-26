package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.util.BasePageObject;

public class UsernamePasswordFindPage extends BasePageObject
{

	public UsernamePasswordFindPage( WebDriver driver) 
	{
		super(driver);
	}
	public static Logger Log= Logger.getLogger(Logger.class.getName());
	
	By CancelButton= By.id("ctl00_ContentPlaceHolder1_wzdRecoverPassword_btnCancel");
	
	
	boolean flag;
	
	
	/********************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	public boolean verifyCancelButton() throws Exception
	{
		Log.info("Verification of Cancel Button");
		
		try {
			flag=isElementPresent(CancelButton);
			Assert.assertTrue(flag, "Cancel Button is missing");
			return flag;
			
		} catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE CANCEL BUTTON " + "\n verifyCancelButton " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return LoginPage
	 */
	public LoginPage clickOnCancelButton() throws Exception
	{
		Log.info("Clicking on cancel button");
		try {
			uiDriver.findElement(CancelButton).click();
			
		} catch (Exception e) {
			throw new Exception("FAILED TO CLICK ON CANCEL BUTTON " + "\n clickOnCancelButton " + e.getLocalizedMessage());
		}
		return new LoginPage(uiDriver);
	}
}
