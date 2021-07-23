package org.com.stepdefinition2a;

import org.openqa.selenium.WebDriver;
import org.test.pom.BookHotelPage;
import org.test.pom.LibGlobal;
import org.test.pom.LoginPage;
import org.test.pom.PrintOrderIdPage;
import org.test.pom.SearchHotelPage;
import org.test.pom.SelectHotelPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinPage extends LibGlobal {
	WebDriver driver;	
	@Given("user should enter the login page")
	public void user_should_enter_the_login_page() {
		browserConfig();
		openUrl("http://www.adactin.com/HotelApp/");
	    maximizeBrowser();
	}
	@When("user should enter the {string} and {string} and click login button")
	public void user_should_enter_the_and_and_click_login_button(String userName, String pwd) {
		LoginPage loginpage=new LoginPage();
		loginpage.loginPage(userName, pwd);
	}
	@When("select {string},{string},{string},{string},{string},{string},{string},{string} and click submit")
	public void select_and_click_submit(String location, String hotels, String roomType, String roomNos, String checkInDate, String checkOutDate, String adultRoom, String childRoom) {
		SearchHotelPage searchhotelpage=new SearchHotelPage();
		searchhotelpage.searchHotelPage(location, hotels, roomType, roomNos, checkInDate, checkOutDate, adultRoom, childRoom);
	}
	@When("select the hotel and click confirm")
	public void select_the_hotel_and_click_confirm() {
		SelectHotelPage selecthotelpage=new SelectHotelPage();
		selecthotelpage.selectHotelPage();
	}
	@When("enter the {string},{string},{string},{string},{string},{string},{string},{string} and click book now")
	public void enter_the_and_click_book_now(String firstName, String lastName, String address, String ccNum, String ccType, String ccMonth, String ccYear, String cvv) {
		BookHotelPage bookhotelpage=new BookHotelPage();
		bookhotelpage.bookHotelPage(firstName, lastName, address, ccNum, ccType, ccMonth, ccYear, cvv);
	}
	@Then("print the orderId")
	public void print_the_orderId() {
		PrintOrderIdPage printorderidpage=new PrintOrderIdPage();
		printorderidpage.PrintOrderId();
		closeBrowser();
	}
}

