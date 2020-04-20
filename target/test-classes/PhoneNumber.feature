Feature: If the user interacts with the phone number text box, it responds correctly
  Scenario: User is on the form and he enters data correctly into the phone number text box
    Given I am on the form page
    When I enter a valid string into the phone number text box
    Then The input is accepted for the phone number text box

  Scenario: User is on the form and doesn't enter data intophone number text box
    Given I am on the form page
    When I don't enter anything into the phone number text box
    Then The input is not accepted for the phone number text box

  Scenario: User is on the form and he enters data incorrectly into the phone number text box
    Given I am on the form page
    When I enter a invalid string into the phone number text box
    Then The input is not accepted for the phone number text box

