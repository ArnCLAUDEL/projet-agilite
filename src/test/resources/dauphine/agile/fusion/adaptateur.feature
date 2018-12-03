Feature: On veut pouvoir qu’un utilisateur de la force puisse piloter un vaisseau spatial

  Scenario: A la suite de cette formation, le maitre Jedi obtient un adapteur qui va lui permettre de piloter la fusee.
    Given Un maitre
    When Après sa formation au sein de la NASA
    Then Le maitre peut conduire le vaisseau spatial

  Scenario: A la suite de cette formation, le padawan obtient un adapteur qui va lui permettre de piloter la fusee.
    Given Un padawan
    When Après sa formation padawan au sein de la NASA
    Then Le padawan peut conduire le vaisseau spatial
