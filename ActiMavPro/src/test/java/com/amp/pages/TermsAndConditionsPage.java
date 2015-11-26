package com.pp.pages;

import org.apache.bcel.generic.RETURN;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pp.util.BasePageObject;

public class TermsAndConditionsPage extends BasePageObject
{

	public TermsAndConditionsPage(WebDriver driver) 
	{
		super(driver);
	}
	public static Logger Log= Logger.getLogger(Logger.class.getName());
	
	By TermsAndConditions= By.id("ctl00_ContentPlaceHolder1_lblFormTitle");
	By IdonotAccept=By.id("ctl00_ContentPlaceHolder1_btnDontAccept");
	By Iaccept_Btn=By.id("ctl00_ContentPlaceHolder1_btnAccept");
	
	boolean flag;
	
	/******************************************************************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * 
	 */
	
	
	
	public boolean verifyTermsAndConditonsText() throws Exception
	{
		Log.info("verify Terms and conditions Text");
		
		try {
			flag=isElementPresent(TermsAndConditions);
			return flag;
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED VERIFYING THE TERMS AND CONDITIONS TEXT " +"\n verifyTermsAndConditonsText " +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	public boolean verifyIdonotAcceptbutton() throws Exception
	{
		Log.info("Verification of i do not accept button");
		try {
			flag=isElementPresent(IdonotAccept);
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE I DO NOT ACCEPT TEXT " +"\n verifyIdonotAcceptbutton " +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return 
	 */
	
	public LoginPage clickonIdonotAcceptButton() throws Exception
	{
		Log.info("Clicking on I do not accept button");
		try {
			
			uiDriver.findElement(IdonotAccept).click();
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON I DO NOT ACCEPT BUTTON " +"\n clickonIdonotAcceptButton " +e.getLocalizedMessage());		
			}
		return new LoginPage(uiDriver);
	}
	/******************************************************************************************************************************************************************************************/
	
	/**
	 * @author MRamadurga
	 * @return Enroll Page
	 * @throws Exception 
	 */
	public boolean verifyIAcceptButton() throws Exception
	{
		Log.info("Verifying the IAcceptButton display..");
		try
		{
			boolean flag=isElementPresent(Iaccept_Btn);
			return flag;
		}
		catch(Exception e)
		{
			throw new Exception("I Accept button is not displayed.."+e.getLocalizedMessage());
		}
	}
	
	/***************************************************************************************************************************************************************************************/
	
	/**
	 * @author MRamadurga
	 * @return EnrollPage(uiDriver)
	 */
	public EnrollPage clickOnIAcceptButton() throws Exception
	{
		Log.info("Clicking on the IAccept button..");
		try
		{
			uiDriver.findElement(Iaccept_Btn).click();
			
		}
		catch(Exception e)
		{
			throw new Exception("Failed to click on I Accept button.."+e.getLocalizedMessage());
			
		}
		return new EnrollPage(uiDriver);
	}
	
}
