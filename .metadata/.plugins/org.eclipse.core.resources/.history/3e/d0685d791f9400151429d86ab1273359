package com.pp.pages;

import org.apache.bcel.generic.RETURN;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.common.NKConstants;
import com.pp.util.BasePageObject;

public class LoginPage extends BasePageObject
{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public static Logger Log= Logger.getLogger(Logger.class.getName());
	
	
	//UI ELEMENTS
	
	By SiteLogo=By.id("ctl00_Header1_headerlink");
	By IamHereText=By.id("ctl00_ContentPlaceHolder1_Login2_lblNewHere");
	By HaveYouBeenProvidedEnrolled=By.id("ctl00_ContentPlaceHolder1_Login2_lblNewPatientPortal");
	By DoYouTempPasswordText=By.id("ctl00_ContentPlaceHolder1_Login2_lblHaveEnrollmentToken");
	By IamNewHerebutton=By.id("ctl00_ContentPlaceHolder1_Login2_btnEnroll1");
	By username=By.id("ctl00_ContentPlaceHolder1_Login2_lblUserName");
	By usernameTextbox=By.id("ctl00_ContentPlaceHolder1_Login2_txtUserName");
	By Password=By.id("ctl00_ContentPlaceHolder1_Login2_lblPassword");
	By PasswordTextbox=By.id("ctl00_ContentPlaceHolder1_Login2_txtPassword");
	By Loginbutton=By.id("ctl00_ContentPlaceHolder1_Login2_btnLogin1");
	By needHelpyourusernameAndPasswordLink=By.id("ctl00_ContentPlaceHolder1_Login2_lnkForgotPassword");
	By questionmarkImage=By.xpath("//div[@id='divLoginHelpText']/img");
	By ErrorMessage1=By.id("ctl00_ContentPlaceHolder1_Login2_lblErrorMessage");
	
	By warningMessage=By.id("ui-dialog-title-dialog1");
	By warningmessageContent=By.id("ctl00_ContentPlaceHolder1_Login2_lblPreLockedWarning");
	By warningClosebutton=By.id("ctl00_ContentPlaceHolder1_Login2_btnCloseHelp");
	By warningResetUsernamePassword=By.id("ctl00_ContentPlaceHolder1_Login2_lnkNeedHelp");
	
	
	
	
	//Variables
	
	boolean flag;
	String PageTitle=null;
	String Parent_Window=null;
	String actual_Result=null;
	String expected_Result=null;
	String Child_Window=null;
	
	/******************************************************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @throws exception
	 * @RETURN boolean
	 * This Method will Verify 
	 * 
	 */
	
