Feature: Escape pod for the pilot
As a pilot when a problem occurs during take-off 
I can use an escape pod
So I can stay alive

  Scenario: Emmergency
    Given a pilot in a rocket
    When the rocket takes off
    And a problem occurs
    Then the escape pod is ejected
    And the pilot is inside the escape pod