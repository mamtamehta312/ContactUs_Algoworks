package com.algoworks.contactUs.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contact_page {

	@FindBy(id="name") WebElement name;
	@FindBy(id="email") WebElement email;
	@FindBy(id="phone") WebElement phone;
	@FindBy(id="message") WebElement message;
	@FindBy(xpath="//input[@type='submit']") WebElement submitButton;
	
	
	
	public contact_page(WebDriver driver)
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
	
	

}
