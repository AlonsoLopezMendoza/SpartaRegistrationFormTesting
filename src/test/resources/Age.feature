Feature: If the user interacts with the age text box, it responds correctly
  Scenario: User is on the form and he enters data correctly into the age text box
    Given I am on the form page
    When I enter a valid string into the age text box
    Then The input is accepted for the age text box

  Scenario: User is on the form and he enters data incorrectly into the age text box
    Given I am on the form page
    When I enter an invalid string into the age text box
    Then The input is accepted for the age text box

  Scenario: User is on the form and doesn't enter data into the age text box
    Given I am on the form page
    When I don't enter anything into the age text box
    Then The input is not accepted for the age text box