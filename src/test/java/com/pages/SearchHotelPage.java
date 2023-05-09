package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
PageFactory.initElements(driver, this);
	}
	@FindBy(id = "location")
	private WebElement loc;

	@FindBy(id = "hotels")
	private WebElement htl;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement rooms;

	@FindBy(id = "datepick_in")
	private WebElement datein;

	@FindBy(id = "datepick_out")
	private WebElement dateout;

	@FindBy(id = "adult_room")
	private WebElement adroom;

	@FindBy(id = "child_room")
	private WebElement chdroom;

	@FindBy(id = "Submit")
	private WebElement finish;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHtl() {
		return htl;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdroom() {
		return adroom;
	}

	public WebElement getChdroom() {
		return chdroom;
	}

	public WebElement getFinish() {
		return finish;
	}

	public void searchHotel(String location, String hotel, String room_type, String num_of_room, String check_in_date,
			String check_out_date, String adult, String children) {
		selectByVisibleTextDD(getLoc(), location);
		selectByVisibleTextDD(getHtl(), hotel);
		selectByVisibleTextDD(getRoomtype(), room_type);
		selectByVisibleTextDD(getRooms(), num_of_room);
		sendkey(getDatein(), check_in_date);
		sendkey(getDateout(), check_out_date);
		selectByVisibleTextDD(getAdroom(), adult);
		selectByVisibleTextDD(getChdroom(), children);
		click(getFinish());
	}

	public void searchHotel(String location, String num_of_room, String check_in_date, String check_out_date,
			String adult) {
		selectByVisibleTextDD(getLoc(), location);
		selectByVisibleTextDD(getRooms(), num_of_room);
		sendkey(getDatein(), check_in_date);
		sendkey(getDateout(), check_out_date);
		selectByVisibleTextDD(getAdroom(), adult);
		click(getFinish());
	}

	public void searchHotel() {
		click(getFinish());
	}

}