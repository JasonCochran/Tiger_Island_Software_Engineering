package TigerIsland;

public class TotoroConstructionMove extends ConstructionMoveJustCoordinate {
    // Constructor
    public TotoroConstructionMove(Coordinate coordinate) {
        super(coordinate);
    }

    // Methods
    @Override
    public boolean canPerformMove(Player player, Board board) {
        Color color = player.getColor();
        Hexagon hexagon = board.getHexagonAt(coordinate);

        if( hexagon.isVolcano() || hexagon.containsPieces() || hexagon.getLevel() == 0 ) {
            return false;
        }

        Coordinate[] neighbors = coordinate.getNeighboringCoordinates();
        for(int i = 0; i < 6; i++){
            // TODO Need to test case where we place next to another players settlement...
            Settlement settlement = board.getSettlement(neighbors[i]);
            if(settlement.getSettlementSize() >= 5 && !settlement.getSettlementContainsTotoro(board) &&
                    color == board.getHexagonAt(neighbors[i]).getOccupationColor() ){
                return player.getTotoroCount() != 0;
            }
        }

        return false;
    }

    @Override
    public void makePreverifiedMove(Player player, Board board) {
        player.subtractTotoro();
        Hexagon hexagon = board.getHexagonAt(coordinate);
        hexagon.setOccupationStatus(player.getColor(), PieceStatusHexagon.TOTORO);
        player.addScore(200);
    }
}