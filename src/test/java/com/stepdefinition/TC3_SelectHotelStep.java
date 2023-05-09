package com.stepdefinition;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class TC3_SelectHotelStep {
	PageObjectManager PageObjectManager = new PageObjectManager();

	@Then("User should perform book a hotel page with select all fields")
	public void userShouldPerformBookAHotelPageWithSelectAllFields() {
		PageObjectManager.getSelectHotelPage().selectHotel();
	}

	@Then("User should verify success message after select hotel {string}")
	public void userShouldVerifySuccessMessageAfterSelectHotel(String string) {
		
	}

	@Then("User should perform without select the hotel")
	public void userShouldPerformWithoutSelectTheHotel() {
		PageObjectManager.getSelectHotelPage().withOutSelectHotel();
	}

	@Then("User verify error message after select hotel {string}")
	public void userVerifyErrorMessageAfterSelectHotel(String string) {
	}

}
