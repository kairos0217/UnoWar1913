package student;

public class UnoWarMatch {

    AI ai1, ai2;

    /**
     * Holds two ais to battle each other.
     * @param ai1 - first ai
     * @param ai2 - second ai
     */
    public UnoWarMatch(AI ai1, AI ai2) {
        this.ai1 = ai1;
        this.ai2 = ai2;
    }

    /**
     * Plays 10 rounds of UnoWar between the ai fields.
     * @return whether ai1 won or not
     */
    public boolean playGame() {
        Deck curDeck = new Deck();
        int count1 = 0;
        int count2 = 0;
        Hand hand1 = new Hand(curDeck, 5);
        Hand hand2 = new Hand(curDeck, 5);
        Card cur1, cur2; //empty to hold prev
        boolean prevWinner = true; //true if ai1, false if ai2
        while (count1 < 10 && count2 < 10) {
            CardPile curPile = new CardPile(curDeck.draw()); //resets every round
            boolean roundOver = false; //resets every round
            while (!roundOver) {
                if (prevWinner) { //prevWinner indicates the opposite of whoever moved last,
                    cur1 = ai1.getPlay(hand1, curPile); // so it is used to tell who won and who's turn is up
                    if (curPile.canPlay(cur1)) {
                        curPile.play(cur1);
                        hand1.remove(cur1);
                    } else {
                        count2++;
                        roundOver = true;
                    }
                    prevWinner = false;
                } else {
                    cur2 = ai2.getPlay(hand2, curPile);
                    if (curPile.canPlay(cur2)) {
                        curPile.play(cur2);
                        hand2.remove(cur2);
                    } else {
                        count1++;
                        roundOver = true;
                    }
                    prevWinner = true;
                }
            }

        }
        return count1 == 10;
    }

    /**
     * Calculate winrate of ai1 vs ai2
     * @param nTrials amount of trials to test on
     * @return ai1 win rate
     */
    public double winRate(int nTrials) {
        double wins1 = 0;
        double wins2 = 0;
        for (int i = 0; i < nTrials; i++) {
            if (playGame()) {
                wins1++;
            } else {
                wins2++;
            }
        }

        return wins1 / ((double) nTrials);
    }


}
