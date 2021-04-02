package com.algoworks.contactUs.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaseStudyPage {

	@FindBy(xpath="//*[@name='your-name']") WebElement name;
	@FindBy(xpath="//*[@name='company-name']") WebElement company_name;
	@FindBy(xpath="//*[@name='your-email']") WebElement email;
	@FindBy(xpath="//*[@name='company-phone']") WebElement phone;
	@FindBy(xpath="//*[@type='checkbox']") WebElement checkbox;
	@FindBy(xpath="//*[@value='Go To Case Study >']") WebElement submit;
	
	
	public CaseStudyPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public void setName(String name1)
	{
		name.sendKeys(name1); 
	}
	public void setCompanyName(String company_name1)
	{
		company_name.sendKeys(company_name1); 
	}
	public void setEmail(String email1)
	{
		email.sendKeys(email1); 
	}
	public void setPhone(String phone1)
	{
		phone.sendKeys(phone1); 
	}
	public void tickCheckbox()
	{
		checkbox.click();
	}
	public WebElement getCheckbox()
	{
		return checkbox;
	}
	public void clickSubmit()
	{
		submit.click();
	}
	
	
}
