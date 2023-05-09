package com.stepdefinition;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class TC2_SearchHotelStep {
	PageObjectManager PageObjectManager = new PageObjectManager();

	@Then("User should select all fields  {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and Search the hotel")
	public void userShouldSelectAllFieldsAndSearchTheHotel(String location, String hotel, String room_type,
			String num_of_room, String check_in_date, String check_out_date, String adult, String children) {
		PageObjectManager.getSearchHotelPage().searchHotel(location, hotel, room_type, num_of_room, check_in_date, check_out_date, adult, children);
	}

	@Then("User should verify success message after Search Hotel {string}")
	public void userShouldVerifySuccessMessageAfterSearchHotel(String string) {
	}

	@Then("User should select only mandatory fields  {string}, {string}, {string}, {string}and {string}")
	public void userShouldSelectOnlyMandatoryFieldsAnd(String location, String num_of_room, String check_in_date, String check_out_date,
			String adult) {
		PageObjectManager.getSearchHotelPage().searchHotel(location, num_of_room, check_in_date, check_out_date, adult);
	}

	@Then("User should select all fields with incorrect date {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and Search the hotel")
	public void userShouldSelectAllFieldsWithIncorrectDateAndSearchTheHotel(String location, String hotel,
			String room_type, String num_of_room, String check_in_date, String check_out_date, String adult, String children) {
		PageObjectManager.getSearchHotelPage().searchHotel(location, hotel, room_type, num_of_room, check_in_date, check_out_date, adult, children);
	}

	@Then("User verify date error message after Search Hotel {string},{string}")
	public void userVerifyDateErrorMessageAfterSearchHotel(String string, String string2) {

	}

	@Then("User should search without select all fields")
	public void userShouldSearchWithoutSelectAllFields() {
		PageObjectManager.getSearchHotelPage().searchHotel();
	}

	@Then("User verify error message after Search Hotel {string}")
	public void userVerifyErrorMessageAfterSearchHotel(String string) {

	}

}
