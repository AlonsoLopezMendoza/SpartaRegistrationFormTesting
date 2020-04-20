Feature: If the user interacts with the stream radio buttons, they responds correctly
  Scenario: User is on the form and he selects the sdet radio button
    Given I am on the form page
    When I select the sdet option in the stream radio buttons
    Then The sdet input is accepted for the stream radio buttons

  Scenario: User is on the form and he selects the devops radio button
    Given I am on the form page
    When I select the devops option in the stream radio buttons
    Then The devops input is accepted for the stream radio buttons

  Scenario: User is on the form and he doesn't select a stream radio button
    Given I am on the form page
    When I don't select a stream radio button
    Then The input for stream radio buttons is not accepted