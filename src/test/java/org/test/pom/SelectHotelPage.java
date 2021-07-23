package org.test.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends LibGlobal {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement select;
	@FindBy(id="continue")
	private WebElement confirm;
	
	public WebElement getSelect() {
		return select;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	public void selectHotelPage() {
		   WebElement select = driver.findElement(By.id("radiobutton_0"));
		   select.click();
		   WebElement continue1 = driver.findElement(By.id("continue"));
		   continue1.click();
	}
}
