Feature: If the user interacts with the city text box, it responds correctly
  Scenario: User is on the form and he enters data correctly into the city text box
    Given I am on the form page
    When I enter a valid string into the city text box
    Then The input is accepted for the city text box

  Scenario: User is on the form and doesn't enter data into the city text box
    Given I am on the form page
    When I don't enter anything into the city text box
    Then The input is not accepted for the city text box