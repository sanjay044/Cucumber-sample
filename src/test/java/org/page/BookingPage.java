package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass{
	public BookingPage() {
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;

	public  WebElement getFirstName() {
		return firstName;
	}
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;

	public  WebElement getLastName() {
		return lastName;
	}
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;

	public  WebElement getaddress() {
		return address;
	}
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cardNumber;

	public  WebElement getCardNumber() {
		return cardNumber;
	}
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardType;

	public  WebElement getCardType() {
		return cardType;
	}
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expMonth;

	public  WebElement getExpMonth() {
		return expMonth;
	}
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expYear;

	public  WebElement getExpYear() {
		return expYear;
	}
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvvNumber;

	public  WebElement getCvvNumber() {
		return cvvNumber;
	}
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement book;

	public  WebElement getBook() {
		return book;
	}



}