Feature: Escape pod for the pilot
As a pilot when a problem occurs during take-off 
I can use an escape pod
So I can stay alive

  Scenario: Emmergency
    Given a pilot in new rocket with escapePod
    When the rocket takes off
    And a problem occurs
    Then the escape pod is ejected
    And the pilot is inside the escape pod
    
  Scenario: fix #1 escape pod should be mandatory
  	Given a pilot in new rocket without escapePod
  	When the rocket takes off
  	Then the rocket sticks to ground