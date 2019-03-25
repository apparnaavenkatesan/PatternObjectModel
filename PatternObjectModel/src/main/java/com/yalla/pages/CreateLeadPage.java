package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations{
	
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="createLeadForm_companyName") WebElement eleCompName;
	@FindBy(how=How.ID, using="createLeadForm_firstName") WebElement eleforeName;
	@FindBy(how=How.ID, using="createLeadForm_lastName") WebElement eleSurName;
	@FindBy(name="submitButton") WebElement submitBtn;
	
	public CreateLeadPage enterCompanyName(String companyName)
	{
		clearAndType(eleCompName, companyName);
		return this;
	}
	
	public CreateLeadPage enterfirstName(String fName)
	{
		clearAndType(eleforeName, fName);
		return this;
	}
	
	
	public CreateLeadPage enterlastName(String lName)
	{
		clearAndType(eleSurName, lName);
		return this;
	}
	
	public ViewLeadPage clickSubmitBtn()
	{
		click(submitBtn);
		return new ViewLeadPage();
	}

}
