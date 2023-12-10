package developbeginner.strategy.example;

public enum Hand {
    ROCK("Rock", 0), SCISSORS("Scissors", 1), PAPER("Paper", 2);

    private String name;
    private int value;

    private static Hand[] hands = {ROCK, SCISSORS, PAPER};

    private Hand(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static Hand getHand(int value) {
        return hands[value];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.value + 1) % 3 == hand.value) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
