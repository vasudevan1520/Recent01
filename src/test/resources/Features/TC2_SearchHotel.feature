@Search
Feature: Verify AdactinHotel Search Page

  Scenario Outline: Verify  Search Page with Select all fields
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" and login
    Then User should verify success message after login page "Hello testmailvasudevan!"
    And User should select all fields  "<location>", "<hotel>", "<room_type>", "<num of room>", "<check in date>", "<check out date>", "<adult>", "<children>" and Search the hotel
    Then User should verify success message after Search Hotel "Select Hotel"

    Examples: 
      | username          | password          | location | hotel       | room_type | num of room | check in date | check out date | adult   | children |
      | testmailvasudevan | testmailvasudevan | Sydney   | Hotel Creek | Standard  | 1 - One     | 12/07/2022    | 12/07/2022     | 1 - One | 0 - None |

  Scenario Outline: Verify  Search Page with Mandatory Fields
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" and login
    Then User should verify success message after login page "Hello testmailvasudevan!"
    And User should select only mandatory fields  "<location>", "<num of room>", "<check in date>", "<check out date>"and "<adult>"
    Then User should verify success message after Search Hotel "Select Hotel"

    Examples: 
      | username          | password          | location | num of room | check in date | check out date | adult   |
      | testmailvasudevan | testmailvasudevan | Sydney   | 1 - One     | 12/07/2022    | 12/07/2022     | 1 - One |

  Scenario Outline: Verify  Search Page with Invaild Date
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" and login
    Then User should verify success message after login page "Hello testmailvasudevan!"
    And User should select all fields with incorrect date "<location>", "<hotel>", "<room_type>", "<num of room>", "<check in date>", "<check out date>", "<adult>", "<children>" and Search the hotel
    Then User verify date error message after Search Hotel "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username          | password          | location | hotel       | room_type | num of room | check in date | check out date | adult   | children |
      | testmailvasudevan | testmailvasudevan | Sydney   | Hotel Creek | Standard  | 1 - One     | 12/07/2023    | 12/07/2022     | 1 - One | 0 - None |

  Scenario Outline: Verify Search Page without Select any Fields
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" and login
    Then User should verify success message after login page "Hello testmailvasudevan!"
    And User should search without select all fields
    Then User verify error message after Search Hotel "Please Select a Location"

    Examples: 
      | username          | password          |
      | testmailvasudevan | testmailvasudevan |
