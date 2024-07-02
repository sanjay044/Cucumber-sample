package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary extends BaseClass
{
	public BookedItinerary()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='check_all']")
	private WebElement bookedItineraryCheckButton;
	
	public WebElement getBookedItineraryCheckButton()
	{
		return bookedItineraryCheckButton;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='cancelall']")
	private WebElement cancelSelectedButton;
	
	public WebElement getCancelSelectedButton()
	{
		return cancelSelectedButton;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='logout']")
	private WebElement logoutButton;
	
	public WebElement getLogoutButton()
	{
		return logoutButton;
	}
	
	@FindBy(how = How.XPATH, using = "//td[text()='You have successfully logged out. ']")
	private WebElement logoutMessage;
	
	public WebElement getLogoutMessage()
	{
		return logoutMessage;
	}
}