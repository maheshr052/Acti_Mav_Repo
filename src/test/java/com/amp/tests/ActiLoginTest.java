package com.amp.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;


import com.amp.common.NKConstants;
import com.amp.pages.Acti_LoginPage;
import com.amp.pages.LoginHomePage;
import com.amp.util.BaseTestObject;

public class ActiLoginTest extends BaseTestObject
{
	private static Logger log=Logger.getLogger(Logger.class.getName()); 
	
	@Test
	public void actiLoginTest() throws Exception
	{
		Acti_LoginPage loginObj=new Acti_LoginPage(uiDriver);
		loginObj.verifyPageTitle(NKConstants.exp_ActiLoginTitle);
		loginObj.verifyUsernameTextBox();
		loginObj.verifyPassowrdBox();
		LoginHomePage homeObj=loginObj.login(NKConstants.actiUsn, NKConstants.actiPwd);
		homeObj.verifyPageTitle(NKConstants.exp_ActiLoginHome);
		
		
	}

}
