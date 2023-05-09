@Book
Feature: Verify AdatinHotel Booking Page

  Scenario Outline: Verify Book a page with Select all fields
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" and login
    Then User should verify success message after login page "Hello testmailvasudevan!"
    And User should select all fields  "<location>", "<hotel>", "<room_type>", "<num of room>", "<check in date>", "<check out date>", "<adult>", "<children>" and Search the hotel
    Then User should verify success message after Search Hotel "Select Hotel"
    And User should perform book a hotel page with select all fields
    Then User should verify success message after select hotel "Book A Hotel"
    And User should select all fields in book a hotet page"<First Name>","<Last Name>"and"<Billing Address>"
      | Credit Card No   | Credit Card Type | Expiry Month | Expiry Year | CVV Number |
      | 1234567899876544 | American Express | March        |        2022 |       1234 |
      | 1234567899876545 | VISA             | April        |        2022 |       4321 |
      | 1234567899876546 | Master Card      | May          |        2022 |       5678 |
      | 1234567899876547 | Other            | June         |        2022 |       8654 |
    Then User should verify success message after book a hotel page"Booking Confirmation"

    Examples: 
      | username          | password          | location | hotel       | room_type | num of room | check in date | check out date | adult   | children | First Name | Last Name | Billing Address |
      | testmailvasudevan | testmailvasudevan | Sydney   | Hotel Creek | Standard  | 1 - One     | 12/07/2022    | 12/07/2022     | 1 - One | 0 - None | vasu       | Murugesa  | AAA,BBB,CCC-001 |

  Scenario Outline: Verify Booking page without Select any fields
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" and login
    Then User should verify success message after login page "Hello testmailvasudevan!"
    And User should select all fields  "<location>", "<hotel>", "<room_type>", "<num of room>", "<check in date>", "<check out date>", "<adult>", "<children>" and Search the hotel
    Then User should verify success message after Search Hotel "Select Hotel"
    And User should search without select all fields in book a hotel page
    Then User verify error message after select hotel "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Use 16 digit Dummy Data Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month"and"Please Enter your Credit Card CVV Number"

    Examples: 
      | username          | password          | location | hotel       | room_type | num of room | check in date | check out date | adult   | children |
      | testmailvasudevan | testmailvasudevan | Sydney   | Hotel Creek | Standard  | 1 - One     | 12/07/2022    | 12/07/2022     | 1 - One | 0 - None |
