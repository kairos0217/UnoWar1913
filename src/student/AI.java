package student;

public class AI {

    /**
     * Draw first playable card left to right from deck
     * @param hand to draw from
     * @param cardPile to draw to
     * @return first playable hand, null if none
     */
    public Card getPlay(Hand hand, CardPile cardPile){
        for(int i = 0; i < hand.getSize(); i++){
            if(cardPile.canPlay(hand.get(i))) {
                return hand.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return "Random Card AI";
    }
}
