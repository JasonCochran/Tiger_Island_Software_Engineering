package TigerIsland;

import java.util.ArrayList;

public class GameStateWTile extends GameState {
    private Tile tile;

    GameStateWTile(GameState original, Tile tile) {
        super(original);
        this.tile = tile;
    }

    public ArrayList<GameStateBeforeBuildAction> getChildren(){
       ArrayList<GameStateBeforeBuildAction> result = new ArrayList<GameStateBeforeBuildAction>();
       for(int i = 2; i < 198; i++){
           for(int j= 2; j < 198; j++){
               for(HexagonNeighborDirection direction : HexagonNeighborDirection.values()){
                   TileMove possibleTileMove = new TileMove(tile, direction, new Coordinate(i, j));
                   GameStateBeforeBuildAction child = GameStateBeforeBuildAction.createGameStateBeforeBuildAction(this, possibleTileMove);

                   if(child != null){
                       result.add(child);
                   }
               }
           }
       }

       return result;
    }
}
