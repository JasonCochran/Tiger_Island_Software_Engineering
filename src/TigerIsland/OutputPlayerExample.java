package TigerIsland;

public class OutputPlayerExample implements  OutputPlayerActions{
    private Color color;
    private String gid;

    OutputPlayerExample(String gid, Color colors){
        this.gid = gid;
        this.color = color;
    }

    public void dispatchInformation(GameStateEndOfTurn gameStateEndOfTurn, PlayerController playerController){
        //new GameMoveOutgoingTransmission(gid, moveNumber, tileMove, convertConstructionMove(constructMove));
    }

}
