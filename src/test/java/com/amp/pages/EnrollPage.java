package com.amp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amp.common.NKConstants;
import com.amp.util.BasePageObject;


import org.testng.Assert;

public class EnrollPage extends BasePageObject
{

	public EnrollPage(WebDriver driver) 
	{
		super(driver);		
		
	}
	public static Logger Log= Logger.getLogger(Logger.class.getName());
	
	/**********Elements on this page*********************/
	By enroll_form=By.id("ctl00_ContentPlaceHolder1_lblFormTitle");
	By enroll_text1_ele=By.id("ctl00_ContentPlaceHolder1_lblFirstInstruction");
	By enroll_text2_ele=By.id("ctl00_ContentPlaceHolder1_lblSecondInstruction");
	
	
	/*******************Variables***************************************/
	
	String actual_enroll_pagetitle=null;
	
	
	/**************************************************************************************************************************************************/
	/**
	 * @author MRamadurga
	 * @return
	 * @throws Exception 
	 */
	public void verifyEnrollPageDisplay(String exp_enroll_page_title) throws Exception
	{
		try
		{
			 actual_enroll_pagetitle=uiDriver.findElement(enroll_form).getText();
			Assert.assertEquals(actual_enroll_pagetitle.trim(),exp_enroll_page_title.trim(),"Enroll page form Title does not match");
			
		}
		catch(Exception e)
		{
			throw new Exception("error in loading enroll page..."+e.getLocalizedMessage());
		}
	}
	
	/************************************************************************************************************************************************/
	
	/**
	 * @author MRamadurga
	 * @throws Exception 
	 * description: Verifies all the text present in Enroll page
	 */
	
	public void verifyAllEnrollPageText() throws Exception
	{
		try
		{
			verifyTextPresent(NKConstants.EnrollPage_Text1, enroll_text1_ele);
			verifyTextPresent(NKConstants.EnrollPage_text2, enroll_text2_ele);
			
		}
		catch(Exception e)
		{
			throw new Exception("error in verifying all the text of EnrollPage..."+e.getLocalizedMessage());
		}
		
	}
	/************************************************************************************************************************************************/
	/**
	 * @author MRamadurga
	 * Desc: Verifying the display of radio buttons in a page
	 * @throws Exception 
	 * 
	 */
	public void verifyEnrollPageRadioButtons(By radio_ele,String radio_text) throws Exception
	{
		Log.info("Verifying the display of  "+radio_text+" radio button");
		try
		{
			boolean flag=isElementPresent(radio_ele);
			if(flag)
		{
			String radio_act_txt=uiDriver.findElement(radio_ele).getText();
			org.testng.Assert.assertEquals(radio_act_txt.trim(), radio_text.trim(),"Radio button text does not match..");
		}
			else
			{
				Assert.assertEquals(1, 0,"Radio button"+radio_text+" not displayed");
			}
		}
		catch(Exception e)
		{
			throw new Exception("Radio button"+radio_text+" not displayed"+e.getLocalizedMessage());
			
		}
	}
	/************************************************************************************************************************************************/
	
	/**
	 * @author MRamadurga
	 * @throws Exception 
	 * Desc: verifies the display of buttons in the Enroll page
	 */
	
	public void verifyEnrollPageButtons(By Btn_ele,String Btn_desc) throws Exception
	{
		try
		{
			boolean flag=isElementPresent(Btn_ele);
			if(flag)
			{
			String exp_btn_text=uiDriver.findElement(Btn_ele).getAttribute("value");
			org.testng.Assert.assertEquals(Btn_desc.trim(), exp_btn_text.trim(),"Button description doesnot match..");
			}
			else
			{
				Assert.assertEquals(1, 0,"Enroll Page "+Btn_desc+ " Button not displayed..");
			}
			
		}
		catch(Exception e)
		{
			throw new Exception(Btn_desc+" Button is not displayed"+e.getLocalizedMessage());
		}
	}
	
	/************************************************************************************************************************************************/
	
	/**
	 * @author MRamadurga
	 * @throws Exception 
	 * Desc: verifies the Fraud text
	 */
	
	public void verifyFraud_Text_Display(String exp_fraud_txt,By fraud_ele) throws Exception
	{
		boolean flag=isElementPresent(fraud_ele);
		try
		{
			if(flag)
			{
			
			verifyTextPresent(exp_fraud_txt, fraud_ele);
			}
			
			else
			{
				Assert.assertEquals(1, 0,"Fraud text not found");
			}
			
		}
		catch(Exception e)
		{
			throw new Exception("Fraud text not displayed"+e.getLocalizedMessage());
		}
	}

	/************************************************************************************************************************************************/
	
}
