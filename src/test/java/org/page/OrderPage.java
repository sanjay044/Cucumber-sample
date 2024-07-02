package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BaseClass {
	public OrderPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;

	public  WebElement getLastName() {
		return lastName;
	}
	@FindBy(how=How.XPATH,using="//input[@id='order_no']")
	private WebElement orderNumber;

	public WebElement getOrderNumber() {
		return orderNumber;
	}
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement itinerary;

	public  WebElement getItinerary() {
		return itinerary;
	}
	@FindBy(xpath="//input[@id='logout']")
	private WebElement logoutButton;

	public  WebElement getLogoutButton() {
		return logoutButton;
	}
	@FindBy(xpath="//input=[@id='check_all']")
	private WebElement cancelOrder;

	public WebElement getCancelOrder() {
		return cancelOrder;
	}
}
