Feature: If the user interacts with the email text box, it responds correctly
  Scenario: User is on the form and he enters data correctly into the email text box
    Given I am on the form page
    When I enter a valid string into the email text box
    Then The input is accepted for the email text box

  Scenario: User is on the form and doesn't enter data into the email text box
    Given I am on the form page
    When I don't enter anything into the email text box
    Then The input is not accepted for the email text box

  Scenario: User is on the form and he enters data incorrectly into the email text box
    Given I am on the form page
    When I enter a invalid string into the email text box
    Then The input is not accepted for the email text box

