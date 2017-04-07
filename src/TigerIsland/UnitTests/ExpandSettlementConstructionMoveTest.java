package TigerIsland.UnitTests;

import TigerIsland.*;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ExpandSettlementConstructionMoveTest {
    private Board startBoard(){
       Board board = new Board();
       board.placeStartingTile();
       return board;
    }

    @Test
    public void basic_test(){
        Board board = startBoard();

        Coordinate upperRight = new Coordinate(100, 100).getNeighboringCoordinate(HexagonNeighborDirection.UPPERRIGHT);

        Color Player_Color = Color.WHITE;
        Player player_1 = new Player(Player_Color);

        // Place a meeple down on upperright
        FoundSettlementConstructionMove move1 = new FoundSettlementConstructionMove(upperRight);

        assertEquals(1, move1.numberPiecesRequiredToPreformMove(player_1, board));

        move1.makeValidMoveAndReturnPointsGained(player_1, board);

        /// Expand a settlement to the adjacent Jungle hexagon
        ExpandSettlementConstructionMove move2 = new ExpandSettlementConstructionMove(upperRight, Terrain.JUNGLE);

        assertEquals(1, move2.numberPiecesRequiredToPreformMove(player_1, board));

        move2.makeValidMoveAndReturnPointsGained(player_1, board);

        Coordinate upperLeft = new Coordinate(100, 100).getNeighboringCoordinate(HexagonNeighborDirection.UPPERLEFT);

        assertEquals(true, board.getHexagon(upperLeft).containsPieces());
        assertEquals(HexagonOccupationStatus.MEEPLE , board.getHexagon(upperLeft).getOccupationStatus());
        assertEquals(Player_Color, board.getHexagon(upperLeft).getOccupationColor());
    }
}
