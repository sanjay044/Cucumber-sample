package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Search Hotel ']")
	private WebElement searchHotelText;

	public WebElement getSearchHotelText() {
		return searchHotelText;
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;

	public WebElement getRoomType() {
		return roomType;
	}

	@FindBy(xpath= "//select[@id='room_nos']")
	private WebElement noOfRooms;

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='datepick_in']")
	private WebElement checkIn;

	public WebElement getCheckIn() {
		return checkIn;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='datepick_out']")
	private WebElement checkOut;

	public WebElement getCheckOut() {
		return checkOut;
	}

	@FindBy(how = How.XPATH, using = "//select[@name='adult_room']")
	private WebElement adultsRoom;

	public WebElement getAdultsRoom() {
		return adultsRoom;
	}

	@FindBy(how = How.XPATH, using = "//select[@name='child_room']")
	private WebElement childRoom;

	public WebElement getChildRoom() {
		return childRoom;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='Submit']")
	private WebElement searchButton;

	public WebElement getSearchButton() {
		return searchButton;
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radioButton;

	public WebElement getRadioButton() {
		return radioButton;
	}
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}


}