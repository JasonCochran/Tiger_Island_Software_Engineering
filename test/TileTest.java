import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TileTest {
    @Test
    public void getTerrainsClockwiseFromVolcano(){
        Tile TestTile = new Tile(Terrain.JUNGLE, Terrain.ROCK);

        Terrain[] result = TestTile.getTerrainsClockwiseFromVolcano();

        assertEquals(result[0], Terrain.VOLCANO);
        assertEquals(result[1], Terrain.JUNGLE);
        assertEquals(result[2], Terrain.ROCK);
    }
}
