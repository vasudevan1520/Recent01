package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
PageFactory.initElements(driver, this);
	}
	@FindBy(id = "radiobutton_0")
	private WebElement radio;

	@FindBy(id = "continue")
	private WebElement cont;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCont() {
		return cont;
	}

	public void selectHotel() {
		click(getRadio());
		click(getCont());
	}

	public void withOutSelectHotel() {

		click(getCont());
	}
}