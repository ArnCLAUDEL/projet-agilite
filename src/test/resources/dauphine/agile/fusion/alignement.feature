Feature: Un utilisateur de la force peut changer d alignement force ou cote obscur en fonction de son karma

  Scenario: Quand un maitre a un bon karma, il devient membre de la force
    Given Un maitre A
    When a sa creation ou si son karma est supérieur a O
    Then Il/elle est un membre de la force

  Scenario: Quand un maitre a un mauvais karma, il rejoint le côté obscur
    Given Un maitre B
    When : si son karma est inférieur à 0
    Then il/elle est un membre du côté obscur
