import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    @Test
    public void createBoard() throws Exception{
        Board TestBoard = new Board();
    }

    @Test
    public void getHexagon() throws Exception{
        Board TestBoard = new Board();

        assert(TestBoard.getHexagon(0,0)
                instanceof Hexagon);
    }

    @Test
    public void setHexagon() throws Exception{
        Board TestBoard = new Board();

        Hexagon TestHexagon = new Hexagon();

        TestHexagon.changeTerrainTypeThoughExplosion(Terrain.ROCK);

        TestBoard.setHexagon(0,0,TestHexagon);

        Hexagon ReturnedHexagon = TestBoard.getHexagon(0,0);

        assertEquals(1, ReturnedHexagon.getLevel());

    }

    @Test
    public void getNeighborsOddX() throws Exception{
        Board TestBoard = new Board();

        Hexagon TestHexagon = new Hexagon();

        TestHexagon.changeTerrainTypeThoughExplosion(Terrain.ROCK);

        TestBoard.setHexagon(102, 101, TestHexagon);
        TestBoard.setHexagon(100, 101, TestHexagon);

        TestBoard.setHexagon(101, 100, TestHexagon);
        TestBoard.setHexagon(101, 102, TestHexagon);

        TestBoard.setHexagon(102, 100, TestHexagon);
        TestBoard.setHexagon(102, 102, TestHexagon);

        Hexagon[] neighbors = TestBoard.getNeighbors(101,101);

        for(int i=0; i<6; i++){
            assertEquals(1, neighbors[i].getLevel());
        }
    }

    @Test
    public void getNeighborsEvenX() throws Exception{
        Board TestBoard = new Board();

        Hexagon TestHexagon = new Hexagon();

        TestHexagon.changeTerrainTypeThoughExplosion(Terrain.ROCK);

        TestBoard.setHexagon(53, 52, TestHexagon);
        TestBoard.setHexagon(51, 52, TestHexagon);

        TestBoard.setHexagon(52, 51, TestHexagon);
        TestBoard.setHexagon(52, 53, TestHexagon);

        TestBoard.setHexagon(51, 51, TestHexagon);
        TestBoard.setHexagon(51, 53, TestHexagon);

        Hexagon[] neighbors = TestBoard.getNeighbors(52,52);

        for(int i=0; i<6; i++){
            assertEquals(1, neighbors[i].getLevel());
        }
    }

    @Test
    public void getNeighborsOddXEvenY() throws Exception{

        Board TestBoard = new Board();

        Hexagon TestHexagon = new Hexagon();

        TestHexagon.changeTerrainTypeThoughExplosion(Terrain.ROCK);

        TestBoard.setHexagon(70, 70, TestHexagon);
        TestBoard.setHexagon(72, 70, TestHexagon);

        TestBoard.setHexagon(70, 71, TestHexagon);
        TestBoard.setHexagon(71, 71, TestHexagon);

        TestBoard.setHexagon(70, 69, TestHexagon);
        TestBoard.setHexagon(71, 69, TestHexagon);

        Hexagon[] neighbors = TestBoard.getNeighbors(71,70);

        for(int i=0; i<6; i++){
            assertEquals(1, neighbors[i].getLevel());
        }
    }
}
