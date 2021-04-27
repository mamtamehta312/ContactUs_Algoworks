package com.algoworks.contactUs.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contact_btn_page  extends BaseClass {
  
	
	public contact_btn_page()
	{ 
		
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(linkText="Contact Us") static WebElement contactUsBtn;
	
	public WebElement  contactButton()
	{
		return contactUsBtn;
	}
	
	public void clickContactButton()
	{
		contactUsBtn.click();
	}
}
