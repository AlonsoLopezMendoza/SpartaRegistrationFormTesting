Feature: If the user interacts with the degree text box, it responds correctly
  Scenario: User is on the form and he enters data correctly into the degree text box
    Given I am on the form page
    When I enter a valid string into the degree text box
    Then The input is accepted for the degree text box

  Scenario: User is on the form and doesn't enter data into the degree text box
    Given I am on the form page
    When I don't enter anything into the degree text box
    Then The input is not accepted for the degree text box