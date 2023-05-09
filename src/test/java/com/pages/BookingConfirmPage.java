package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderId;

	

	public WebElement getOrderId() {
		return orderId;
	}

	public String order() throws IOException, InterruptedException {

		String orderId = getAttribute(getOrderId(), "value");
		System.out.println(orderId);
		return orderId;

	}

}
