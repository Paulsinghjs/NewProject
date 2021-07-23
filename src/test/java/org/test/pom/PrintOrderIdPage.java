package org.test.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintOrderIdPage extends LibGlobal {
	public PrintOrderIdPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("(//input[@type='text'])[16]"))
	private WebElement orderNo;
	
	public WebElement getOrderNo() {
		return orderNo;
	}
	public void PrintOrderId() {
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		//Thread.sleep(10000);
	   WebElement id = driver.findElement(By.xpath("(//input[@type='text'])[16]"));
	   String attribute = id.getAttribute("value");
	   System.out.println("----------------Order No: "+attribute);
	}
}
