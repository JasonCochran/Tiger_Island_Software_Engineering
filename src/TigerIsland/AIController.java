package TigerIsland;

import TigerIsland.*;

public class AIController implements PlayerController {
    Color color;

    public AIController(Color color){
        this.color = color;
    }

    public GameStateEndOfTurn newGameState(GameStateWTile gameStateWTile){
        GameStateBeforeBuildAction beforeBuildAction = gameStateWTile.getChildren().get(0);
        return beforeBuildAction.getChildren().get(0);
    }
}
