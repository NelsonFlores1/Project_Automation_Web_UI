Feature: Test case using Selenium in ticktick page
  Scenario: Create, Edit and Delete a list
    When I am on the ticktick page
    When Log in page
    When Create List
    When Edit List
    When Delete List
    Then Quit the browser





