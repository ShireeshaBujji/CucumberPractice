
@test
Feature: open demo site
  @demo
  Scenario: Automation demo site
    Given the user lunch the browser
    When  user hit the url
    Then the user able to see register form

   @login
  Scenario: orange hrm application login
    Given open url
    When enter username
    And enter password
    And click on login button
    Then user login successfull
     And the user see "the user successfully loggin to orange HRM"



