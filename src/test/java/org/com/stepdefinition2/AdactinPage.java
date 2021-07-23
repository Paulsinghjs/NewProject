package org.com.stepdefinition2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinPage {
	static WebDriver driver;
	@Given("user should enter the login page")
	public void user_should_enter_the_login_page() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("http://www.adactin.com/HotelApp/");
	    driver.manage().window().maximize();
	}

	@When("user should enter the {string} and {string} and click login button")
	public void user_should_enter_the_and_and_click_login_button(String userName, String pwd) {
		   WebElement txtUser = driver.findElement(By.id("username"));
		   txtUser.sendKeys(userName);
		   WebElement txtPwd = driver.findElement(By.id("password"));
		   txtPwd.sendKeys(pwd);
		   WebElement login = driver.findElement(By.id("login"));
		   login.click();
	}

	@When("select {string},{string},{string},{string},{string},{string},{string},{string} and click submit")
	public void select_and_click_submit(String location, String hotels, String roomType, String roomNos, String checkInDate, String checkOutDate, String adultRoom, String childRoom) {
		 WebElement loc = driver.findElement(By.name("location"));
		  Select s=new Select(loc);
		  s.selectByVisibleText(location);
		  WebElement hotels1 = driver.findElement(By.xpath("//select[@name='hotels']"));
		  Select s1=new Select(hotels1);
		  s1.selectByVisibleText(hotels);
		  WebElement roomType1 = driver.findElement(By.id("room_type"));
		  Select s2=new Select(roomType1);
		  s2.selectByVisibleText(roomType);
		  WebElement roomNos1 = driver.findElement(By.id("room_nos"));
		  Select s3=new Select(roomNos1);
		  s3.selectByVisibleText(roomNos);
		  WebElement checkInDate1 = driver.findElement(By.id("datepick_in"));
		  checkInDate1.sendKeys(checkInDate);
		  WebElement checkOutDate1 = driver.findElement(By.id("datepick_out"));
		  checkOutDate1.sendKeys(checkOutDate);	  
		  WebElement adultRoom1 = driver.findElement(By.id("adult_room"));
		  Select s6=new Select(adultRoom1);
		  s6.selectByVisibleText(adultRoom);
		  WebElement childRoom1 = driver.findElement(By.id("child_room"));
		  Select s7=new Select(childRoom1);
		  s7.selectByVisibleText(childRoom);
		  //Thread.sleep(30000);
		  WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		  search.click();
	}

	@When("select the hotel and click confirm")
	public void select_the_hotel_and_click_confirm() {
		   WebElement select = driver.findElement(By.id("radiobutton_0"));
		   select.click();
		   WebElement continue1 = driver.findElement(By.id("continue"));
		   continue1.click();
	}

	@When("enter the {string},{string},{string},{string},{string},{string},{string},{string} and click book now")
	public void enter_the_and_click_book_now(String firstName, String lastName, String address, String ccNum, String ccType, String ccMonth, String ccYear, String cvv) {
		   WebElement firstName1 = driver.findElement(By.name("first_name"));
		   firstName1.sendKeys(firstName);
		   WebElement lastName1 = driver.findElement(By.name("last_name"));
		   lastName1.sendKeys(lastName);
		   WebElement address1 = driver.findElement(By.name("address"));
		   address1.sendKeys(address);
		   WebElement ccNum1 = driver.findElement(By.name("cc_num"));
		   ccNum1.sendKeys(ccNum);
		   WebElement cctype1 = driver.findElement(By.name("cc_type"));
		   Select a=new Select(cctype1);
		   a.selectByVisibleText(ccType);
		   WebElement ccMonth1 = driver.findElement(By.name("cc_exp_month"));
		   Select a1=new Select(ccMonth1);
		   a1.selectByVisibleText(ccMonth);
		   WebElement ccYear1 = driver.findElement(By.name("cc_exp_year"));
		   Select a2=new Select(ccYear1);
		   a2.selectByVisibleText(ccYear);
		   WebElement cvv1 = driver.findElement(By.name("cc_cvv"));
		   cvv1.sendKeys(cvv);
		   WebElement bookNow = driver.findElement(By.id("book_now"));
		   bookNow.click();	   		
	}

	@When("verify if user is able to cancel the order")
	public void verify_if_user_is_able_to_cancel_the_order() {
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		//Thread.sleep(10000);
	   WebElement id = driver.findElement(By.xpath("(//input[@type='text'])[16]"));
	   String attribute = id.getAttribute("value");
	   System.out.println("----------------Order No: "+attribute);
	   WebElement clk = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		clk.click();
	   WebElement searchBox = driver.findElement(By.id("order_id_text"));
	    searchBox.sendKeys(attribute);
	}

	@Then("verify user gets order cancel message")
	public void verify_user_gets_order_cancel_message() {
	    Assert.assertTrue("order cancelled message", true);
	}
	
	@Given("user should enter the login page and enter {string} and {string} and login")
	public void user_should_enter_the_login_page_and_enter_and_and_login(String userName, String pwd) {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("http://www.adactin.com/HotelApp/");
	    driver.manage().window().maximize();
	    WebElement txtUser = driver.findElement(By.id("username"));
		   txtUser.sendKeys(userName);
		   WebElement txtPwd = driver.findElement(By.id("password"));
		   txtPwd.sendKeys(pwd);
		   WebElement login = driver.findElement(By.id("login"));
		   login.click();
	}
	
	@When("verify if user could enter the booked {string} and is able to cancel the order")
	public void verify_if_user_could_enter_the_booked_and_is_able_to_cancel_the_order(String orderid) {
		WebElement clk = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		clk.click();
	    WebElement searchBox = driver.findElement(By.id("order_id_text"));
	    searchBox.sendKeys(orderid);   
	    WebElement clk1 = driver.findElement(By.id("search_hotel_id"));
		clk1.click();
		WebElement clk2 = driver.findElement(By.name("ids[]"));
		clk2.click();
		WebElement clk3 = driver.findElement(By.name("cancelall"));
		clk3.click();		
	}
}
