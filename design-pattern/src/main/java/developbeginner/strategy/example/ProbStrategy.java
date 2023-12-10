package developbeginner.strategy.example;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevValue = 0;
    private int currValue = 0;

    private int[][] history = {
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1},
    };

    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currValue));
        int value = 0;
        if (bet < history[currValue][0]) {
            value = 0;
        } else if (bet < history[currValue][0] + history[currValue][1]) {
            value = 1;
        } else {
            value = 2;
        }
        prevValue = currValue;
        currValue = value;
        return Hand.getHand(value);
    }

    private int getSum(int value) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[value][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[prevValue][currValue]++;
        } else {
            history[prevValue][(currValue + 1) % 3]++;
            history[prevValue][(currValue + 2) % 3]++;
        }
    }
}
