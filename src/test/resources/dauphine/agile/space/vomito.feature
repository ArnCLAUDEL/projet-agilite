Feature: Vomit bag under the pilot sit
As a pilot during take-off
I would like to have access to a vomit bag
So the cockpit remains clean when I'm sick

  Scenario: Basic use case
    Given a pilot in a rocket
    When the rocket takes off
    Then the pilot is sick
    And the pilot uses a vomit bag
    And the cockpit remains clean