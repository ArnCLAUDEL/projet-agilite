Feature: Le comportement du maitre varie en fonction de son alignement

  Scenario: Quand un maitre choisi le cote de la force il doit pouvoir mediter calmement
    Given Un maitre bon
    When Quand le maitre bon attaque
    Then Elle/il medite

  Scenario: Quand un maitre rejoint le cote obscur il doit pouvoir lancer des eclairs
    Given Un maitre mauvais
    When : Quand le maitre mauvais attaque
    Then Elle/il lance des eclairs
