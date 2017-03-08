public class Player {

    private int score;
    private int meepleCount;
    private int totoroCount;

    Player() {
        meepleCount = 20;
        totoroCount = 3;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void modifyScore(int newScore) {
        this.score = newScore;
    }

    public void setAutoLoseScore() {
        this.score = -1;
    }

    public void meeplePlacementCountReduction(int level) {
        meepleCount = meepleCount - ( level * level );
    }
}
