@Login
Feature: Verify AdactinHotel Login Page

  Scenario Outline: Verify  login page with Valid Credentials
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" and login
    Then User should verify success message after login page "Hello testmailvasudevan!"

    Examples: 
      | username          | password          |
      | testmailvasudevan | testmailvasudevan |

  Scenario Outline: Verify  login page with Enter Key
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" login with Enter Key
    Then User should verify success message after login page "Hello testmailvasudevan!"

    Examples: 
      | username          | password          |
      | testmailvasudevan | testmailvasudevan | 

  Scenario Outline: Verify  login page with Invalid Credentials
    Given User is on AdactionHotel home page
    When User should enter the "<username>" , "<password>" and login
    Then User verify login page after error message contains "Invalid Login details or Your Password might have expired."

    Examples: 
      | username          | password           |
      | testmailvasudevan | testmailvasudevan1 |
