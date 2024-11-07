package student;

public class SmallestCardAI extends AI{

    /**
     * Get smallest playable card.
     * @param hand hand to draw from
     * @param cardPile to draw to
     * @return smallest playable card / null if none
     */
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card returned = null;
        for (int i = 0; i < hand.getSize(); i++) {
            Card cur = hand.get(i);
            if (cardPile.canPlay(cur)) {
                if (returned == null || cur.getRankNum() < returned.getRankNum()) {
                    returned = cur;
                }
            }
        }
        return returned;
    }

    /**
     * @return toString rep of smallestAI.
     */
    @Override
    public String toString(){
        return "Smallest Card AI";
    }
}
