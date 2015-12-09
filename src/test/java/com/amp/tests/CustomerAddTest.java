package com.amp.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.amp.common.NKConstants;
import com.amp.pages.Acti_LoginPage;
import com.amp.pages.CustomerAdd;
import com.amp.pages.Customer_Projects;
import com.amp.pages.LoginHomePage;
import com.amp.pages.ProjectAdd;
import com.amp.util.BaseTestObject;

public class CustomerAddTest extends BaseTestObject
{
	
	
	/******************UI Elements**************************/
	
	By successMsg= By.className("successmsg");
	
	
	/****************Variables************************/
	Customer_Projects objCustProj=null;
	CustomerAdd objCustAdd=null;
	LoginHomePage objLoginHome=null;
	Acti_LoginPage objLogin=null;
	ProjectAdd objProjAdd=null;
	
	String expCustSuccessMsg="Customer has been successfully registered.";
	
	
	@Test(groups={"custCreateAndListProj"})
	public void customerAddAndListProj_Cust() throws Exception
	{
		objLogin=new Acti_LoginPage(uiDriver);
		objLoginHome=objLogin.login(NKConstants.actiUsn, NKConstants.actiPwd);
		objCustProj=objLoginHome.clickOnProjectAndCustomer();
		objCustAdd=objCustProj.clickAddCustomer();
		objCustProj=objCustAdd.createCustAndListProj();
		objCustProj.verifySuccessMsg(expCustSuccessMsg);
		objCustProj.Logout();
		
	}

	
	@Test(enabled=false)
	public void customerAddAndCreateNewProj() throws Exception
	{
		objLogin=new Acti_LoginPage(uiDriver);
		objLoginHome=objLogin.login(NKConstants.actiUsn, NKConstants.actiPwd);
		objCustProj=objLoginHome.clickOnProjectAndCustomer();
		objCustAdd=objCustProj.clickAddCustomer();
		objProjAdd=objCustAdd.createCustAndCreateProject();
		objProjAdd.verifySuccessMsg(expCustSuccessMsg);
		objProjAdd.Logout();
	}
	
	
	@Test(enabled=false)
	public void customerAddAndCreateMoreCust() throws Exception
	{
		objLogin=new Acti_LoginPage(uiDriver);
		objLoginHome=objLogin.login(NKConstants.actiUsn, NKConstants.actiPwd);
		objCustProj=objLoginHome.clickOnProjectAndCustomer();
		objCustAdd=objCustProj.clickAddCustomer();
		objCustAdd=objCustAdd.createCustAndAddMoreCust();
		objCustAdd.verifySuccessMsg(expCustSuccessMsg);
		objCustAdd.Logout();
		
	}
	
	
	@Test(enabled=false)
	public void CustomerCreateRequiredError() throws Exception
	{
		objLogin=new Acti_LoginPage(uiDriver);
		objLoginHome=objLogin.login(NKConstants.actiUsn, NKConstants.actiPwd);
		objCustProj=objLoginHome.clickOnProjectAndCustomer();
		objCustAdd=objCustProj.clickAddCustomer();
		objCustAdd.createCustomerReqError();
		
	}
	
	@Test(enabled=false)
	public void CustomercreateCancel() throws Exception
	{
		objLogin=new Acti_LoginPage(uiDriver);
		objLoginHome=objLogin.login(NKConstants.actiUsn, NKConstants.actiPwd);
		objCustProj=objLoginHome.clickOnProjectAndCustomer();
		objCustAdd=objCustProj.clickAddCustomer();
		objCustAdd.createCustomerCancelButton();
		objCustAdd.alertCancel();
		objCustAdd.Logout();
	}
	
	
	
}
