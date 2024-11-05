package student;

public class AI {

    public Card getPlay(Hand hand, CardPile cardPile){
        for(int i = 0; i < hand.getSize(); i++){
            if(cardPile.canPlay(hand.get(i))) return hand.get(i);
        }
        return null;
    }

    @Override
    public String toString(){
        return "Random Card AI";
    }
}
