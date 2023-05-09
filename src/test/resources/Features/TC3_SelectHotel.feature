@Select
Feature: Verify AdatinHotel Select Page Details

  Scenario Outline: Verify  Select Hotel Page with Select the Hotel
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" and login
    Then User should verify success message after login page "Hello testmailvasudevan!"
    And User should select all fields  "<location>", "<hotel>", "<room_type>", "<num of room>", "<check in date>", "<check out date>", "<adult>", "<children>" and Search the hotel
   Then User should verify success message after Search Hotel "Select Hotel"
    And User should perform book a hotel page with select all fields
    Then User should verify success message after select hotel "Book A Hotel"

    Examples: 
      | username          | password          | location | hotel       | room_type | num of room | check in date | check out date | adult   | children |
      | testmailvasudevan | testmailvasudevan | Sydney   | Hotel Creek | Standard  | 1 - One     | 12/07/2022    | 12/07/2022     | 1 - One | 0 - None |

  Scenario Outline: Verify  Select Hotel Page without Select the Hotel
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" and login
    Then User should verify success message after login page "Hello testmailvasudevan!"
    And User should select all fields  "<location>", "<hotel>", "<room_type>", "<num of room>", "<check in date>", "<check out date>", "<adult>", "<children>" and Search the hotel
   Then User should verify success message after Search Hotel "Select Hotel"
    And User should perform without select the hotel
    Then User verify error message after select hotel "Please Select a Hotel"

    Examples: 
      | username          | password          | location | hotel       | room_type | num of room | check in date | check out date | adult   | children |
      | testmailvasudevan | testmailvasudevan | Sydney   | Hotel Creek | Standard  | 1 - One     | 12/07/2022    | 12/07/2022     | 1 - One | 0 - None |
