package com.amp.tests;

import org.testng.annotations.Test;

import com.amp.common.NKConstants;
import com.amp.pages.Acti_LoginPage;
import com.amp.pages.Customer_Projects;
import com.amp.pages.LoginHomePage;
import com.amp.util.BaseTestObject;

public class CustAndProjectSearchTest extends BaseTestObject
{

	Acti_LoginPage loginObj;
	LoginHomePage loginHomeObj;
	Customer_Projects custProjObj;
	
	@Test(dependsOnGroups={"ProjAdd1"})
	public void searchCustProject() throws Exception
	{	loginObj=new Acti_LoginPage(uiDriver);
		loginHomeObj=loginObj.login(NKConstants.actiUsn, NKConstants.actiPwd);
		custProjObj=loginHomeObj.clickOnProjectAndCustomer();
		custProjObj.searchProjectsAndCustomers();
		
		
	}
}
