package com.stepdefinition;

import java.awt.AWTException;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.*;

public class TC1_LoginStep {
	PageObjectManager  PageObjectManager = new PageObjectManager();
	@When("User should enter the {string} , {string} and login")
	public void usershouldentertheandlogin(String username, String password) {
		PageObjectManager.getLoginPage().login(username, password);
	}

	@When("User should enter the {string} , {string} login with Enter Key")
	public void usershouldentertheloginwithEnterKey(String username, String password) throws AWTException {
		PageObjectManager.getLoginPage().loginWithEnter(username, password);
	}

	@Then("User verify login page after error message contains {string}")
	public void userverifyloginpageaftererrormessagecontains(String string) {
	
	}

}
