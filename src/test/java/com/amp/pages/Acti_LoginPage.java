package com.amp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amp.common.NKConstants;
import com.amp.util.BasePageObject;

import junit.framework.Assert;

public class Acti_LoginPage extends BasePageObject
{
	 public Acti_LoginPage(WebDriver driver)
	{
		super(driver);
	}
	 
	 
	 /*************UI Elements****************/
	 
	 By usnField=By.name("username");
	 By pwdField=By.name("pwd");
	 By subBtn=By.xpath("//input[contains(@value,'Login now')]");
	 By loginTxtEle=By.xpath("//table[@class='tooltip in']//td[2]");
	 
	 
	 
	 /**************Variables****************/
	 String loginTitle=null;
	 Boolean flag;
	 String loginText;
	 
	 
	 
	 public Boolean verifyUsernameTextBox() throws Exception
	 {
		 try
		 {
			 flag=isElementPresent(usnField);
			 org.testng.Assert.assertTrue(flag, "username field is not displayed..");
			 return flag;
		 }
		 
		 catch(Exception e)
		 {
			 throw new Exception("FAILED VERIFYING THE USERNAME TEXTBOX " +e.getLocalizedMessage());
		 }
		 
	 }
	 
	 public Boolean verifyPassowrdBox() throws Exception
	 {
		 try
		 {
			 flag=isElementPresent(pwdField);
			 org.testng.Assert.assertTrue(flag, "Passwrod field is not displayed...");
			 return flag;
		 }
		 catch(Exception e)
		 {
			 throw new Exception("FAILED VERIFYING THE USERNAME TEXTBOX " +e.getLocalizedMessage());
		 }
	 }
	 
	 public Boolean verifySubmit() throws Exception
	 {
		 try
		 {
			 flag=isElementPresent(subBtn);
			 org.testng.Assert.assertTrue(flag, "Submit button not displayed..");
			 return flag;
			 
		 }
		 catch(Exception e)
		 {
			 throw new Exception("FAILED IN VERIFYING THE SUBMIT BUTTON"+e.getLocalizedMessage());
					 
					 
		 }
	 }
	 
	 
	 
	 public void verifyLoginText() throws Exception
	 {
		 try
		 {
			 loginText=getText(loginTxtEle);
			 verifyTextPresent(NKConstants.expLoginText,loginTxtEle);
			 			 
		 }
		 catch(Exception e)
		 {
			 throw new Exception("FAILED TO VERIFY THE LOGIN TEXT"+e.getLocalizedMessage());
		 }
	 }
	 
	 
	 public LoginHomePage login(String usn,String pwd) throws Exception
	 {
		 try
		 {
			 uiDriver.findElement(usnField).sendKeys(usn);
			 uiDriver.findElement(pwdField).sendKeys(pwd);
			 uiDriver.findElement(subBtn).click();	
			 return new LoginHomePage(uiDriver);
		 }
		 catch(Exception e)
		 {
			 throw new Exception("FAILED TO lOGIN ACTITIME"+e.getLocalizedMessage());
		 }
	 }
	

}
