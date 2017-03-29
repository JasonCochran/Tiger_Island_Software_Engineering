Feature: Settlement

#Settlement scenario test
Scenario: Settlement Size is 1
    Given I have initialized the players
    And I have initialized a board
    When I placed a tile without restrictions at 98, 100 with terrain ROCK, JUNGLE and direction LOWERLEFT
    When Player 1 places a meeple at 97,99
    Then the settlement at 97,99 should be 1 for player 1

Scenario: Settlement Size is 2
    Given I have initialized a player
    And initialized a board and placed a tile on it
    And I have placed a meeple on both non-volcanic level 1 hexagons on the board
    When I ask for the settlement size of a Meeple’s hexagon
    Then I receive 2

Scenario: Settlement Size of 1 stops tile placement
    Given I have initialized a board
	And placed two tiles adjacent to each other with two touching hexagons across tiles
	And the tiles have adjacent volcanoes
	And There is a meeple on a non-volcano hexagon which is adjacent to both volcanos
	And There are no other meeples on the board
    When I attempt to place a tile on a volcano so it overlaps onto the other tile
	And The tile would overwrite the meeple
    Then The operation should fail




