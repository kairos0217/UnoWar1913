package student;

public class SmallestCardAI extends AI{
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card returned = null;
        for(int i = 0; i < hand.getSize(); i++){
            Card cur = hand.get(i);
            if(cardPile.canPlay(cur)){
                if(returned == null || cur.getRankNum() < returned.getRankNum()){
                    returned = cur;
                }
            }
        }
        return returned;
    }

    @Override
    public String toString(){
        return "Smallest Card AI";
    }
}
