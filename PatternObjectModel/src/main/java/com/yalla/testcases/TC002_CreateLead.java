package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC002_CreateLead extends Annotations{

	@BeforeTest
	public void setData() {
		testcaseName = "TC002_CreateLead";
		testcaseDec = "Create a Lead";
		author = "Apparnaa";
		category = "smoke";
		excelFileName = "Data_CreateLead";
	} 

	@Test(dataProvider="fetchData")
	public void createLead(String uName, String pwd, String compName, String fName, String lName) throws InterruptedException
	{
		new LoginPage()
					   .enterUserName(uName)
					   .enterPassWord(pwd)
					   .clickLogin()
					   .clickCRMSFA()
					   .clickLeadsTab()
					   .clickCreateLead()
					   .enterCompanyName(compName)
					   .enterfirstName(fName)
					   .enterlastName(lName)
					   .clickSubmitBtn()
					   .verifyfName(fName);
	
		
		
					   
		
	}
	

}
