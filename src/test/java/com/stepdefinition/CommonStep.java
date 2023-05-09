package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.config.Configuration;
import com.pagemanager.PageObjectManager;
import com.pages.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStep extends BaseClass{
	public CommonStep() {
		PageFactory.initElements(driver, this);
	}
	PageObjectManager PageObjectManager = new PageObjectManager();
WebDriver driver;
	@Given("User is on AdactionHotel home page")
	public void userisonAdactionHotelhomepage() {
		driverLaunch(Configuration.BROWSERTYPE);
		implicitwait(20);
		maximize();
		get(Configuration.URL);
	}

	@Then("User should verify success message after login page {string}")
	public void usershouldverifysuccessmessageafterloginpage(String string) {

	}

}
