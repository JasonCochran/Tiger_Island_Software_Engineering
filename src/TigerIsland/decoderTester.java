package TigerIsland;

import java.util.concurrent.TimeUnit;

/**
 * opponent pid = 34 and 45
 * pid = 65
 */
public class decoderTester {
    public static void main(String[] args) throws InterruptedException {
        String[] messages = {
                "NEW CHALLENGE 346 YOU WILL PLAY 2 MATCHES",
                "BEGIN ROUND 1 OF 2",
                "NEW MATCH BEGINNING NOW YOUR OPPONENT IS PLAYER 34",
                "blah blah",
                "test",
                "blah",
                "gg",
                "GAME A OVER PLAYER 65 100 PLAYER 34 5",
                "GAME B OVER PLAYER 65 200 PLAYER 34 150",
                "END OF ROUND 1 OF 2 WAIT FOR THE NEXT MATCH",
                "BEGIN ROUND 2 OF 2",
                "NEW MATCH BEGINNING NOW YOUR OPPONENT IS PLAYER 45",
                "blah blah",
                "test",
                "blah",
                "gg",
                "GAME A OVER PLAYER 65 100 PLAYER 45 5",
                "GAME B OVER PLAYER 65 200 PLAYER 45 150",
                "END OF ROUND 2 OF 2",
                "WAIT FOR THE NEXT CHALLENGE TO BEGIN",
                "NEW CHALLENGE 888 YOU WILL PLAY 1 MATCH",
                "BEGIN ROUND 1 OF 1",
                "NEW MATCH BEGINNING NOW YOUR OPPONENT IS PLAYER 55",
                "blah blah",
                "test",
                "blah",
                "gg",
                "GAME A OVER PLAYER 65 100 PLAYER 55 12",
                "GAME B OVER PLAYER 65 200 PLAYER 55 14",
                "END OF ROUND 1 OF 1",
                "END OF CHALLENGES"
        };

        for (String s : messages) {
            if (s.equals("NEW CHALLENGE 888 YOU WILL PLAY 1 MATCH")) {
                TimeUnit.SECONDS.sleep(5);
            }
            PostMan.decoder(s);
            TimeUnit.SECONDS.sleep(1);
        }

    }
}
