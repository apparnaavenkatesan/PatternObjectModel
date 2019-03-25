package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class LeadsPage extends Annotations{

	public LeadsPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Create Lead") WebElement eleCreateLeadBtn;
	
	
	public CreateLeadPage clickCreateLead()
	{
		click(eleCreateLeadBtn);
		return new CreateLeadPage();
	}

}
