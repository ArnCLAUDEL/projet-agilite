Feature: Engine cleaned by engineers
As an engineer
I would like to remove an engine from a rocket
So I can clean it

  Scenario: Clean an engine
    Given an engine in a rocket
    When an engineer cleans the engine
    Then the rocket no longer have the engine
    And the engine is clean