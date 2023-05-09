package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass {
	public CancelBookingPage() {
PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bookedItinerary;

	@FindBy(id = "order_id_text")
	private WebElement searchOrderId;

	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;

	@FindBy(xpath = "//input[contains(@name,'btn_id')]")
	private WebElement btnCancelBooking;
	
	
	@FindBy(xpath = "//label[contains(text(),'The booking')]")
	private WebElement txtMessage;
	
	

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getTxtMessage() {
		return txtMessage;
	}

	public WebElement getSearchOrderId() {
		return searchOrderId;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnCancelBooking() {
		return btnCancelBooking;
	}

	public void cancelBooking(String orderId) throws InterruptedException {
		click(getBookedItinerary());
		sendkey(getSearchOrderId(), orderId);
		click(getBtnGo());
		click(getBtnCancelBooking());
		acceptAlert();
		String attributeValue = getText(getTxtMessage());
		System.out.println(attributeValue);
	}

}
