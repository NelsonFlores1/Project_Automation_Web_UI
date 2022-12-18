Feature: Test case using Selenium in ticktick.com
  Scenario: Create, Edit and Delete a list
    Given I am on the ticktick page
    When Log in page
    And Verify if you are logged in
    When Create List
    And Verify if the list was created
    When Edit List
    And Verify if the list was edited
    When Delete List
    Then Quit the browser





