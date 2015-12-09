package com.amp.tests;

import org.testng.annotations.Test;

import com.amp.common.NKConstants;
import com.amp.pages.Acti_LoginPage;
import com.amp.pages.Customer_Projects;
import com.amp.pages.LoginHomePage;
import com.amp.pages.ProjectAdd;
import com.amp.pages.TaskAdd;
import com.amp.util.BaseTestObject;

public class ProjectAddTest extends BaseTestObject
{
	
	
	/************************************************/
	Acti_LoginPage loginObj;
	LoginHomePage loginHomeObj;
	Customer_Projects custProjObj;
	ProjectAdd projAddObj;
	TaskAdd taskAddObj;
	
	@Test(dependsOnGroups={"custCreateAndListProj"},priority=0,groups={"ProjAdd1"})
	public void addProjectAndListProjCust() throws Exception
	{
		loginObj=new Acti_LoginPage(uiDriver);
		loginHomeObj=loginObj.login(NKConstants.actiUsn, NKConstants.actiPwd);
		custProjObj=loginHomeObj.clickOnProjectAndCustomer();
		projAddObj=custProjObj.clickAddProject();
		custProjObj=projAddObj.addProjectAndListProjectsCustomers();
		custProjObj.verifySuccessMsg(NKConstants.projSuccessMessage);
		
	}
	
	@Test(priority=1,enabled=false)
	public void addProjectAndAddTask() throws Exception
	{
		loginObj=new Acti_LoginPage(uiDriver);
		loginHomeObj=loginObj.login(NKConstants.actiUsn, NKConstants.actiPwd);
		custProjObj=loginHomeObj.clickOnProjectAndCustomer();
		projAddObj=custProjObj.clickAddProject();
		taskAddObj=projAddObj.addProjectAndAddTasks();
		taskAddObj.verifySuccessMsg(NKConstants.projSuccessMessage);
	}
	
	@Test(priority=2,enabled=false)
	public void addProjectAndAddMoreProj() throws Exception
	{
		loginObj=new Acti_LoginPage(uiDriver);
		loginHomeObj=loginObj.login(NKConstants.actiUsn, NKConstants.actiPwd);
		custProjObj=loginHomeObj.clickOnProjectAndCustomer();
		projAddObj=custProjObj.clickAddProject();
		projAddObj=projAddObj.addProjectAndAddMoreProj();
		projAddObj.verifySuccessMsg(NKConstants.projSuccessMessage);
	}
	

}
