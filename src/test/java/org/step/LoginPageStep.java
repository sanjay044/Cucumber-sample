package org.step;

import java.util.concurrent.TimeUnit;

import org.global.BaseClass;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.page.BookedItinerary;
import org.page.BookingPage;
import org.page.LoginPage;
import org.page.OrderPage;
import org.page.SearchHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass{
	public static BaseClass base = new BaseClass();
	public static LoginPage loginPage = new LoginPage();
	public static SearchHotelPage searchHotel = new SearchHotelPage();
	public static BookingPage bookingPage = new BookingPage();
	public static OrderPage orderPage = new OrderPage();
	public static BookedItinerary bookedItinerary = new BookedItinerary();
	@Given("User should be in Adactin Login Page")
	public void user_should_be_in_adactin_login_page() {
		String browserType = "";

		try {

			base.getDriver(base.readExcel(0, 1));

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			browserType = base.readExcel(0, 1);
			System.out.println(browserType + "_Browser Launched Successfully ");

		} catch (SessionNotCreatedException e) {
			System.out.println(browserType + "_Browser Not Launched Successfully " + e.getMessage());

		} catch (WebDriverException e) {
			System.out.println(browserType + "_Browser Not Launched Successfully " + e.getMessage());

		} catch (Exception e) {
			System.out.println(browserType + "_Browser Not Launched Successfully " + e.getMessage());

		}

		try {
			base.getUrl(base.readExcel(1, 1));
			base.winMax();

			if (base.getCurrentUrl().equals(base.readExcel(1, 1))) {
				System.out.println("Url  Launched Successfully ");

			} else {

				base.getUrl(base.readExcel(1, 1));

			}

		} catch (Exception e) {
			System.out.println("_Url Not Launched Successfully " + e.getMessage());

		}
		try {
			loginPage = new LoginPage();

			if (loginPage.getLoginUserText().isDisplayed()) {



				System.out.println("User is in " + loginPage.getLoginUserText().getText());


			}

		} catch (Exception e) {
			System.out.println("User is Not in " + loginPage.getLoginUserText().getText());



		}

	}
	@When("User should Enter Valid credentials {string} , {string}")
	public void userShouldEnterValidCredentials(String user, String pass) {
	  
		try {
			loginPage = new LoginPage();

			loginPage.getUserName().sendKeys(user);

			loginPage.getPassword().sendKeys(pass);
		} catch (Exception e) {
			System.out.println("Dats not entered");
		}



	}
	@When("User should Click Login button")
	public void user_should_click_login_button() {

		loginPage = new LoginPage();
		WebElement loginButton = loginPage.getLoginButton();

		if (loginButton.isEnabled()) {
			// Report - Login Button Enabled + loginButton.getText();
			System.out.println(loginButton.getAttribute("value") + "_Login Button Enabled ");
			base.click(loginButton);

		}
	}




	@Then("User should Verify Login success")
	public void user_should_verify_login_success() {
		loginPage = new LoginPage();
		WebElement loginSuccess = loginPage.getLoginSuccess();
		String text = loginSuccess.getText();
		
		if(text.equals("Welcome to Adactin Group of Hotels")) {
			System.out.println("User Loggedin Successfully");
		}
	}

}
