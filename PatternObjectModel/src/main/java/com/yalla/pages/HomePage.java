package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class HomePage extends Annotations{ 

	public HomePage() {
       PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	
	@FindBy(partialLinkText="CRM/SFA") WebElement eleCrmsfaLink ;
	
	
	public MyHomePage clickCRMSFA()
	{
		click(eleCrmsfaLink);
		return new MyHomePage();
	}
	
	
	public LoginPage clickLogout() {
		//WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);  
		return new LoginPage();
	}
	
	
}







