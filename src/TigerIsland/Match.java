package TigerIsland;

public class Match implements Runnable {
    private Referee referee;
    private PostMan postMan;
    private TileBag tileBag;
    String gameID;

    Match(PostMan postMan, PlayerController player_01, PlayerController player_02, String gameID) {
        OutputPlayerAI output = new OutputPlayerAI(gameID, Color.BLACK, postMan);
        this.postMan = postMan;
        this.gameID = gameID;
        this.tileBag = new NetworkTileBag(this.postMan, this.gameID);
        this.referee = new Referee(player_01, player_02, output, tileBag);
    }

    public void run() {
        referee.execute();
    }
}