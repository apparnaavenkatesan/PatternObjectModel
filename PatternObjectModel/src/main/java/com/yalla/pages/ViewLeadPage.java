package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class ViewLeadPage extends Annotations{

	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID, using="viewLead_firstName_sp") WebElement eleFNameTxt;
	
	public ViewLeadPage verifyfName(String fName)
	{
		verifyExactText(eleFNameTxt, fName);
		return this;
	}

	
	
	
	
}
