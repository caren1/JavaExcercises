package BowlingGameTest;

import BowlingGame.BowlingGame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest1 {

    private BowlingGame g;

    private void rollSameNumberOfPinsEachTime(int pins, int times) {
        for (int i = 0; i < times; i++) {
            g.roll(pins);
        }
    }

    @Before
    public void createBowlingGame() {
        g = new BowlingGame();

    }

    @Test
    public void testAllZeros() {
        //given
        // BowlingGame g = new BowlingGame();

        //when
//        for (int i = 0; i < 20; i++) {
//            g.roll(0);
//        }
        //then
        rollSameNumberOfPinsEachTime(0, 20);
        Assert.assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() {
        //given
        // BowlingGame g = new BowlingGame();

        //when
//        for (int i = 0; i < 20; i++) {
//            g.roll(1);
//        }
//        //then
        rollSameNumberOfPinsEachTime(1, 20);
        Assert.assertEquals(20, g.score());
    }

    @Test
    public void testSpare() {
        rollSameNumberOfPinsEachTime(0, 16);
        g.roll(9);
        g.roll(1);
        g.roll(2);
        g.roll(3);

        Assert.assertEquals(17, g.score());
    }


    @Test
    public void testSpareOnEnd() {
        rollSameNumberOfPinsEachTime(0, 18);

        g.roll(9);
        g.roll(1);
        g.roll(2);

        Assert.assertEquals(12, g.score());
    }

    @Test
    public void testStrike() {
        rollSameNumberOfPinsEachTime(0, 16);
        g.roll(10);
        g.roll(2);
        g.roll(3);

        Assert.assertEquals(20, g.score());
    }

    @Test
    public void testStrikeOnEnd() {
        rollSameNumberOfPinsEachTime(0, 18);
        g.roll(10);
        g.roll(2);

        Assert.assertEquals(12, g.score());
    }
    @Test
    public void testStrikesOnly(){
        rollSameNumberOfPinsEachTime(10,20);
        Assert.assertEquals(290,g.score());
    }
}
