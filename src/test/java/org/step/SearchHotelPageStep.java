package org.step;


import java.util.concurrent.TimeUnit;

import org.global.BaseClass;


import org.page.LoginPage;
import org.page.SearchHotelPage;

import io.cucumber.java.en.Then;

public class SearchHotelPageStep extends BaseClass{

	public static BaseClass base = new BaseClass();
	public static SearchHotelPage searchHotel = new SearchHotelPage();
	@Then("User Should Select Hotel Location")
	public void userShouldSelectHotelLocation() {
		try {
			searchHotel = new SearchHotelPage();
			searchHotel.getLocation().sendKeys(base.readExcel(4, 1));

		}catch (Exception e) {
			System.out.println("Input Datas not entered corrctly");	
		}
	}
	@Then("User Should Select SearchHotel Details")
	public void userShouldSelectSearchHotelDetails() {
		try {
			searchHotel = new SearchHotelPage();
			searchHotel.getHotels().sendKeys(base.readExcel(5, 1));
		} catch (Exception e) {
			System.out.println("Datas not entered Correctly");
		}
	}
	@Then("User Should Select Room Type")
	public void userShouldSelectRoomType() {
		try {
			searchHotel = new SearchHotelPage();
			searchHotel.getRoomType().sendKeys(base.readExcel(6, 1));
		} catch (Exception e) {
			System.out.println("Datas not entered Correctly");
		}
	}
	@Then("User Should Select Number of Rooms")
	public void userShouldSelectNumberOfRooms() {
		try {
			searchHotel = new SearchHotelPage();
			searchHotel.getNoOfRooms().sendKeys(base.readExcel(7, 1));
		} catch (Exception e) {
			System.out.println("Datas not entered Correctly");
		}}
	@Then("User Should Enter Checkin Date")
	public void userShouldEnterCheckinDate() {
		try {
			searchHotel = new SearchHotelPage();
			searchHotel.getCheckIn().sendKeys(base.readExcel(8, 1));
			if(searchHotel.getCheckIn().equals(base.readExcel(8, 1))) {
				System.out.println("Dates enteredCorrectly");
			}else {
				System.out.println("Dates not entered Correctly");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}}
	@Then("User Should Enter Checkout Date")
	public void userShouldEnterCheckoutDate() {
		try {
			searchHotel = new SearchHotelPage();

			searchHotel.getCheckOut().sendKeys(base.readExcel(9, 1));
			if(searchHotel.getCheckOut().equals(base.readExcel(9, 1))) {
				System.out.println("Dates enteredCorrectly");
			}else {
				System.out.println("Dates not entered Correctly");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}}
	@Then("User Should Select Adults Per Room")
	public void userShouldSelectAdultsPerRoom() {
		try {
			searchHotel = new SearchHotelPage();
			searchHotel.getAdultsRoom().sendKeys(base.readExcel(10, 1));

		} catch (Exception e) {
			System.out.println("Datas not entered Correctly");
		}
	}
	@Then("User Should Select Children Per Room")
	public void userShouldSelectChildrenPerRoom() {
		try {
			searchHotel = new SearchHotelPage();

			searchHotel.getChildRoom().sendKeys(base.readExcel(11, 1));
		} catch (Exception e) {
			System.out.println("Datas not entered Correctly");
		}
	}
	@Then("User Should click Search Button")
	public void userShouldClickSearchButton() {
		try {
			searchHotel = new SearchHotelPage();
			if(searchHotel.getSearchButton().isDisplayed()) {
				if(searchHotel.getSearchButton().isEnabled()) {
					String text = searchHotel.getSearchButton().getText();
					System.out.println(text+ "_Button is Displayed and  Enabled");
					searchHotel.getSearchButton().click();
				}
			}



		} catch (Exception e) {

		}}
	@Then("User should be in Select Hotel Page")
	public void userShouldBeInSelectHotelPage() {
		try {
			searchHotel = new SearchHotelPage();
		} catch (Exception e) {
			// TODO: handle exception
		}}
}