package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
PageFactory.initElements(driver, this);
	}
	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement add;

	@FindBy(id = "cc_num")
	private WebElement card;

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expyear;

	@FindBy(id = "cc_cvv")
	private WebElement cvnum;

	@FindBy(id = "book_now")
	private WebElement book;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvnum() {
		return cvnum;
	}

	public WebElement getBook() {
		return book;
	}

	public void bookHotel(String firstname, String lastname, String add, String card, String cardtype, String expmonth,
			String expyear, String cvnum) {
		sendkey(getFirstname(), firstname);
		sendkey(getLastname(), lastname);
		sendkey(getAdd(), add);
		sendkey(getCard(), card);
		selectByVisibleTextDD(getCardtype(), cardtype);
		selectByVisibleTextDD(getExpmonth(), expmonth);
		selectByVisibleTextDD(getExpyear(), expyear);
		sendkey(getCvnum(), cvnum);
		click(getBook());
	}

	public void withoutSelectAnyFields() {
		click(getBook());
	}
}
