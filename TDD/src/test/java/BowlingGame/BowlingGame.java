package BowlingGame;

public class BowlingGame {

    private int currentRoll;
    private int[] resultsRolls;

    public int getResult() {
        return currentRoll;
    }

    public void setResult(int result) {
        this.currentRoll = result;
    }

    public BowlingGame() {
        this.currentRoll = 0;
        resultsRolls = new int[21];

    }

    public void roll(int pins) {
        resultsRolls[currentRoll++] = pins;

    }

    public int score() {
        int result = 0;
        int frameIndex = 0;

        for (int i = 0; i < 20; i += 2) {
            if (isStrike(resultsRolls[frameIndex])) {
                result += 10 + resultsRolls[frameIndex + 1] + resultsRolls[frameIndex + 2];
                frameIndex++;

            } else if (isSpare(frameIndex)) {
                result += spareBonus(frameIndex);
                frameIndex += 2;

            } else {
                result += resultsRolls[frameIndex] + resultsRolls[frameIndex + 1];
                frameIndex += 2;
            }
        }
        return result;

    }

    private int spareBonus(int frameIndex) {
        return 10 + resultsRolls[frameIndex + 2];
    }

    private boolean isSpare(int frameIndex) {
        return resultsRolls[frameIndex] + resultsRolls[frameIndex + 1] == 10;
    }

    private boolean isStrike(int resultsRoll) {
        return resultsRoll == 10;
    }
}
