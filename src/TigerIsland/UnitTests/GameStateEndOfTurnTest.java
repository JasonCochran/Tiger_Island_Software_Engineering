package TigerIsland.UnitTests;

import TigerIsland.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameStateEndOfTurnTest {
    @Test
    public void testChildrenStart() {
        GameStateEndOfTurn testGameState = GameStateEndOfTurn.createInitalGameState();

        GameStateWTile testGameStateTile = testGameState.getChild(new Tile(Terrain.JUNGLE, Terrain.JUNGLE));

        ArrayList<GameStateBeforeBuildAction> tile_children = testGameStateTile.getChildren();

        GameStateBeforeBuildAction beforeBuildAction = tile_children.get(0);

        ArrayList<GameStateEndOfTurn> final_children = beforeBuildAction.getChildren();

        int num_children = final_children.size();

        assertEquals(7, num_children);
        assertEquals(false, final_children.get(0).isMyTurn(Color.WHITE));
        assertEquals(true, final_children.get(0).isMyTurn(Color.BLACK));
    }
}
