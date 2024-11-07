package student;

public class BiggestCardAI extends AI{

    /**
     *  get biggest playable card from hand.
     * @param hand to draw from
     * @param cardPile to draw to
     * @return biggest playable card, null if none
     */
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card returned = null;
        for(int i = 0; i < hand.getSize(); i++){
            Card cur = hand.get(i);
            if(cardPile.canPlay(cur)){
                if(returned == null || cur.getRankNum() > returned.getRankNum()){
                    returned = cur;
                }
            }
        }
        return returned;
    }

    /**
     * @return string rep of biggestAI.
     */
    @Override
    public String toString(){
        return "Biggest Card AI";
    }
}
