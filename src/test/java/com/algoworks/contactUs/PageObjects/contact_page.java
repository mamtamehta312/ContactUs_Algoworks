package com.algoworks.contactUs.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contact_page extends BaseClass {

	@FindBy(id="name") WebElement name;
	@FindBy(id="email") WebElement email;
	@FindBy(id="phone") WebElement phone;
	@FindBy(id="message") WebElement message;
	@FindBy(xpath="//input[@type='submit']") WebElement submitButton;
	@FindBy(xpath="//*[contains(text(),'COVID-19 FAQ')]") WebElement scroll;
	
	public contact_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setName(String name1)
	{
		 name.sendKeys(name1);
	}
	public void setEmail(String email1)
	{
		email.sendKeys(email1);
	}
	public void setPhone(String phone1)
	{
		phone.sendKeys(phone1);
	}
	public void setMessage(String message1)
	{
		message.sendKeys(message1);
	}
	public void clickSubmit()
	{
		submitButton.click();
	}
	public WebElement scrollElement()
	{
		return scroll;
	}
	public WebElement getName()
	{
		return name;
	}
	public WebElement getEmail()
	{
		return email;
	}
	public WebElement getPhone()
	{
		return phone;
	}
	public WebElement getMessage()
	{
		return message;
	}
	
}
