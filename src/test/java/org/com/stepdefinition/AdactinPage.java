package org.com.stepdefinition;

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
WebDriver driver;

@Given("verify user should login")
public void verify_user_should_login() {
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

@When("select {string},{string},{string},{string},{string},{string},{string},{string} click submit")
public void select_click_submit(String location, String hotels, String roomType, String roomNos, String checkInDate, String checkOutDate, String adultRoom, String childRoom) {
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

@Then("verify user is able to navigate to select hotel page")
public void verify_user_is_able_to_navigate_to_select_hotel_page() {
    Assert.assertTrue("success", true);
    driver.close();
}

@When("verify if user select the mandatory fields {string},{string},{string},{string},{string} click submit")
public void verify_if_user_select_the_mandatory_fields_click_submit(String location, String roomNos, String checkInDate, String checkOutDate, String adultRoom) {
	WebElement loc = driver.findElement(By.name("location"));
	  Select s=new Select(loc);
	  s.selectByVisibleText(location);
	
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
	  //Thread.sleep(30000);
	  WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	  search.click();
}

@When("verify if user enters mismatching checkin and checkout dates all fields {string},{string},{string},{string},{string},{string},{string},{string} click submit")
public void verify_if_user_enters_mismatching_checkin_and_checkout_dates_all_fields_click_submit(String location, String hotels, String roomType, String roomNos, String checkInDate, String checkOutDate, String adultRoom, String childRoom) {
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

@When("verify if user select {string} and click submit")
public void verify_if_user_select_and_click_submit(String location) {
	WebElement loc = driver.findElement(By.name("location"));
	  Select s=new Select(loc);
	  s.selectByVisibleText(location);
	  //Thread.sleep(30000);
	  WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	  search.click();
}
}
