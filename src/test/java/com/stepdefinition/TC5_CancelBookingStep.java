package com.stepdefinition;

import java.io.IOException;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class TC5_CancelBookingStep {
	PageObjectManager pageObjectManager = new PageObjectManager();

	@Then("User should perform cancel booking")
	public void userShouldPerformCancelBooking() throws IOException, InterruptedException {
		String s=pageObjectManager.getBookingConfirmPage().order();
		pageObjectManager.getCancelBookingPage().cancelBooking(s);
	}

	@Then("User should verify success message {string} after cancel")
	public void userShouldVerifySuccessMessageAfterCancel(String string) {
	}

	@Then("User should cancel the existing {string}")
	public void userShouldCancelTheExisting(String orderid) throws InterruptedException {
		pageObjectManager.getCancelBookingPage().cancelBooking(orderid);
	
	}
}
