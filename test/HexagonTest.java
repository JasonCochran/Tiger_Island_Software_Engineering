import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HexagonTest {
    @Test
    public void getlevel() throws Exception{
        Hexagon TestHexagon = new Hexagon();
        assertEquals(0, TestHexagon.getLevel());
    }

    @Test
    public void changeTerrainTypeThoughExplosion() throws Exception {
        Hexagon TestHexagon = new Hexagon();
        TestHexagon.changeTerrainTypeThoughExplosion(Terrain.BEACH);
        assertEquals(1, TestHexagon.getLevel());
        assertEquals(Terrain.BEACH, TestHexagon.getTerrain());
    }

    @Test
    public void isVolcanoTest() throws Exception {
        Hexagon TestHexagon = new Hexagon();
        TestHexagon.changeTerrainTypeThoughExplosion(Terrain.VOLCANO);
        assertEquals(true, TestHexagon.isVolcanoHex());
    }

    /*
    @Test
    public void populationTest() throws Exception {
        Hexagon TestHexagon = new Hexagon();
        TestHexagon.changeTerrainTypeThoughExplosion(Terrain.BEACH);
        TestHexagon.increasePopulation(2);
        assertEquals(2, TestHexagon.getPopulation());
    }
    */
}