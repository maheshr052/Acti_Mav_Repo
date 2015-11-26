package com.pp.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;
import com.pp.pages.AccountSummaryNew;
import com.pp.pages.LoginPage;
import com.pp.pages.SecurityQuestion;
import com.pp.pages.SurveyOptInPage;
import com.pp.pages.TermsAndConditionsPage;
import com.pp.pages.UsernamePasswordFindPage;
import com.pp.util.BaseTestObject;

public class LoginPageTest extends BaseTestObject
{
	
	private static Logger Log= Logger.getLogger(Logger.class.getName());
	
	
	LoginPage objLoginPage;
	TermsAndConditionsPage objTermsAndConditionsPage;
	UsernamePasswordFindPage objUsernamePasswordFindPage;
	SecurityQuestion objSecurityQuestion;
	AccountSummaryNew objAccountSummaryNew;
	SurveyOptInPage objSurveyOptInPage;
	
	
	boolean flag;
	String actual_Result=null;
	String parent_window=null;
	
	//@Parameters({"browserType","url"})
	
	@Test(priority=1, enabled=false)
	
	public void verifyIamNewHereTestCase() throws Exception
	{

		Log.info("----> Verifying the verifyIamNewHereTestCase <------------");
	try 
	{
		
		objLoginPage= new LoginPage(uiDriver);
		objLoginPage.verifyIamNewHereText();
		objLoginPage.getIamNewHereText();
		objLoginPage.verifyHaveYouBeenProvidedText();
		objLoginPage.getHaveYouBeenProvidedText();
		objLoginPage.verifyTemporaryUsernamePasswordText();
		objLoginPage.getDoYouHaveTempText();
		objLoginPage.verifyIamNewHereButton();
		objTermsAndConditionsPage=objLoginPage.clickOnIamNewHereButton();
		objTermsAndConditionsPage.verifyTermsAndConditonsText();
		objTermsAndConditionsPage.verifyIdonotAcceptbutton();
		objLoginPage=objTermsAndConditionsPage.clickonIdonotAcceptButton();
		objLoginPage.verifyIamNewHereText();
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED VERIFYING THE I AM NEW HERE  TESTCASE" + "\n verifyIamNewHereTestCase" +e.getLocalizedMessage());
	}
		
	}
	
	@Test(priority=2,enabled=false)
	
	public void verifyAllReadyMembersElements() throws Exception
	{
		
		Log.info("Verifying the elements of All ready member Box");
		
		try {
			objLoginPage= new LoginPage(uiDriver);
			objLoginPage.verifyUsernameLabel();
			objLoginPage.verifyUsernameTextbox();
			objLoginPage.verifyPasswordlabel();
			objLoginPage.verifyPasswordTextbox();
			objLoginPage.verifyquestionMarkimage();
			objLoginPage.verifyNeedHelpwithUsernamePwdLink();
			objLoginPage.verifyLoginbutton();
		} catch (Exception e) {
			throw new Exception("FAILED THE TEST CASE OF VERIFY ALL READY MEMBERS ELEMENTS " + "\n verifyAllReadyMembersElements" +e.getLocalizedMessage());
		}
		
		
	}
	
	@Test(priority=3,enabled=false)
	
	public void clickOnLoginWithInvalidUsernameAndPassword() throws Exception
	{
		Log.info("Clicking on Login button with Invalid Username and Password");
		try {
			
			objLoginPage= new LoginPage(uiDriver);
			objLoginPage.verifyUsernameLabel();
			objLoginPage.verifyUsernameTextbox();
			objLoginPage.enterUsername("qweqwe3");
			objLoginPage.verifyPasswordlabel();
			objLoginPage.verifyPasswordTextbox();
			objLoginPage.enterPassword("asdasd1");
			objLoginPage.clickOnLoginButton();
			Thread.sleep(4000);
			objLoginPage.verifyGetErrorMessageforInvalidUsernameAndPassword();
			
			
		} catch (Exception e) {
			throw new Exception("FAILED THE TEST CASE OF CLICK ON LOGIN BUTTON" + "\n clickOnLoginWithInvalidUsernameAndPassword" +e.getLocalizedMessage());
		}
	}
	
@Test(priority=4,enabled=false)
	
