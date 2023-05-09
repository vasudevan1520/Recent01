package com.stepdefinition;

import java.util.List;
import java.util.Map;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.*;

public class TC4_BookHotelStep {
	PageObjectManager PageObjectManager = new PageObjectManager();

	@Then("User should select all fields in book a hotet page{string},{string}and{string}")
	public void userShouldSelectAllFieldsInBookAHotetPageAnd(String First_Name, String lastname, String add,
			io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> m = dataTable.asMaps();
		PageObjectManager.getBookHotelPage().bookHotel(First_Name, lastname, add, m.get(1).get("Credit Card No"),
				m.get(1).get("Credit Card Type"), m.get(1).get("Expiry Month"), m.get(1).get("Expiry Year"),
				m.get(1).get("CVV Number"));
	}

	@Then("User should verify success message after book a hotel page{string}")
	public void userShouldVerifySuccessMessageAfterBookAHotelPage(String string) {
	}

	@Then("User should search without select all fields in book a hotel page")
	public void userShouldSearchWithoutSelectAllFieldsInBookAHotelPage() {
		PageObjectManager.getBookHotelPage().withoutSelectAnyFields();
	}

	@Then("User verify error message after select hotel {string},{string},{string},{string},{string},{string}and{string}")
	public void userVerifyErrorMessageAfterSelectHotelAnd(String string, String string2, String string3, String string4,
			String string5, String string6, String string7) {
	}
}
