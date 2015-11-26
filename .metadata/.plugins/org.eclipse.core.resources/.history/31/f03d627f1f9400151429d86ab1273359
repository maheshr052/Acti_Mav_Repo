package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.common.NKConstants;
import com.pp.util.BasePageObject;
import com.sun.jna.platform.win32.WinUser.FLASHWINFO;

public class SecurityQuestion extends BasePageObject
{
	
public SecurityQuestion(WebDriver driver) 
{
	super(driver);
}
public static Logger Log= Logger.getLogger(Logger.class.getName());

By AnswerYourSecurityquest= By.id("ctl00_ContentPlaceHolder1_lblFormHeader");
By FraudWarning=By.id("ctl00_ContentPlaceHolder1_FraudWarning1_lblFraudWarning");
By FraudwarningMessage=By.id("ctl00_ContentPlaceHolder1_FraudWarning1_lblDisclaimer");
By whatsyourFavColor=By.id("ctl00_ContentPlaceHolder1_lblQuestion");
By watsyourfavTextbox=By.id("ctl00_ContentPlaceHolder1_txtAnswer");
By submit=By.id("ctl00_ContentPlaceHolder1_SubmitButton");
By SecurityErrorMessage_Blank=By.id("ctl00_ContentPlaceHolder1_lblErrorMessage");
By BackButton=By.id("ctl00_ContentPlaceHolder1_BackButton");

boolean flag;
String Actual_result=null;
String Expected_result=null;

/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public boolean verifyAnswerYourSecText() throws Exception
{
	Log.info("Verifcation of Answer Your Security question Text");
	try {
		flag=isElementPresent(AnswerYourSecurityquest);
		Assert.assertTrue(flag, "Answer your security question Text is missing");
		return flag;
	} catch (Exception e) {
		throw new Exception("FAILED TO VERIFY ANSWER YOUR SECURITY QUESTION TEXT " +"\n verifyAnswerYourSecText" + e.getLocalizedMessage() );
	}
}

/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public String verifyTextOfAnswerYourSecurityQuestion() throws Exception
{
Log.info("Comparing the Text of Answer your Security question");

try {
	Actual_result=getText(AnswerYourSecurityquest).trim();
	compareTextValue(Actual_result, "Answer Your Security Question", "Both the Test are not Matching so Answer your Security question Text is not Matching");
	return Actual_result;
	
} catch (Exception e) {
	throw new Exception("FAILED TO COMPARE ANSWER YOUR SECURITY QUESTION TEXT " +"\n verifyTextOfAnswerYourSecurityQuestion" + e.getLocalizedMessage() );
}
}
/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public boolean verifyFruadWarning() throws Exception
{
Log.info("verification Fraud warning Message");

try {
	flag= isElementPresent(FraudWarning);
	Assert.assertTrue(flag, "Fruad warning Message is not displaying");
	return flag;
} catch (Exception e) {
	throw new Exception("FAILED TO VERIFY FRUAD WARNING " +"\n verifyFruadWarning" + e.getLocalizedMessage() );
}
}

/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public String verifyTextValueOfFruadMessage() throws Exception
{
Log.info("Comparing the Text of Fruad Message");

try {
	Actual_result=getText(FraudwarningMessage);
	compareTextValue(Actual_result, NKConstants.FraudwarningText, "Fruad Warning text Message is not Same");
	return Actual_result;
} catch (Exception e) {
	throw new Exception("FAILED TO COMPARE FRUAD MESSAGE TEXT " +"\n verifyTextValueOfFruadMessage" + e.getLocalizedMessage() );
}
}
/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public boolean verifyFavTeachernameText() throws Exception
{
Log.info("Verification of Favorite Teachername");
try {
	
	flag=isElementPresent(whatsyourFavColor);
	Assert.assertTrue(flag, "Favorite Teachername Text is missing");
	return flag;
} catch (Exception e) {
	throw new Exception("FAILED TO VERIFY FAVORITE TEACHERSNAME TEXT " +"\n verifyFavTeachernameText" + e.getLocalizedMessage() );
}
}
/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public boolean verifyFavTeachernameTextbox() throws Exception
{
Log.info("Verification of Favorite Teachername text box");
try {
	
	flag=isElementPresent(watsyourfavTextbox);
	Assert.assertTrue(flag, "Favorite Teachername Textbox is missing");
	return flag;
} catch (Exception e) {
	throw new Exception("FAILED TO VERIFY FAVORITE TEACHERSNAME TEXTBOX " +"\n verifyFavTeachernameTextbox" + e.getLocalizedMessage() );
}
}

/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public void EnterFavTextbox(String FavText) throws Exception
{
Log.info("Verification of Favorite Teachername text box");
try {
	
	uiDriver.findElement(watsyourfavTextbox).sendKeys(FavText);
} catch (Exception e) {
	throw new Exception("FAILED TO VERIFY FAVORITE TEACHERSNAME TEXTBOX " +"\n verifyFavTeachernameTextbox" + e.getLocalizedMessage() );
}
}

/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public boolean verifySubmitButton() throws Exception
{
Log.info("Verification of submit Button");
try {
	
	flag=isElementPresent(submit);
	Assert.assertTrue(flag, "submit button is missing");
	return flag;
} catch (Exception e) {
	throw new Exception("FAILED TO VERIFY SUBMIT BUTTON " +"\n verifySubmitButton" + e.getLocalizedMessage() );
}
}
/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public AccountSummaryNew clickOnSubmitButton() throws Exception
{
Log.info("Clicking on submit Button");
try {
	
	uiDriver.findElement(submit).click();
} catch (Exception e) {
	throw new Exception("FAILED TO CLICK ON SUBMIT BUTTON " +"\n clickOnSubmitButton" + e.getLocalizedMessage() );
}
return new AccountSummaryNew(uiDriver);
}


/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public boolean verifyBackButton() throws Exception
{
Log.info("Verification of Back Button");
try {
	
	flag=isElementPresent(BackButton);
	Assert.assertTrue(flag, "Back button is missing");
	return flag;
} catch (Exception e) {
	throw new Exception("FAILED TO VERIFY SUBMIT BUTTON " +"\n verifySubmitButton" + e.getLocalizedMessage() );
}


}
/*****************************************************************************************************************************************************************************************************/
/**
 * @author manjunathr
 * 
 */
public void clickOnBackButton() throws Exception
{
Log.info("Clicking on Back Button");
try {
	
	uiDriver.findElement(BackButton).click();
} catch (Exception e) {
	throw new Exception("FAILED TO CLICK ON BACK BUTTON " +"\n clickOnBackButton" + e.getLocalizedMessage() );
}
}

}
