package org.test.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPage extends LibGlobal{
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="first_name")
	private WebElement firstName;
	@FindBy(name="last_name")
	private WebElement lastName;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="cc_num")
	private WebElement ccNum;
	@FindBy(name="cc_type")
	private WebElement ccType;
	@FindBy(name="cc_exp_month")
	private WebElement ccMonth;
	@FindBy(name="cc_exp_year")
	private WebElement ccYear;
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcMonth() {
		return ccMonth;
	}
	public WebElement getCcYear() {
		return ccYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public void bookHotelPage(String firstName, String lastName, String address, String ccNum, String ccType, String ccMonth, String ccYear, String cvv) {
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
}