	public void clickOnNeedHelpWithyourUsernamePassLink() throws Exception
	{
		Log.info("Clicking on clickOnNeedHelpWithyourUsernamePass Link ");
		try {
			
			objLoginPage= new LoginPage(uiDriver);
			objLoginPage.verifyquestionMarkimage();
			objLoginPage.verifyNeedHelpwithUsernamePwdLink();
			objUsernamePasswordFindPage	=objLoginPage.clickOnNeedHelpwithUsernamePwdLink();
			objUsernamePasswordFindPage.verifyCancelButton();
			objLoginPage=objUsernamePasswordFindPage.clickOnCancelButton();
		
			
		} catch (Exception e) {
			throw new Exception("FAILED THE TEST CASE OF CLICK ON LOGIN BUTTON" + "\n clickOnLoginWithInvalidUsernameAndPassword" +e.getLocalizedMessage());
		}
	}
@Test(priority=5,enabled=false)

public void clickOnLoginWithvalidUsernameAndInvalidPasswordAndVerifyWarningMessage() throws Exception
{
	Log.info("Clicking on Login button with Invalid Username and Password");
	try {
		
		objLoginPage= new LoginPage(uiDriver);
		objLoginPage.verifyUsernameLabel();
		objLoginPage.verifyUsernameTextbox();
		//objLoginPage.verifyUsernameTextbox();
		//objLoginPage.verifyUsernameTextbox();
		//objLoginPage.verifyUsernameTextbox();
		objLoginPage.verifyPasswordlabel();
		objLoginPage.verifyPasswordTextbox();
		objLoginPage.enterUsername("shruthi1");
		//soumya1,dshetty1,umashree1,jcotton1,olemnji1,shruthi1,
		objLoginPage.enterPassword("asdasd1");
		objLoginPage.clickOnLoginButton();
		Thread.sleep(4000);
		objLoginPage.verifyGetErrorMessageforInvalidUsernameAndPassword();
		objLoginPage.enterPassword("asdasd1");
		Thread.sleep(2000);
		objLoginPage.clickOnLoginButton();
		objLoginPage.verifyWarningMessageHeader();
		objLoginPage.verifyWarningTex();
		objLoginPage.verifyWarningTex();
		objLoginPage.verifyWarningTextContent();
		objLoginPage.verifyWaringCloseButton();
		objLoginPage.verifyWarningClickHereResetLink();
		objUsernamePasswordFindPage=objLoginPage.clickOnWaringClickHereRestPasswordUsernameLink();
		objUsernamePasswordFindPage.verifyCancelButton();
		objLoginPage=objUsernamePasswordFindPage.clickOnCancelButton();
		objLoginPage.verifyUsernameLabel();
		objLoginPage.verifyUsernameTextbox();
		objLoginPage.verifyPasswordlabel();
		objLoginPage.verifyPasswordTextbox();
		objLoginPage.enterUsername("olemnji1");
		//soumya1,dshetty1,umashree1
		objLoginPage.enterPassword("asdasd1");
		objLoginPage.clickOnLoginButton();
		Thread.sleep(4000);
		objLoginPage.verifyGetErrorMessageforInvalidUsernameAndPassword();
		objLoginPage.enterPassword("asdasd1");
		Thread.sleep(2000);
		objLoginPage.clickOnLoginButton();
		objLoginPage.verifyWarningMessageHeader();
		objLoginPage.verifyWarningTex();
		objLoginPage.verifyWarningTex();
		objLoginPage.verifyWarningTextContent();
		objLoginPage.verifyWaringCloseButton();
		objLoginPage.clickOnWarningCloseButton();
		
	} catch (Exception e) {
		throw new Exception("FAILED THE TEST CASE OF CLICK ON LOGIN BUTTON" + "\n clickOnLoginWithInvalidUsernameAndPassword" +e.getLocalizedMessage());
	}
}

@Test(priority=6, enabled=true)
public void clickOnLoginWithValidCredentials() throws Exception
{
	
	try 
	{
		objLoginPage = new LoginPage(uiDriver);
		objLoginPage.verifyUsernameLabel();
		objLoginPage.verifyPasswordlabel();
		objLoginPage.verifyUsernameTextbox();
		objLoginPage.enterUsername("olemanju12");
		objLoginPage.enterPassword("dshetty1");
		objSecurityQuestion	=objLoginPage.clickOnLoginButton();
		objSecurityQuestion.verifyFruadWarning();
		objSecurityQuestion.verifyFavTeachernameTextbox();
		objSecurityQuestion.EnterFavTextbox("dshetty1");
	objAccountSummaryNew=	objSecurityQuestion.clickOnSubmitButton();
	objAccountSummaryNew.verifyDashBoardMessage();
	objAccountSummaryNew.verifyWelcomeMessage();
	objAccountSummaryNew.verifySignOutButton();
	objSurveyOptInPage=objAccountSummaryNew.clickOnSignOutButton();
	
	
		
	} 
	catch (Exception e) 
	{
		
	}
	}


}
