Feature: If the user interacts with the last name text box, it responds correctly
  Scenario: User is on the form and he enters data correctly into the last name text box
    Given I am on the form page
    When I enter a valid string into the last name text box
    Then The input is accepted for the last name text box

  Scenario: User is on the form and doesn't enter data into the last name text box
    Given I am on the form page
    When I don't enter anything into the last name text box
    Then The input is not accepted for the last name text box