	public boolean verifySiteLogo() throws Exception
	{
		Log.info("Verifying Site Log of Login Page");
		try 
		{
			flag=isElementPresent(SiteLogo);
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE SITE LOGO" + "\n verifySiteLogo " + e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return  flag
	 * 
	 */
	public boolean verifyIamNewHereText() throws Exception
	{
		Log.info("Verify I am new here Text ");
		try {
			{
				flag=isElementPresent(IamHereText);
				Assert.assertTrue(flag, "I am New Here text is Missing");
				return flag;
				
			}
		} catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE I AM NEW HERE TEXT" + "\n verifyIamNewHereText  " + e.getLocalizedMessage());
		}
		
	}
/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return  actual_Result
	 * 
	 */
	public String getIamNewHereText() throws Exception
	{
		Log.info("Getting the Text of I am new here and comparing with actual value");
		
		try {
			
			actual_Result=getText(IamHereText).trim();
			Assert.assertEquals(actual_Result, NKConstants.IAMNEWHERE,"I am New Here Text is Not Matching");
			return actual_Result;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE COMPARING  THE I AM NEW HERE TEXT" + "\n getIamNewHereText  " + e.getLocalizedMessage());
		}
	}
	

	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * 
	 */
	public boolean verifyHaveYouBeenProvidedText() throws Exception
	{
		Log.info("Verifiy Have you been provided an enrollment token Text");
		
		try {
			
		flag= isElementPresent(HaveYouBeenProvidedEnrolled);
		Assert.assertTrue(flag, "Have you been provided an enrollment token Text is Missing");
		return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE HAVE YOU BEEN HERE PROVIDED AN ENROLLEMENT TOKEN TEXT" + "\n verifyHaveYouBeenProvidedText" +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return actual_Result
	 */
	
	public String getHaveYouBeenProvidedText() throws Exception
	{
		Log.info("Getting the Text of Have you been provided an enrollment token");
		try {
			
			actual_Result=getText(HaveYouBeenProvidedEnrolled).trim();
			Assert.assertEquals(actual_Result, NKConstants.HaveYouBeenProvided,"Have You Been Text is Not Matching ");
			return actual_Result;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE  HAVE YOU BEEN HERE PROVIDED AN ENROLLEMENT TOKEN TEXT" + "\n getHaveYouBeenProvidedText" +e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * @return flag
	 */
	
	public boolean verifyTemporaryUsernamePasswordText() throws Exception
	{
		Log.info("Verify Do you have a temporary username and password? Text");
		try 
		{
			flag= isElementPresent(DoYouTempPasswordText);
			Assert.assertTrue(flag, "Do you have a temporary username and password? Text is Missing");
			return flag;
		} 
		catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE DO YOU HAVE A TEMPARARY USERNAME AND PASSWORD TEXT  " +"\n verifyTemporaryUsernamePasswordText  " + e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return actual_Result
	 */
	public String getDoYouHaveTempText() throws Exception
	{
		Log.info("getting the Text of do you have temporary username and Password?");
		
		try {
			actual_Result=getText(DoYouTempPasswordText).trim();
			Assert.assertEquals(actual_Result, NKConstants.DoyouhaveTempPassword,"Do you Have Temparary Password is not Matching");
			return actual_Result;
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE COMPARING THE TEXT OF DO YOU HAVE A TEMPARARY USERNAME AND PASSWORD TEXT  " +"\n getDoYouHaveTempText  " + e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * 
	 * 
	 */
	public boolean verifyIamNewHereButton() throws Exception
	{
		Log.info("Verify I am New Here button Text");
		try
		{
			flag=isElementPresent(IamNewHerebutton);
			Assert.assertTrue(flag, "I am New Here text is Missing");
			return flag;
		} 
		catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE I AM NEW HERE BUTTON "+ "\n verifyIamNewHereButton " + e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return TermsAndConditionsPage
	 * 
	 */
	public TermsAndConditionsPage clickOnIamNewHereButton() throws Exception
	{
		Log.info("Clicking on I am new here button");
		try 
		{
			uiDriver.findElement(IamNewHerebutton).click();
			
			
		} 
		catch (Exception e) {
			throw new Exception("FAILED WHILE CLICKING ON I AM NEW HERE BUTTON" + "\n clickOnIamNewHereButton" +e.getLocalizedMessage());
		}
		return new TermsAndConditionsPage(uiDriver);
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	
	public boolean verifyUsernameLabel() throws Exception
	{
		
		Log.info("Verifcation of Username Lebel");
		
		try {
			flag=isElementPresent(username);
			Assert.assertTrue(flag, "Username Lebel is Missing");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE USERNAME LABEL " + "\n verifyUsernameLabel" +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	public boolean verifyUsernameTextbox() throws Exception
	{
		Log.info("Verification of username Text box");
		try {
			flag=isElementPresent(usernameTextbox);
			Assert.assertTrue(flag, "username Textbox is Missing");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE USERNAME TEXTBOX " + "\n verifyUsernameTextbox" +e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return uname
	 */
	public void enterUsername(String uname) throws Exception
	{
		Log.info("username textbox entry");
		try 
		{
			uiDriver.findElement(usernameTextbox).clear();
			uiDriver.findElement(usernameTextbox).sendKeys(uname);
		} 
		catch (Exception e) {
			throw new Exception("FAILED WHILE ENTERING THE USERNAME  " + "\n enterUsername" +e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	public boolean verifyPasswordlabel() throws Exception
	{
		Log.info("Verifcation of Password Label");
		try {
			flag=isElementPresent(Password);
			Assert.assertTrue(flag, "Password Label is Missing");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE PASSWORDLABEL  " + "\n verifyPasswordlabel" +e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	public boolean verifyPasswordTextbox() throws Exception
	{
		Log.info("Verification of Password Text box");
		try {
			
			flag=isElementPresent(PasswordTextbox);
			Assert.assertTrue(flag, "Password Textbox is Missing");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE PASSWORD TEXTBOX  " + "\n verifyPasswordTextbox" +e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return pwd
	 */
	public void enterPassword(String pwd) throws Exception
	{
		Log.info("Entering the Password Text box");
		
		try {
			
			uiDriver.findElement(PasswordTextbox).sendKeys(pwd);
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE ENTERING  THE PASSWORD TEXTBOX  " + "\n enterPassword" +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	
	public boolean verifyLoginbutton()throws Exception
	{
		Log.info("Verification of Login button");
		try {
			flag=isElementPresent(Loginbutton);
			Assert.assertTrue(flag, "Login button is Missing");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE LOGIN BUTTON  " + "\n verifyLoginbutton" +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return 
	 */
	public SecurityQuestion clickOnLoginButton() throws Exception
	{
		Log.info("Clicking on Login button");
		try {
			uiDriver.findElement(Loginbutton).click();
		} catch (Exception e) {
			throw new Exception("FAILED WHILE CLICKING ON  THE LOGIN BUTTON  " + "\n clickOnLoginButton" +e.getLocalizedMessage());
		}
		return new SecurityQuestion(uiDriver);
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return actual_Result
	 */
	public String verifyGetErrorMessageforInvalidUsernameAndPassword() throws Exception
	{
		Log.info("Getting Error Message for Invalid Username and Password");
		try {
			actual_Result=getText(ErrorMessage1);
			Assert.assertEquals(actual_Result, NKConstants.ErrorMessage1,"Both Error Messages are not Matching for Invalid username and Password");
			return actual_Result;
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE ERRORMESSAGE OF INVALID USERNAME AND PASSWORD  " + "\n verifyGetErrorMessageforInvalidUsernameAndPassword" +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */

	public boolean verifyquestionMarkimage() throws Exception
	{
		Log.info("Verification of question Mark image");
		
		try {
			flag=isElementPresent(questionmarkImage);
			Assert.assertTrue(flag, "Qusetion Mark image is not matching");
			return flag;
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE QUESTION MARK IMAGE  " + "\n verifyquestionMarkimage" +e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	public boolean verifyNeedHelpwithUsernamePwdLink() throws Exception
	{
		Log.info("Verification of Need help with your username and Password ? Link");
		
		try {
			flag=isElementPresent(needHelpyourusernameAndPasswordLink);
			Assert.assertTrue(flag, "Need help with your username and Password ? Link is Missing");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE NEED HELP WITH YOUR USERNAME AND PASSWORD  " + "\n verifyneedHelpwithUsernamePwdLink" +e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return UsernamePasswordFindPage
	 */
	public UsernamePasswordFindPage clickOnNeedHelpwithUsernamePwdLink() throws Exception
	{
		Log.info("Clicking on Need help with your username and Password ? Link" );
		try {
			uiDriver.findElement(needHelpyourusernameAndPasswordLink).click();
			
		} catch (Exception e) {
			throw new Exception("FAILED TO CLICK ON  NEED HELP WITH YOUR USERNAME AND PASSWORD LINK " + "\n clickOnNeedHelpwithUsernamePwdLink" +e.getLocalizedMessage());
		}
		return new UsernamePasswordFindPage(uiDriver);
	}
	
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	
	public boolean verifyWarningMessageHeader() throws Exception
	{
		Log.info("Verification of Warning Message");
		try {
			flag=isElementPresent(warningMessage);
			Assert.assertTrue(flag, "Warning Message Text is Missing");
			return flag;
			
		} catch (Exception e) {
			throw new Exception("FAILED TO VERIFY WARNING MEASSGE HEADER " + "\n verifyWarningMessageHeader" +e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return UsernamePasswordFindPage
	 */
public void verifyWarningTex() throws Exception
{
	Log.info("Comparing Waring text Message");
	try {
		compareTextValue(uiDriver.findElement(warningMessage).getText().trim(), "WARNING", "Both warning text Messages are not Matching");
	} catch (Exception e) {
		throw new Exception("FAILED TO COMPARE WARNING MEASSGE TEXT " + "\n verifyWarningTex" +e.getLocalizedMessage());
	}
}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	public boolean verifyWarningTextMessage() throws Exception
	{
		Log.info("Verification of Account locked for 20 min message");
		try {
			
			flag=isElementPresent(warningmessageContent);
			Assert.assertTrue(flag, "Account will be locked for 20 minutes after 4 failed login attempts Message is Missing");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED TO VERIFY verifyWarningTextMessage " + "\n verifyWarningTextMessage" +e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return UsernamePasswordFindPage
	 */
public void verifyWarningTextContent() throws Exception
{
	Log.info("Comparing Waring text Message content");
	try {
		compareTextValue(uiDriver.findElement(warningmessageContent).getText().trim(), "Account will be locked for 20 minutes after 4 failed login attempts. Please remember that username and password are case sensitive.", "Both warning text Messages Content is not Matching");
	} catch (Exception e) {
		throw new Exception("FAILED TO COMPARE WARNING MEASSGE TEXT " + "\n verifyWarningTextContent" +e.getLocalizedMessage());
	}
}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	
	public boolean verifyWaringCloseButton() throws Exception
	{
		Log.info("Verification of warning Close button");
		try {
			flag=isElementPresent(warningClosebutton);
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED TO VERIFY WARNING CLOSE BUTTON " + "\n verifyWaringCloseButton" +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	public boolean verifyWarningClickHereResetLink() throws Exception
	{
		Log.info("Verification of warning message reset link");
		try {
			flag=isElementPresent(warningResetUsernamePassword);
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED TO VERIFY WARNING RESET USERNAME AND PASSWORD LIINK  BUTTON " + "\n verifyWarningClickHereResetLink" +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return UsernamePasswordFindPage
	 */
	public UsernamePasswordFindPage clickOnWaringClickHereRestPasswordUsernameLink() throws Exception
	{
		Log.info("Clicking on reset Password and Username link");
		
		try {
			uiDriver.findElement(warningResetUsernamePassword).click();
		} catch (Exception e) {
			throw new Exception("FAILED TO CLICK ON  RESET USERNAME AND PASSWORD LIINK  BUTTON " + "\n clickOnWaringClickHereRestPasswordUsernameLink" +e.getLocalizedMessage());
		}
		return new UsernamePasswordFindPage(uiDriver);
	}
	
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return LoginPage
	 */
	public LoginPage clickOnWarningCloseButton() throws Exception
	{
		Log.info("Clicking on Warning Close button");
		try {
			uiDriver.findElement(warningClosebutton).click();
		} catch (Exception e) {
			throw new Exception("FAILED TO CLICK ON  WARNING CLOSE BUTTON " + "\n clickOnWarningCloseButton" +e.getLocalizedMessage());
		}
		return this;
	}
}