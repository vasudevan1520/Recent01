package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement userId;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement button;
	////input [@id='username_show']
	
	@FindBy(id="username_show")
	private WebElement show;

	public WebElement getShow() {
		return show;
	}

	public WebElement getUserId() {
		return userId;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getButton() {
		return button;

	}

	public void login(String user, String Pass) {
		sendkey(getUserId(), user);
		sendkey(getPass(), Pass);
		click(getButton());

	}

	public void loginWithEnter(String user, String Pass) throws AWTException {
		sendkey(getUserId(), user);
		sendkey(getPass(), Pass);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
public void verifyMessage(String show) {

}
}
