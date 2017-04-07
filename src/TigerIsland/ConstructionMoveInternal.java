package TigerIsland;

public interface ConstructionMoveInternal{
    void makeValidMoveAndReturnPointsGained(Player player, Board board);
    boolean canBeKilled();
    HexagonOccupationStatus getOccupyStatus();

    // This returns the number of pieces necessary to preform the move,
    // but can be placed at a large sentinal value (1000) to indicate the
    // move is impossible, such as when another piece is already on the
    // hexagon.
    int numberPiecesRequiredToPreformMove(Player player, Board board);
}
